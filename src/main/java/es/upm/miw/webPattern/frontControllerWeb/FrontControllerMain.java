package es.upm.miw.webPattern.frontControllerWeb;

import es.upm.miw.web.http.HttpMethod;
import es.upm.miw.web.http.HttpRequest;

public class FrontControllerMain {

    public void helper1() {
        HttpRequest request = new HttpRequest("Helper1", HttpMethod.GET);
        System.out.println(request.toString() + "\n");
        new Server().execute(request);
    }

    public void helper1Action1(String param1) {
        HttpRequest request = new HttpRequest("Helper1", HttpMethod.POST);
        request.addQueryParam("action", "action1");
        request.addQueryParam("param1", param1);
        System.out.println(request.toString() + "\n");
        new Server().execute(request);
    }

    public void helper1Action2(String param2) {
        HttpRequest request = new HttpRequest("Helper1", HttpMethod.POST);
        request.addQueryParam("action", "action2");
        request.addQueryParam("param2", param2);
        System.out.println(request.toString() + "\n");
        new Server().execute(request);
    }

    public void helper2() {
        HttpRequest request = new HttpRequest("Helper2", HttpMethod.GET);
        System.out.println(request.toString() + "\n");
        new Server().execute(request);
    }

    public void helper2Action1(String param1) {
        HttpRequest request = new HttpRequest("Helper2", HttpMethod.POST);
        request.addQueryParam("action", "action1");
        request.addQueryParam("param1", param1);
        System.out.println(request.toString() + "\n");
        new Server().execute(request);
    }

    public void helper3() {
        HttpRequest request = new HttpRequest("Helper3", HttpMethod.GET);
        System.out.println(request.toString() + "\n");
        new Server().execute(request);
    }

    public static void main(String[] args) {
        FrontControllerMain main = new FrontControllerMain();
        main.helper1();
        System.out.println("-------  ooo  --------------------------------------");
        main.helper1Action1("param");
        System.out.println("-------  ooo  --------------------------------------");
        main.helper1Action2("param");
        System.out.println("-------  ooo  --------------------------------------");
        main.helper2();
        System.out.println("-------  ooo  --------------------------------------");
        main.helper2Action1("1");
        System.out.println("-------  ooo  --------------------------------------");
        main.helper3();
    }

}
