package Strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveRetornarPersongameGoleiro(){
        Jogador player = new Jogador();
        player.PersonagemGoleiro("Bom em defesas a queima roupa");
        assertEquals("Bom em defesas a queima roupa - Goleiro",player.getPersonagem());
    }

    @Test
    void deveRetornarPersongameLateral(){
        Jogador player = new Jogador();
        player.PersonagemLateral("Otimo em apoiar");
        assertEquals("Otimo em apoiar - Lateral",player.getPersonagem());
    }

    @Test
    void deveRetornarPersongameZagueiro(){
        Jogador player = new Jogador();
        player.PersonagemZagueiro("Bom em jogo aereo");
        assertEquals("Bom em jogo aereo - Zagueiro",player.getPersonagem());
    }

    @Test
    void deveRetornarPersongameMeio(){
        Jogador player = new Jogador();
        player.PersonagemMeio("Meio campista classico");
        assertEquals("Meio campista classico - Meio",player.getPersonagem());
    }

    @Test
    void deveRetornarPersongameAtacante(){
        Jogador player = new Jogador();
        player.PersonagemAtacante("Artilheiro similar a Roberto Dinamite");
        assertEquals("Artilheiro similar a Roberto Dinamite - Atacante",player.getPersonagem());
    }
}