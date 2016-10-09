package es.upm.miw.web.http;

import es.upm.miw.pd.voting.solution.web.presentation.frontController.FrontController;
import es.upm.miw.web.http.HttpMethod;
import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;
import es.upm.miw.web.http.HttpStatus;

public class Server {

	public HttpResponse request(HttpRequest request) {
		HttpResponse response = new HttpResponse();
		response.setStatus(HttpStatus.OK);
		if (HttpMethod.GET.equals(request.getMethod())) {
			new FrontController().doGet(request, response);
		} else if (HttpMethod.POST.equals(request.getMethod())) {
			new FrontController().doPost(request, response);
		}
		return response;
	}

}
