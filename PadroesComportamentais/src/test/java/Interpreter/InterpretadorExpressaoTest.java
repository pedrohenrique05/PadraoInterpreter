package Interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpretadorExpressaoTest {

    @Test
    void deveCalcularExpressaoSoma(){
        InterpretadorExpressao interpretador = new InterpretadorExpressaoAritmeticas("1 + 1");
        assertEquals("2.0",interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoSubtracao(){
        InterpretadorExpressao interpretador = new InterpretadorExpressaoAritmeticas("3 - 1");
        assertEquals("2.0",interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoMultiplicacao(){
        InterpretadorExpressao interpretador = new InterpretadorExpressaoAritmeticas("3.0 - 1.0");
        assertEquals("2.0",interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoDivisao(){
        InterpretadorExpressao interpretador = new InterpretadorExpressaoAritmeticas("2 / 1");
        assertEquals("2.0",interpretador.interpretar());
    }
}