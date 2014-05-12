package servletSessionTracking;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ServletUtil {
	
	public static String getParam
         (String paramName, HttpServletRequest request) {
		String result = "Unknown";
		String paramValue = request.getParameter(paramName);
		HttpSession session = request.getSession();
		
		synchronized (session) {
			if(paramValue == null || paramValue.trim().equals("")) {
				paramValue = (String) session.getAttribute(paramName);
				if(paramValue != null) {
					result = paramValue;
				}
			} else {
				result = paramValue;
				session.setAttribute(paramName, paramValue);
			}
		}
		
		return result;
	}
}
