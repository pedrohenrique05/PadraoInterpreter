package Strategy;

public class PosicaoGoleiro  implements Posicao{
    @Override
    public String getCaracteristica(String perfilJogador) {
        return perfilJogador+" - Goleiro";
    }
}
