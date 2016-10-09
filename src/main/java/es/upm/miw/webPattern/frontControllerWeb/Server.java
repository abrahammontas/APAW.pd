package es.upm.miw.webPattern.frontControllerWeb;

import es.upm.miw.web.http.HttpMethod;
import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class Server {

	public HttpResponse execute(HttpRequest request) {
		HttpResponse response = new HttpResponse();
		if (HttpMethod.GET.equals(request.getMethod())) {
			new Dispatcher().doGet(request, response);
		} else if (HttpMethod.POST.equals(request.getMethod())) {
			new Dispatcher().doPost(request, response);
		}
		return response;
	}

}
