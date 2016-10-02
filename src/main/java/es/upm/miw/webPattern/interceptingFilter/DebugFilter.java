package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class DebugFilter extends Filter {

    @Override
    public void doFilter(HttpRequest request, HttpResponse response, FilterChain filterChain) {
        System.out.println("Debuging pre-process...");
        filterChain.doFilter(request, response);
        response.getHeaderParams().put("debug", "DebugFilter");
        System.out.println("Debuging post-process...");
    }
}
