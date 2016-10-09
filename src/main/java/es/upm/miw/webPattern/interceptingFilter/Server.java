package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;
import es.upm.miw.web.http.HttpStatus;

public class Server {

    public HttpResponse request(HttpRequest request) {
        HttpResponse response = new HttpResponse();
        response.setStatus(HttpStatus.OK);
        
        new FilterManager().execute(request, response);
        
        return response;
    }

}
