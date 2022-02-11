package Strategy;

public class PosicaoLateral implements Posicao{
    @Override
    public String getCaracteristica(String perfilJogador) {
        return perfilJogador+" - Lateral";
    }
}
