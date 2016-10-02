package es.upm.miw.pd.state;

import upm.jbb.IO;

public class StateMain {
    private Context c = new Context();

    public void state() {
        IO.getIO().println(this.c.toString());
    }

    public void accion1() {
        this.c.action1();
    }

    public void accion2() {
        this.c.action2();
    }

    public static void main(String[] args) {
        IO.getIO().addView(new StateMain());
    }
}
