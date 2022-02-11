package Strategy;

public class PosicaoMeio implements Posicao{
    @Override
    public String getCaracteristica(String perfilJogador) {
        return perfilJogador+" - Meio";
    }
}
