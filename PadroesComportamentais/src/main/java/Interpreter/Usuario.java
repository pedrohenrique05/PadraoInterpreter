package Interpreter;

public class Usuario {
    private double real;
    private double dolar;

    public double getReal(){
        return this.real;
    }
    public void setReal(double real){
        this.real = real;
    }

    public double getDolar(){
        return this.dolar;
    }
    public void setDolar(double dolar){
        this.dolar = dolar;
    }

    public double calcularConversao(){
        return CasaCambio.calcularConversao(this.real,this.dolar);
    }
}
