package listenersListeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class CompanyNameListener
 *
 */
@WebListener
public class CompanyInitListener implements ServletContextListener {

	private static final String COMPANY_NAME = "My Company";
	private static final int STOCK_VALUE = 100000;

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event) {
    	ServletContext context = event.getServletContext();
    	context.setAttribute("companyName", COMPANY_NAME);
    	context.setAttribute("stockValue", STOCK_VALUE);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent event) {
        // TODO Auto-generated method stub
    }
	
}
