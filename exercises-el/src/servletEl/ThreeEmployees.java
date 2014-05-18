package servletEl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domainEl.Addess;
import domainEl.Employee;
import domainEl.Name;

/**
 * Servlet implementation class ThreeEmployees
 */
@WebServlet("/three-employees")
public class ThreeEmployees extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Employee[] employees = {
				new Employee(new Name("Mickey", "Mouse"), new Addess("Main street", "Mouseton", "US123")),
				new Employee(new Name("Donald", "Duck"), new Addess("Second street", "Duckburg", "US123")),
				new Employee(new Name("Minnie", "Mouse"), new Addess("Main street", "Mouseton", "US123"))
		};
		request.setAttribute("employees", employees);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/responses/three-employees.jsp");
		dispatcher.forward(request, response);
	}

}
