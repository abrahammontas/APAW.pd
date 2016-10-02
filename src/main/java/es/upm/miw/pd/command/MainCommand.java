package es.upm.miw.pd.command;

import upm.jbb.IO;

public final class MainCommand {
    private Invoker invocador;

    public MainCommand() {
        Receptor receptor = new Receptor();
        this.invocador= new Invoker();
        this.invocador.add(new Order1(receptor));
        this.invocador.add(new Order2(receptor));
    }

    public void invocador() {
        String llave = (String) IO.getIO().select(this.invocador.keys());
        this.invocador.execute(llave);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCommand());
    }

}
