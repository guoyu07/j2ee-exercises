package coreservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RandomRedirect
 */
@WebServlet("/random-redirect")
public class RandomRedirect extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(Math.random() < 0.5) {
			response.sendRedirect("http://www.google.com");
		} else {
			response.sendRedirect("http://www.bing.com");
		}
	}

}
