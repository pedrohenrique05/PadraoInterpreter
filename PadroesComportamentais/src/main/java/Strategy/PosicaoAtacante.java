package Strategy;

public class PosicaoAtacante implements Posicao{
    @Override
    public String getCaracteristica(String perfilJogador) {
        return perfilJogador+" - Atacante";
    }
}
