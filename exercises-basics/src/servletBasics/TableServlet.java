package servletBasics;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/** Simple servlet for testing. Generates HTML instead of plain
 *  text as with the HelloWorld servlet.
 */

@WebServlet("/table")
public class TableServlet extends HttpServlet {
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
    			+ "<title>Table</title>"
    			+ "</head>"
    			+ "<body>"
    			+ "<table>");
    for(int i=1; i<=25; i++) {
		out.println("<tr>");
    	for(int j=1; j<=10; j++) {
    		out.println("<td>Row"+i+", Col"+j+"</td>");
    	}
		out.println("</tr>");
    }
    out.println
    	("</table>"
    			+ "</body>"
    			+ "</html>");
  }
}
