package Interpreter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class InterpretadorExpressaoAritmeticas implements InterpretadorExpressao {
    private InterpretadorExpressao interpretadorInicial;

    public InterpretadorExpressaoAritmeticas(String contexto) {
        Stack<InterpretadorExpressao> pilhaInterpretadores = new Stack<>();
        List<String> elementos = Arrays.asList(contexto.split(" "));
        Iterator<String> iterator = elementos.iterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.matches("\\d+(\\.\\d*)?")) {
                pilhaInterpretadores.push(new Numero(Double.parseDouble(elemento)));
            } else if (elemento.equals("+")) {
                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException("Expressao inválida");
                }
                Numero elementoEsquerda = (Numero) pilhaInterpretadores.pop();
                Numero elementoDireita = new Numero(Double.parseDouble(iterator.next()));
                Adicao interpretador = new Adicao(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Numero(interpretador.interpretar()));
            } else if (elemento.equals("-")) {
                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException("Expressao inválida");
                }
                Numero elementoEsquerda = (Numero) pilhaInterpretadores.pop();
                Numero elementoDireita = new Numero(Double.parseDouble(iterator.next()));
                Subtracao interpretador = new Subtracao(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Numero(interpretador.interpretar()));
            } else if (elemento.equals("*")) {
                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException("Expressao inválida");
                }
                Numero elementoEsquerda = (Numero) pilhaInterpretadores.pop();
                Numero elementoDireita = new Numero(Double.parseDouble(iterator.next()));
                Multiplicacao interpretador = new Multiplicacao(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Numero(interpretador.interpretar()));
            }else if(elemento.equals("/")){
                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException("Expressao inválida");
                }
                Numero elementoEsquerda = (Numero) pilhaInterpretadores.pop();
                Numero elementoDireita = new Numero(Double.parseDouble(iterator.next()));
                Divisao interpretador = new Divisao(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Numero(interpretador.interpretar()));
            }else{
                throw new IllegalArgumentException("Expressao inválida");
            }
        }
        interpretadorInicial = pilhaInterpretadores.pop();
    }

    public double interpretar(){
        return interpretadorInicial.interpretar();
    }
}
