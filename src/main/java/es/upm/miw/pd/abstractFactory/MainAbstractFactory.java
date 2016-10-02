package es.upm.miw.pd.abstractFactory;

import upm.jbb.IO;

public class MainAbstractFactory {
    private FabricaAbstracta fa;

    private FabricaAbstracta[] fas = {new FabricaConcreta1(), new FabricaConcreta2()};

    public void tipoFabrica() {
        fa = (FabricaAbstracta) IO.getIO().select(fas, "Elige una f�brica");
    }

    public void fabricarProductos() {
        fa.crearProductoA().view();
        fa.crearProductoB().view();

    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainAbstractFactory());
    }

}
