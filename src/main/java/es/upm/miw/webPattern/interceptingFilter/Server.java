package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class Server {

    public HttpResponse request(HttpRequest request) {
        HttpResponse response = new HttpResponse();
        
        new FilterManager().execute(request, response);
        
        return response;
    }

}
