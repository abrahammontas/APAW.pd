package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class FilterManager {
    FilterChain filterChain;

    public FilterManager() {
    }

     public void doFilter(HttpRequest request, HttpResponse response) {
         //Se procesa el request y se establece el Target y los Filters
         filterChain = new FilterChain(new Target());
         filterChain.addFilter(new TimeFilter());
         filterChain.addFilter(new AuthenticationFilter());
         filterChain.addFilter(new DebugFilter());
         filterChain.doFilter(request, response);
    }
}
