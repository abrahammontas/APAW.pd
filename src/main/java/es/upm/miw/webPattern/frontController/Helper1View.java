package es.upm.miw.webPattern.frontController;

public class Helper1View implements View {

    @Override
    public void show(Model model) {
        System.out.println("Helper1View \n" + model.get("msg"));
    }

}
