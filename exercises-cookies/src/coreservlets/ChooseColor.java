package coreservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChooseColor
 */
@WebServlet("/choose-color")
public class ChooseColor extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String foreground = "#000000";
		String background = "#FFFFFF";
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("foreground")) {
					foreground = cookie.getValue();
				}
				if(cookie.getName().equals("background")) {
					background = cookie.getValue();
				}
			}
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE>"
				+ "<html>"
				+ "<head>"
				+ "<title>Choose color</title>"
				+ "</head>"
				+ "<body>"
				+ "<h1>Choose color</h1>"
				+ "<form method=\"post\">"
				+ "<p><label for=\"\">Foreground:</label><input type=\"color\" name=\"foreground\" value=\"" + foreground + "\"></p>"
				+ "<p><label for=\"\">Background:</label><input type=\"color\" name=\"background\" value=\"" + background + "\"></p>"
				+ "<p><input type=\"submit\"></p>"
				+ "</form>"
				+ "</body>"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String foreground = request.getParameter("foreground");
		String background = request.getParameter("background");
		
		if(foreground != null && !foreground.trim().equals("")) {
			Cookie cookie = new Cookie("foreground", foreground);
			cookie.setMaxAge(60*60*24*365);
			response.addCookie(cookie);
		}

		if(background != null && !background.trim().equals("")) {
			Cookie cookie = new Cookie("background", background);
			cookie.setMaxAge(60*60*24*365);
			response.addCookie(cookie);
		}
		
		response.sendRedirect("/exercises-cookies/main");
	}

}
