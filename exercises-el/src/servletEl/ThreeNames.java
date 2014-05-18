package servletEl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domainEl.Name;

/**
 * Servlet implementation class ThreeNames
 */
@WebServlet("/three-names")
public class ThreeNames extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Name> names = new ArrayList<Name>();
		names.add(new Name("Mickey", "Mouse"));
		names.add(new Name("Donald", "Duck"));
		names.add(new Name("Minnie", "Mouse"));

		request.setAttribute("names", names);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/responses/three-names.jsp");
		dispatcher.forward(request, response);
	}

}
