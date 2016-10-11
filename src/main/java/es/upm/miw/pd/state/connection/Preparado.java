package es.upm.miw.pd.state.connection;

public class Preparado extends State{
    
    public void abrir(Conexion conexion){
        conexion.estado = Estado.PREPARADO;
        conexion.setState(new Preparado());
    }

    public void cerrar(Conexion conexion){
        conexion.estado = Estado.CERRADO;
        conexion.setState(new Cerrado());
    }
    
    public void parar(Conexion conexion){
        conexion.estado = Estado.PARADO;
        conexion.setState(new Parado());
    }

    public void iniciar(Conexion conexion){   
    }

    public void enviar(String msg, Conexion conexion){
        conexion.getLink().enviar(msg);
        conexion.estado = Estado.ESPERANDO;
        conexion.setState(new Esperando());
    }

    public void recibir(int respuesta, Conexion conexion){
        throw new UnsupportedOperationException("Acción no permitida... ");
    }
}
