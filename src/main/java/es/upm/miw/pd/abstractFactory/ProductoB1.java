package es.upm.miw.pd.abstractFactory;

import upm.jbb.IO;

public class ProductoB1 extends ProductoAbstractoB {

    @Override
    public void view() {
        IO.getIO().println("ProductoB1");
    }

}
