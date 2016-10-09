package es.upm.miw.webPattern.frontControllerWeb;

public class Helper2Presenter {

    private int param1;

    public void setParam1(int param1) {
        this.param1 = param1;
    }

    public String process(Model model) {
        model.put("msg", "Mensaje de Helper2Controller:param1: " + param1);
        model.put("service", new BusinessService().service());
        return "Helper2View";
    }

    public String action1(Model model) {
        model.put("msg", "Mensaje de Helper2Controller:action1:param1: " + param1);
        return "Helper2View";
    }

}
