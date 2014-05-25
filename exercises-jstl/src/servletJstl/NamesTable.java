package servletJstl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repositoryJstl.NameArrayListRepository;
import repositoryJstl.NameRepository;
import domainJstl.Name;

/**
 * Servlet implementation class NameTable
 */
@WebServlet("/names-table")
public class NamesTable extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		NameRepository repository = new NameArrayListRepository();
		List<Name> names = repository.getNames();
		request.setAttribute("names", names);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/responses/names-table.jsp");
		dispatcher.forward(request, response);
	}
}
