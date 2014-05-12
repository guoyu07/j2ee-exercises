package servletSessionTracking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Tracker
 */
@WebServlet("/tracker")
public class Tracker extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		synchronized (session) {
			@SuppressWarnings("unchecked")
			Set<String> tracks = (Set<String>) session.getAttribute("tracks");
			
			if(tracks == null) {
				tracks = new HashSet<>();
			}
			
		    String referer = request.getHeader("Referer");
		    if(referer != null) {
		    	tracks.add(referer);
		    }
		    
		    session.setAttribute("tracks", tracks);
		    
			StringBuilder builder = new StringBuilder();
			builder.append("<!DOCTYPE html>")
			.append("<html>")
			.append("<head>")
			.append("<title>Tracker</title>")
			.append("</head>")
			.append("<body>")
			.append("<h1>Tracker</h1>")
			.append("<ul>");
			
			for(String track : tracks) {
				builder.append("<li>")
				.append(track)
				.append("</li>");
			}
			
			builder.append("</ul>")
			.append("</body>")
			.append("</html>");

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println(builder.toString());
		}
	}

}
