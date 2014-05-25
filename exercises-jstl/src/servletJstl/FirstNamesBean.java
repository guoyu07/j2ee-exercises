package servletJstl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domainJstl.Names;

/**
 * Servlet implementation class FirstNames
 */
@WebServlet("/first-names-bean")
public class FirstNamesBean extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Names names = new Names("Mickey","Donald","Minnie");
		request.setAttribute("names", names);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/responses/first-names-bean.jsp");
		dispatcher.forward(request, response);
	}

}
