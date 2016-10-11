package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expresion{
    public int valor;
    
    public Numero(int valor) {
        this.valor = valor;
    }
    
    public int operar(){
        return this.valor;
    }
    
    public String toString() {
        return Integer.toString(this.valor);
    }
}
