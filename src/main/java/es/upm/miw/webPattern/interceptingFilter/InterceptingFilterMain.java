package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpMethod;
import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class InterceptingFilterMain {
    public static void main(String[] args) {
        HttpRequest request = new HttpRequest("LocalHost", "public", HttpMethod.GET);
        System.out.println(request.toString() + "\n");

        HttpResponse response = new Client().send(request);

        System.out.println("\n" + response);
    }
}
