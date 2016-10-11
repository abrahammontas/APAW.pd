package es.upm.miw.pd.state.connection;

public class Parado extends State{
    public void abrir(Conexion conexion){
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    public void cerrar(Conexion conexion){
        throw new UnsupportedOperationException("Acción no permitida... ");
    }
    
    public void parar(Conexion conexion){
        
    }

    public void iniciar(Conexion conexion){
        conexion.estado = Estado.PREPARADO;
        conexion.setState(new Preparado());
    }

    public void enviar(String msg, Conexion conexion){
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    public void recibir(int respuesta, Conexion conexion){
        throw new UnsupportedOperationException("Acción no permitida... ");
    }
}
