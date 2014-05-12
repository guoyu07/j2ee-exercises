package servletSessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registry
 */
@WebServlet("/registry")
public class Registry extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = ServletUtil.getParam("firstName", request);
		String lastName = ServletUtil.getParam("lastName", request);
		String emailAddress = ServletUtil.getParam("emailAddress", request);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE>"
				+ "<html>"
				+ "<head>"
				+ "<title>Registry</title>"
				+ "</head>"
				+ "<body>"
				+ "<h1>Registry</h1>"
				+ "<ul>"
				+ "<li>First name: " + firstName + "</li>"
				+ "<li>Last name: " + lastName + "</li>"
				+ "<li>Email address: " + emailAddress + "</li>"
				+ "</ul>"
				+ "</body>"
				+ "</html>");

	}
}
