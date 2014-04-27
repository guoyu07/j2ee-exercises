package coreservlet;

import javax.servlet.http.HttpServletRequest;

public class ServletUtil {
	  
	  public static boolean isRefererTo
	      (HttpServletRequest request, String refererTo) {
	    String referer = request.getHeader("Referer");
	    return((referer != null) &&
	           (referer.equals(refererTo)));
	  }

	public static String getWizardPage
	      (HttpServletRequest request, String page) {
		String refererTo = request.getRequestURL().toString();
		refererTo = refererTo.substring(0,refererTo.length()-3);
		refererTo = refererTo + page;
		return refererTo;
	}
	
	public static boolean isChrome
	      (HttpServletRequest request) {
	    String encodings = request.getHeader("User-Agent");
	    return((encodings != null) &&
	           (encodings.contains("Chrome")));
	}
}
