package coreservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Wizard1
 */
@WebServlet("/wizard-one")
public class WizardOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String href = ServletUtil.getWizardPage(request, "two");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<title>Wizard 1</title>"
				+ "</head>"
				+ "<body>"
				+ "<h1>Welcome on 1st wizard page</h1>"
				+ "<a href=\"" + href + "\">Go to 2nd wizard page</a>"
				+ "</body>"
				+ "</html>");
	}
}
