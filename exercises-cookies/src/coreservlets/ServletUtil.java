package coreservlets;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletUtil {
	
	public static String getParam
         (String paramName, HttpServletRequest request, HttpServletResponse response) {
		String result = "Unknown";
		String paramValue = request.getParameter(paramName);
		Cookie[] cookies = request.getCookies();
		
		if(paramValue == null || paramValue.trim().equals("")) {
			if(cookies != null) {
				for(Cookie cookie : cookies) {
					if(cookie.getName().equals(paramName)) {
						result = cookie.getValue();
						break;
					}
				}
			}
		} else {
			result = paramValue;
			Cookie cookie = new Cookie(paramName, paramValue);
			response.addCookie(cookie);
		}
		
		return result;
	}
}
