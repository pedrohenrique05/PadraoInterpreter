package iterator;

import java.util.Iterator;

public class SalaJogo {

    public static Integer jogadoresOnline(JogoX jogo){
        int jogadoresOnline = 0;
        for( Jogador jogador : jogo ){
            if(jogador.isStatus()){
                jogadoresOnline++;
            }
        }
        return jogadoresOnline;
    }

    public static Integer JogadoresNaSala(JogoX jogo){
        int jogadoresSala = 0;
        for(Iterator a = jogo.iterator() ; a.hasNext() ; ){
            jogadoresSala++;
            a.next();
        }
        return jogadoresSala;
    }
}
