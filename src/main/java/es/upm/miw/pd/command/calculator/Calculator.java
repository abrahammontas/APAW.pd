package es.upm.miw.pd.command.calculator;

public class Calculator {
    private int total;

    public Calculator() {
        this.reset();
    }

    public int getTotal() {
        return total;
    }

    protected void setTotal(int total) {
        this.total = total;
    }

    public void add(int valor) {
        this.setTotal(this.total + valor);
    }

    public void subtract(int valor) {
        this.setTotal(this.total - valor);
    }

    public void reset() {
        this.setTotal(0);
    }
}
