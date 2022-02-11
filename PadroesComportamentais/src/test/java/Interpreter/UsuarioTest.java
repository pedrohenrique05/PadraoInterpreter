package Interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveCalcularConversao(){
        Usuario user = new Usuario();
        user.setDolar(5.25);
        user.setReal(5.25);

        assertEquals("1.0",user.calcularConversao());
    }

}