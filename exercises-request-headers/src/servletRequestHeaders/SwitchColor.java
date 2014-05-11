package servletRequestHeaders;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SwitchColor
 */
@WebServlet("/switch-color")
public class SwitchColor extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String body = "";
		if(ServletUtil.isChrome(request)) {
			body = "<body bgcolor=\"red\" text=\"yellow\">"
					+ "<h1>Hello, Chrome user!</h1>"
					+ "</body>";
		} else {
			body = "<body bgcolor=\"yellow\" text=\"red\">"
					+ "<h1>Hello, non-Chrome user!</h1>"
					+ "</body>";
		}
		out.println("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<title>Switch color</title>"
				+ "</head>"
				+ body
				+ "</html>");
	}
}
