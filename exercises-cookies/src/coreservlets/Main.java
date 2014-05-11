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
 * Servlet implementation class Main
 */
@WebServlet("/main")
public class Main extends HttpServlet {
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
				+ "<title>Main page</title>"
				+ "</head>"
				+ "<body bgcolor=\"" + background + "\" text=\"" + foreground + "\">"
				+ "<h1>Welcome to main page</h1>"
				+ "<a href=\"/exercises-cookies/choose-color\">Choose colors</a>"
				+ "</body>"
				+ "</html>");
	}

}
