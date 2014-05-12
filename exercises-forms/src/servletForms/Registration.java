package servletForms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that prints out the param1, param2, and param3
 *  request parameters. Does not filter out HTML tags.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and Java</a>.
 */

@WebServlet("/registration")
public class Registration extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    
    String fname = request.getParameter("fname");
    fname = replaceIfMissing(fname, "no-name");
    fname = ServletUtilities.filter(fname);
    
    String lname = ServletUtilities.filter(request.getParameter("lname"));
    lname = replaceIfMissing(lname, "no-name");
    lname = ServletUtilities.filter(lname);
    
    String email = ServletUtilities.filter(request.getParameter("email"));
    email = replaceIfMissing(email, "no-email");
    email = ServletUtilities.filter(email);
    
    PrintWriter out = response.getWriter();
    String title = "Reading Registration";
    String docType =
      "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
      "Transitional//EN\">\n";
    out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
                "<UL>\n" +
                "  <LI><B>First name</B>: "
                + fname + "\n" +
                "  <LI><B>Last name</B>: "
                + lname + "\n" +
                "  <LI><B>Email</B>: "
                + email + "\n" +
                "</UL>\n" +
                "</BODY></HTML>");
  }
  
  /** Replaces null strings (no such parameter name) or
   *  empty strings (e.g., if textfield was blank) with
   *  the replacement. Returns the original string otherwise.
   */
  
  private String replaceIfMissing(String orig,
                                  String replacement) {
    if ((orig == null) || (orig.trim().equals(""))) {
      return(replacement);
    } else {
      return(orig);
    }
  }
}
