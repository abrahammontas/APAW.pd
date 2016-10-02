package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class AuthenticationFilter extends Filter {

    @Override
    public void doFilter(HttpRequest request, HttpResponse response, FilterChain filterChain) {
        System.out.println("Authenticating pre-process...");
        if ("public".equals(request.getPath())) {
            // si esta autorizado se continua con la cadena de filtros
            filterChain.doFilter(request, response);
        }
        response.addHeaderParam("auth", "AuthenticationFilter");
        System.out.println("Authenticating post-process...");
    }
}
