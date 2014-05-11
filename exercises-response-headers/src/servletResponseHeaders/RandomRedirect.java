package servletResponseHeaders;

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
		String location;
		if(Math.random() < 0.5) {
			location = "http://www.google.com";
		} else {
			location = "http://www.bing.com";
		}
		response.setStatus(HttpServletResponse.SC_FOUND);
		response.setHeader("Location", location);
	}

}
