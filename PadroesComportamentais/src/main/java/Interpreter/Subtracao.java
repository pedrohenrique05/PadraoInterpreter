package Interpreter;

public class Subtracao implements InterpretadorExpressao{

    private double x;
    private double y;

    public Subtracao(Numero elementoEsquerda, Numero elementoDireita) {
        this.x = elementoEsquerda.getNumero();
        this.y = elementoDireita.getNumero();
    }

    public double interpretar(){
        return this.x - this.y;
    }
}
