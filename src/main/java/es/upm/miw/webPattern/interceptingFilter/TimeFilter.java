package es.upm.miw.webPattern.interceptingFilter;

import java.util.Date;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class TimeFilter extends Filter {

	@Override
	public void doFilter(HttpRequest request, HttpResponse response, FilterChain filterChain) {
		// PRE-PROCESS
		long requestTime = new Date().getTime();
		System.out.println("- Time pre-process: " + new Date());
		filterChain.doFilter(request, response);
		
		// POST-PROCESS
		String time = (new Date().getTime() - requestTime) + "ms";
		System.out.println("- Time post-process: " + time);
		response.getHeaderParams().put("time", time);
	}
}
