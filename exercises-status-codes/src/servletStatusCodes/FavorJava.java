package servletStatusCodes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FavorJava
 */
@WebServlet("/favor-java")
public class FavorJava extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String favoriteLanguage = request.getParameter("favoriteLanguage");
		if(favoriteLanguage != null && favoriteLanguage.equalsIgnoreCase("Java")) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>"
					+ "<html>"
					+ "<head>"
					+ "<title>Welcome</title>"
					+ "</head>"
					+ "<body>"
					+ "<h1>You are welcome, Java fan!</h1>"
					+ "</body>"
					+ "</html>");
		} else {
			response.sendError(HttpServletResponse.SC_NOT_FOUND, "You are not a Java fan!");
		}
	}
}
