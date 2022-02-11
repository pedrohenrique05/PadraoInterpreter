package iterator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JogoX implements Iterable<Jogador>{
    private List<Jogador> jogadores = new ArrayList<Jogador>();

    public JogoX (Jogador ... jogadores){
        this.jogadores = Arrays.asList(jogadores);
    }

    @Override
    public Iterator<Jogador> iterator() {
        return this.jogadores.iterator();
    }
}
