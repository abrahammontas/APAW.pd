package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class FilterManager {

	public void execute(HttpRequest request, HttpResponse response) {
		// Se procesa el request y se establece el destino
		FilterChain filterChain = new FilterChain(new Target());

		// Se procesa el request y se establece los filtros
		filterChain.addFilter(new AuthenticationFilter());
		if ("/public".equals(request.getPath())) {
			filterChain.addFilter(new DebugFilter());
			filterChain.addFilter(new TimeFilter());
		}

		// Se pasa el control
		filterChain.doFilter(request, response);
	}
}
