package newPackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/** Simple servlet for testing. Generates HTML instead of plain
 *  text as with the HelloWorld servlet.
 */

@WebServlet("/test")
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
      		+ "<title>A Test Servlet</title>"
      		+ "</head>"
      		+ "<body>"
      		+ "<h1>Test</h1>"
      		+ "<p>Simple servlet for testing.</p>"
      		+ "</body>"
      		+ "</html>");
  }
}
