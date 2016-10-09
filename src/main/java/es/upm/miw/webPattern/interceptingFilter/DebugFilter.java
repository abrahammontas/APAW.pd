package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class DebugFilter extends Filter {

    @Override
    public void doFilter(HttpRequest request, HttpResponse response, FilterChain filterChain) {
    	//PRE-PROCESS
        System.out.println("- Debuging pre-process...");
        filterChain.doFilter(request, response);
        
    	//POST-PROCESS
        response.getHeaderParams().put("debug", "DebugFilter");
        System.out.println("- Debuging post-process...");
    }
}
