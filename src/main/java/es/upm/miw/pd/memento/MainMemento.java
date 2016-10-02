package es.upm.miw.pd.memento;

import upm.jbb.IO;

public final class MainMemento {
    private GestorMementos<Memento> gm;

    private Mementable<Memento> o;

    private MainMemento() {
        this.gm = new GestorMementos<Memento>();
        this.o = new Originador(666);
        IO.getIO().addView(this.o);
        IO.getIO().addView(this);
    }

    public void createMemento() {
        this.gm.addMemento(IO.getIO().readString("Nombre del Memento"), o.createMemento());
    }

    public void restoreMemento() {
        this.o.restoreMemento(this.gm.getMemento((String) IO.getIO().select(gm.keys(), "Restaurar")));
    }

    public static void main(String[] args) {
        new MainMemento();
    }

}
