package es.upm.miw.pd.state.connection;

import es.upm.miw.pd.state.connection.State;
import es.upm.miw.pd.state.connection.Cerrado;
import es.upm.miw.pd.state.connection.Estado;
import es.upm.miw.pd.state.connection.Link;

public class Conexion {
    public Estado estado;
    
    public State state;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = Estado.CERRADO;
        this.setState(new Cerrado());
    }

    protected void setState(State state) {
        this.state = state;
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void abrir() {
        this.state.abrir(this);
    }

    public void cerrar() {
        this.state.cerrar(this);
    }

    public void parar() {
        this.state.parar(this);
    }

    public void iniciar() {
        this.state.iniciar(this);
    }

    public void enviar(String msg) {
        this.state.enviar(msg, this);
    }

    public void recibir(int respuesta) {
        this.state.recibir(respuesta, this);
    }

}
