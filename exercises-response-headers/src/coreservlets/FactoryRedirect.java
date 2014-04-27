package coreservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FactoryRedirec
 */
@WebServlet("/factory-redirect")
public class FactoryRedirect extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String redirect;
		String useragent = request.getHeader("User-Agent");
		if(useragent.contains("Firefox")) {
			// Firefox: Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0
			redirect = "http://www.mozilla.org";
		} else if (useragent.contains("Chrome")) {
			// Chrome: Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.116 Safari/537.36
			redirect = "http://www.google.com";
		} else {
			// IExplorer: Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; rv:11.0) like Gecko
			redirect = "http://www.microsoft.com";
		}
		response.setHeader("Refresh", "10; "+redirect);
		PrintWriter out = response.getWriter();
		out.println("You will be redirected to " + redirect + " in 10 seconds...");
	}

}
