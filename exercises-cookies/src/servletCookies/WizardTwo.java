package servletCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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

		boolean wizardOneVisited = false;
		Cookie[] cookies = request.getCookies();

		if(cookies != null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("WIZARD_ONE") && cookie.getValue().equals("visited")) {
					wizardOneVisited = true;
					break;
				}
			}
		}

		if(!wizardOneVisited) {
			response.sendRedirect("/exercises-cookies/wizard-one");
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
