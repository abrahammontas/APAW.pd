package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpMethod;
import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class InterceptingFilterMain {

	public void request(String path) {
		HttpRequest request = new HttpRequest(path, HttpMethod.GET);
		request.addQueryParam("param", "value");
		System.out.println(request.toString() + "\n");
		HttpResponse response = new Server().request(request);
		System.out.println("\n" + response);
	}
	
	public static void main(String[] args) {
		InterceptingFilterMain main = new InterceptingFilterMain();
		// Petición autorizada
		main.request("public");
		System.out.println("\n-----------------------------ooo------------------------------\n");
		// Petición autorizada
		main.request("public/debug");
		System.out.println("\n-----------------------------ooo------------------------------\n");
		// Petición NO autorizada
		main.request("noPublic");
	}
}
