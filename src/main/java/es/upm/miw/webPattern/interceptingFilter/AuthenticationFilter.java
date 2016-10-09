package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;
import es.upm.miw.web.http.HttpStatus;

public class AuthenticationFilter extends Filter {

	@Override
	public void doFilter(HttpRequest request, HttpResponse response, FilterChain filterChain) {
		// PRE-PROCESS
		System.out.println("- Authenticating pre-process...");
		if ("public".equals(request.pathRoot(1))) {
			// si esta autorizado se continua con la cadena de filtros
			filterChain.doFilter(request, response);
		} else {
			response.setStatus(HttpStatus.UNAUTHORIZED);
			response.addHeaderParam("auth", "AuthenticationFilter");
		}

		// POST-PROCESS
		System.out.println("- Authenticating post-process...");
	}
}
