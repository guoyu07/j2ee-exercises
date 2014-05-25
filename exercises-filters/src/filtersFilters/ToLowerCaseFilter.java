package filtersFilters;

import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ToLowerCaseFilter
 */
@WebFilter(urlPatterns={"/*"})
public class ToLowerCaseFilter extends ModificationFilter {
	
	@Override
	public String doModification(String origResponse) {
		return origResponse.toLowerCase();
	}

}
