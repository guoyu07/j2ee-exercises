package listenersListeners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionCount
 *
 */
@WebListener
public class SessionCount implements HttpSessionListener {

	private int sessionCount = 0;

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent event) {
    	sessionCount++;
    	ServletContext context = event.getSession().getServletContext();
    	context.setAttribute("sessionCount", sessionCount);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent event) {
    	sessionCount--;
    }
	
}
