package servletEl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreeStrings
 */
@WebServlet("/three-strings")
public class ThreeStrings extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] strings = {"Mickey", "Donald", "Minnie"};
		request.setAttribute("strings", strings);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/responses/three-strings.jsp");
		dispatcher.forward(request, response);
	}

}
