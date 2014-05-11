package servletRequestHeaders;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Wizard2
 */
@WebServlet("/wizard-two")
public class WizardTwo extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String refererTo = ServletUtil.getWizardPage(request, "one");
		if(!ServletUtil.isRefererTo(request, refererTo)) {
			response.sendRedirect(refererTo);
		} else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>"
					+ "<html>"
					+ "<head>"
					+ "<title>Wizard 2</title>"
					+ "</head>"
					+ "<body>"
					+ "<h1>Welcome on 2nd wizard page</h1>"
					+ "</body>"
					+ "</html>");
		}
	}
}
