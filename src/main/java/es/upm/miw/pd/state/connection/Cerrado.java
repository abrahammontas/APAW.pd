package es.upm.miw.pd.state.connection;

public class Cerrado extends State{
    
    public void abrir(Conexion conexion){
        conexion.estado = Estado.PREPARADO;
        conexion.setState(new Preparado());
    }

    public void cerrar(Conexion conexion){
    }
    
    public void parar(Conexion conexion){
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    public void iniciar(Conexion conexion){
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    public void enviar(String msg, Conexion conexion){
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    public void recibir(int respuesta, Conexion conexion){
        throw new UnsupportedOperationException("Acción no permitida... ");
    }
}
