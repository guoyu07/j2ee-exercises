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

@WebServlet("/auto-registration")
public class AutoRegistration extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    
    String fname = request.getParameter("fname");
    boolean fnameerr = isMissing(fname);
	fname = ServletUtilities.filter(fname);
    
    String lname = ServletUtilities.filter(request.getParameter("lname"));
    boolean lnameerr = isMissing(lname);
	lname = ServletUtilities.filter(lname);
    
    String email = ServletUtilities.filter(request.getParameter("email"));
    boolean emailerr = isMissing(email);
    email = ServletUtilities.filter(email);
    
    PrintWriter out = response.getWriter();
    String title = "Auto Registration";
    String docType =
      "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
      "Transitional//EN\">\n";
    out.println(docType +
                "<HTML><HEAD><TITLE>" + title + "</TITLE></HEAD>"
                + "<BODY BGCOLOR=\"#FDF5E6\">"
        		+ "<H1 ALIGN=\"CENTER\">Auto Registration</H1>");

    if((fname == null && lname == null && email == null) || 
    		(fnameerr || lnameerr || emailerr)) {
	    out.println(
	        		"<FORM ACTION=\"auto-registration\">"
	        		+ "First name:  <INPUT TYPE=\"TEXT\" NAME=\"fname\"><BR>");
	    if(fnameerr) {
	    	out.println("<span>First name should not be null</span><BR>");
	    }
	    out.println("Last name: <INPUT TYPE=\"TEXT\" NAME=\"lname\"><BR>");

	    if(lnameerr) {
	    	out.println("<span>Last name should not be null</span><BR>");
	    }
	    out.println("Email:  <INPUT TYPE=\"TEXT\" NAME=\"email\"><BR>");

	    if(emailerr) {
	    	out.println("<span>Email should not be null</span><BR>");
	    }
	    out.println("<CENTER><INPUT TYPE=\"SUBMIT\"></CENTER>"
	        		+ "</FORM>");
    } else {
    	out.println(
	    			"<UL>"
	    			+ "<LI><B>First name</B>: " + fname
	                + "<LI><B>Last name</B>: " + lname
	                + "<LI><B>Email</B>: " + email
	                + "</UL>");
    }
    
    out.println("</BODY></HTML>");
  }

/** Replaces null strings (no such parameter name) or
   *  empty strings (e.g., if textfield was blank) with
   *  the replacement. Returns the original string otherwise.
   */
  
  private boolean isMissing(String orig) {
    return orig != null && orig.trim().equals("");
  }
}
