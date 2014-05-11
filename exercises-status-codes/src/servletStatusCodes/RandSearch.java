package servletStatusCodes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RandSearch
 */
@WebServlet("/rand-search")
public class RandSearch extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double num = Math.random();
		if(num < 0.5d) {
			response.sendRedirect("http://www.google.com");
		} else {
			response.sendRedirect("http://www.bing.com");
		}
	}
}
