package servletSessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Greeting
 */
@WebServlet("/greeting")
public class Greeting extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		synchronized(session) {
			String title;
			Integer accessCount = (Integer)session.getAttribute("accessCount");
			
			if(accessCount == null) {
				title = "Welcome Aboard";
				accessCount = 0;
			} else {
				title = "Welcome Back";
				accessCount++;
			}
			
			session.setAttribute("accessCount", accessCount);
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE>"
					+ "<html>"
					+ "<head>"
					+ "<title>" + title + "</title>"
					+ "</head>"
					+ "<body>"
					+ "<h1>" + title + "</h1>"
					+ "</body>"
					+ "</html>");
		}
	}

}
