package filtersFilters;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class ReplaceCeoNameFilter
 */
@WebFilter(
		urlPatterns={"/*"},
		initParams={
				@WebInitParam(name="taget",value="Mickey Mouse"),
				@WebInitParam(name="replacement",value="Donald Duck")
		})
public class ReplaceCeoNameFilter extends ReplaceFilter {
	private String target;
	private String replacement;

	@Override
	public void init(FilterConfig config) throws ServletException {
		super.init(config);
		target = config.getInitParameter("taget");
		replacement = config.getInitParameter("replacement");
	}

	@Override
	public String getTarget() {
		return target;
	}

	@Override
	public String getReplacement() {
		return replacement;
	}
}
