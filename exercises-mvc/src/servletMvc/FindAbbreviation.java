package servletMvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domainMvc.StatePair;
import repositoryMvc.StateMapRepository;
import repositoryMvc.StateRepository;

/**
 * Servlet implementation class FindAbbreviation
 */
@WebServlet("/find-abbreviation")
public class FindAbbreviation extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String stateName = request.getParameter("stateName");
		StateRepository repository = new StateMapRepository();
		StatePair statePair = repository.getStatePair(stateName);
		

		HttpSession session = request.getSession();
		synchronized (session) {
			if(statePair == null) {
				statePair = (StatePair) session.getAttribute("statePair");
			} else {
				session.setAttribute("statePair", statePair);
			}
			
			String address;
			if(statePair != null) {
				request.setAttribute("statePair", statePair);
				address = "/WEB-INF/results/show-state.jsp";
			} else if(stateName == null) {
				address = "/WEB-INF/results/missing-value.jsp";
			} else {
				request.setAttribute("badName", stateName);
				address = "/WEB-INF/results/unknown-state.jsp";
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(address);
			dispatcher.forward(request, response);
		}
	}

}
