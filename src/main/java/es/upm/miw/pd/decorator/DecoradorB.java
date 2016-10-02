package es.upm.miw.pd.decorator;

import upm.jbb.IO;

public class DecoradorB extends Decorador {

    public DecoradorB(Componente c) {
        super(c);
    }

    @Override
    public void view() {
        IO.getIO().println();
        IO.getIO().println("***************");
        this.getC().view();
        IO.getIO().println();
        IO.getIO().println("***************");
    }
}
