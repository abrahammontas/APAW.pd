package es.upm.miw.pd.decorator;

import upm.jbb.IO;

public class DecoradorA extends Decorador {

    public DecoradorA(Componente c) {
        super(c);
    }

    @Override
    public void view() {
        IO.getIO().print(">>> ");
        this.getC().view();
    }
}
