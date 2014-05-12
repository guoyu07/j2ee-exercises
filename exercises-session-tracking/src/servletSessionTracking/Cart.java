package servletSessionTracking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Cart
 */
@WebServlet("/cart")
public class Cart extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		Map<String,Integer> items = (Map<String, Integer>) session.getAttribute("items");
		
		if(items == null) {
			items = new HashMap<>();
		}
		
		synchronized (session) {
			String[] newItems = request.getParameterValues("item");
			if(newItems != null) {
				for(String newItem : newItems) {
					if(!newItem.trim().equals("")) {
						Integer itemCount = items.get(newItem);
						if(itemCount == null) {
							itemCount = 0;
						}
						items.put(newItem, ++itemCount);
					}
				}
			}
			session.setAttribute("items", items);
			
			StringBuilder builder = new StringBuilder();
			builder.append("<!DOCTYPE html>")
			.append("<html>")
			.append("<head>")
			.append("<title>Cart</title>")
			.append("</head>")
			.append("<body>")
			.append("<h1>Cart</h1>")
			.append("<table>");
			
			for(String itemName : items.keySet()) {
				builder.append("<tr>")
				.append("<td>")
				.append(itemName)
				.append("</td>")
				.append("<td>")
				.append(items.get(itemName))
				.append("</td>")
				.append("</tr>");
			}
			
			builder.append("</table>")
			.append("</body>")
			.append("</html>");

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println(builder.toString());
		}
	}
}
