package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorLiderTest {

    @Test
    void deveRetornarNivelVidaOtimo(){
        JogadorLider jogador = new JogadorLider();
        jogador.setVida(80);
        assertEquals("Otimo",jogador.nivelVida());
    }

    @Test
    void deveRetornarNivelVidaBom(){
        JogadorLider jogador = new JogadorLider();
        jogador.setVida(60);
        assertEquals("Bom",jogador.nivelVida());
    }

    @Test
    void deveRetornarNivelVidaRuim(){
        JogadorLider jogador = new JogadorLider();
        jogador.setVida(25);
        assertEquals("Ruim",jogador.nivelVida());
    }

    @Test
    void deveRetornarNivelVidaCritica(){
        JogadorLider jogador = new JogadorLider();
        jogador.setVida(24);
        assertEquals("Critico",jogador.nivelVida());
    }

    @Test
    void deveRetornarInformacoes(){
        JogadorLider jogador = new JogadorLider();
        jogador.idJogador = 01;
        jogador.nome = "Pedro";
        jogador.setVida(80);
        assertEquals("Nome: Pedro\n" +
                "ID Jogador: 1\n" +
                "Satus vida: Otimo\n" +
                "Patente: Lider",jogador.getInformacaoJogador());
    }
}