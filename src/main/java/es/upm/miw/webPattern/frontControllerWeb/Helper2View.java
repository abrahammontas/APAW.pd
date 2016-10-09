package es.upm.miw.webPattern.frontControllerWeb;

public class Helper2View implements View {

    @Override
    public void show(Model model) {
        System.out.println("Helper2View \n" + model.get("msg") + "\n    service: " + model.get("service"));
    }

}
