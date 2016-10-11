package es.upm.miw.pd.composite.expression.solution;

public class Suma extends Expresion{
    public Expresion valor1 = null;
    
    public Expresion valor2 = null;
    
    public Suma(Expresion expresion, Expresion numero){
        this.valor1 = expresion;
        this.valor2 = numero;
    }
    
    public int operar(){
        return this.valor1.operar() + this.valor2.operar();
    }
    
    public String toString() {
        return "(" + this.valor1 + "+" + this.valor2 + ")";
    }
}
