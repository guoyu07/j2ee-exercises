package listenersListeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class CompanyUpdateListener
 *
 */
@WebListener
public class CompanyUpdateListener implements ServletContextAttributeListener {

	/**
	 * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
	 */
	public void attributeAdded(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
	 */
	public void attributeReplaced(ServletContextAttributeEvent event) {
		ServletContext context = event.getServletContext();
		String attributeName = event.getName();
		Object oldValue = event.getValue();
		Object newValue = context.getAttribute(attributeName);
		if(attributeName.equals("companyName") && !newValue.equals(oldValue)) {
			int stockValue = (int) context.getAttribute("stockValue");
			int newStockValue = (int) (stockValue * 1.25);
			context.setAttribute("stockValue", newStockValue);
		}
	}

	/**
	 * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
	 */
	public void attributeRemoved(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
	}

}
