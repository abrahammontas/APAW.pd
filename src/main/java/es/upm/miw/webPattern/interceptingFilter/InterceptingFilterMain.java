package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpMethod;
import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class InterceptingFilterMain {
    public static void main(String[] args) {
    	//Petición autorizada
        HttpRequest request = new HttpRequest("/public", HttpMethod.GET);
        request.addQueryParam("param", "value");
        System.out.println(request.toString() + "\n");
        HttpResponse response = new Server().request(request);
        System.out.println("\n" + response);
        System.out.println("\n------------------------ooo--------------------------\n");
        
        //Petición NO autorizada
        request = new HttpRequest("/NoPublic", HttpMethod.GET);
        System.out.println(request.toString() + "\n");
        response = new Server().request(request);
        System.out.println("\n" + response);
    }
}
