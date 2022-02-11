package Strategy;

public class EscolhaPersonagem {
    private String perfilJogador;

    public EscolhaPersonagem(String perfilJogador) {
        this.perfilJogador = perfilJogador;
    }

    public String getEstatistica(Posicao posicao){
        return posicao.getCaracteristica(this.perfilJogador);
    }
}
