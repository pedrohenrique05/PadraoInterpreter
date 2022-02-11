package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaJogoTest {

    @Test
    void deveRetornarJogadoresOnline(){
        JogoX jogo = new JogoX(new Jogador("Pedro",01,true),
                new Jogador("Erick",02,true),
                new Jogador("Barbara",03,true),
                new Jogador("Juliana",4,false),
                new Jogador("Karol",05,true),
                new Jogador("Jão",06,true));

        assertEquals(5,SalaJogo.jogadoresOnline(jogo));
    }

    @Test
    void deveRetornarJogadoresQueEntraramNaSala(){
        JogoX jogo = new JogoX(new Jogador("Pedro",01,true),
                new Jogador("Erick",02,true),
                new Jogador("Barbara",03,true),
                new Jogador("Juliana",4,false),
                new Jogador("Karol",05,true),
                new Jogador("Jão",06,true));

        assertEquals(6,SalaJogo.JogadoresNaSala(jogo));
    }
}