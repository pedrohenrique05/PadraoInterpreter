package Interpreter;

public class CasaCambio {

    public static String formula = "real / dolar";

    public static double calcularConversao(double real, double dolar){
        String expressao;
        expressao = formula.replace("real",Double.toString(real));
        expressao = expressao.replace("dolar",Double.toString(dolar));
        InterpretadorExpressao interpretador = new InterpretadorExpressaoAritmeticas(expressao);
        return interpretador.interpretar();
    }
}

