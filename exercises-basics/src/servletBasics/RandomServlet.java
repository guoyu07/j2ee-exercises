package servletBasics;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/** Simple servlet for testing. Generates HTML instead of plain
 *  text as with the HelloWorld servlet.
 */

@WebServlet("/random")
public class RandomServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println
		("<!DOCTYPE html>"
			+ "<html>"
			+ "<head>"
			+ "<title>Random</title>"
			+ "</head>"
			+ "<body>"
			+ "<ul>");
    for(int i=0; i<4; i++) {
    	int num = (int)(Math.random()*100);
    	out.println("<li>"+num+"</li>");
    }
    out.println
    	("</ul>"
			+ "</body>"
			+ "</html>");
  }
}
