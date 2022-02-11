package Strategy;

public class PosicaoZagueiro implements Posicao{
    @Override
    public String getCaracteristica(String perfilJogador) {
        return perfilJogador+" - Zagueiro";
    }
}
