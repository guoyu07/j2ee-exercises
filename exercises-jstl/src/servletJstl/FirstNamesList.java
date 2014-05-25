package servletJstl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repositoryJstl.FirstNamesArrayListRepository;
import repositoryJstl.FirstNamesRepository;

/**
 * Servlet implementation class FirstNames
 */
@WebServlet("/first-names-list")
public class FirstNamesList extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FirstNamesRepository repository = new FirstNamesArrayListRepository();
		List<String> firstNames = repository.getFirstNames();
		request.setAttribute("firstNames", firstNames);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/responses/first-names-list.jsp");
		dispatcher.forward(request, response);
	}

}
