package servletBasics;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/** Simple servlet for testing. Generates HTML instead of plain
 *  text as with the HelloWorld servlet.
 */

@WebServlet("/hello")
public class TestServlet extends HttpServlet {
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
    			+ "<title>Hello</title>"
    			+ "</head>"
    			+ "<body>"
    			+ "<h1>Hello Nicola</h1>"
    			+ "</body>"
    			+ "</html>");
  }
}
