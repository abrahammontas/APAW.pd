package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class Target {
	public void execute(HttpRequest request, HttpResponse response) {
		System.out.println("---------> Executing TARGET...");
	}
}
