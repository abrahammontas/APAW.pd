package es.upm.miw.webPattern.frontController;

import es.upm.miw.web.http.HttpMethod;
import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;
import es.upm.miw.web.http.HttpStatus;

public class Server {

    public HttpResponse send(HttpRequest request) {
        HttpResponse response = new HttpResponse();
        if (HttpMethod.GET.equals(request.getMethod())) {
            new FrontController().doGet(request, response);
        } else if (HttpMethod.POST.equals(request.getMethod())) {
            new FrontController().doPost(request, response);
        }
        response.setStatus(HttpStatus.OK);
        return response;
    }

}
