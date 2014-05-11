package servletStatusCodes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NineWpOneNyt
 */
@WebServlet("/nine-wp-one-nyt")
public class NineWpOneNyt extends HttpServlet {
	private static long field = 1;
	
	public boolean isMultipleOfTen(long num) {
		return (num % 10) == 0;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if(isMultipleOfTen(field)) {
			response.sendRedirect("http://www.nytimes.com");
		} else {
			response.sendRedirect("http://www.washingtonpost.com");
		}
		field++;
	}
}
