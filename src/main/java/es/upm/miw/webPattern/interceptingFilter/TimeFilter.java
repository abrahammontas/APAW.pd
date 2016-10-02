package es.upm.miw.webPattern.interceptingFilter;

import java.util.Date;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class TimeFilter extends Filter {

    @Override
    public void doFilter(HttpRequest request, HttpResponse response, FilterChain filterChain) {
        long requestTime = new Date().getTime();
        System.out.println("Time pre-process: " + new Date());
        filterChain.doFilter(request, response);
        response.getHeaderParams().put("time", "Time");
        System.out.println("Time post-process: " + (new Date().getTime() - requestTime) + "ms");
    }
}
