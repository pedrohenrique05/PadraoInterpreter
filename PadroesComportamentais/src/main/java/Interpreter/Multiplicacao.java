package Interpreter;

public class Multiplicacao implements InterpretadorExpressao{

    private double x;
    private double y;

    public Multiplicacao(Numero elementoEsquerda, Numero elementoDireita) {
        this.x = elementoEsquerda.getNumero();
        this.y = elementoDireita.getNumero();
    }

    public double interpretar(){
        return this.x * this.y;
    }
}
