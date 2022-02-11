package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorComumTest {

    @Test
    void deveRetornarNivelVidaOtimo(){
        JogadorComum jogador = new JogadorComum();
        jogador.setVida(60);
        assertEquals("Otimo",jogador.nivelVida());
    }

    @Test
    void deveRetornarNivelVidaBom(){
        JogadorComum jogador = new JogadorComum();
        jogador.setVida(30);
        assertEquals("Bom",jogador.nivelVida());
    }

    @Test
    void deveRetornarNivelVidaRuim(){
        JogadorComum jogador = new JogadorComum();
        jogador.setVida(15);
        assertEquals("Ruim",jogador.nivelVida());
    }

    @Test
    void deveRetornarNivelVidaCritica(){
        JogadorComum jogador = new JogadorComum();
        jogador.setVida(14);
        assertEquals("Critico",jogador.nivelVida());
    }

    @Test
    void deveRetornarInformacoes(){
        JogadorComum jogador = new JogadorComum();
        jogador.idJogador = 01;
        jogador.nome = "Pedro";
        jogador.setVida(80);
        assertEquals("Nome: Pedro\n" +
                "ID Jogador: 1\n" +
                "Satus vida: Otimo\n" +
                "Patente: subordinado",jogador.getInformacaoJogador());
    }
}