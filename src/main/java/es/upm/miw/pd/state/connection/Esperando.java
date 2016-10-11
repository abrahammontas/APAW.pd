package es.upm.miw.pd.state.connection;

public class Esperando extends State{
    
    public void abrir(Conexion conexion){
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    public void cerrar(Conexion conexion){
        throw new UnsupportedOperationException("Acción no permitida... ");
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
        if (respuesta == 0) {
            conexion.estado = Estado.PREPARADO;
            conexion.setState(new Preparado());
        } else {
            conexion.estado = Estado.CERRADO;
            conexion.setState(new Cerrado());
        }
    }
}
