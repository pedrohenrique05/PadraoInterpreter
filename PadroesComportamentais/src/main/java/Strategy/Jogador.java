package Strategy;

public class Jogador {

    private String personagemEscolhido;

    public String getPersonagem(){
        return this.personagemEscolhido;
    }

    public void PersonagemGoleiro(String perfilPersonagem){
        EscolhaPersonagem escolha = new EscolhaPersonagem(perfilPersonagem);
        this.personagemEscolhido = escolha.getEstatistica(new PosicaoGoleiro());
    }

    public void PersonagemZagueiro(String perfilPersonagem){
        EscolhaPersonagem escolha = new EscolhaPersonagem(perfilPersonagem);
        this.personagemEscolhido = escolha.getEstatistica(new PosicaoZagueiro());
    }

    public void PersonagemLateral(String perfilPersonagem){
        EscolhaPersonagem escolha = new EscolhaPersonagem(perfilPersonagem);
        this.personagemEscolhido = escolha.getEstatistica(new PosicaoLateral());
    }

    public void PersonagemMeio(String perfilPersonagem){
        EscolhaPersonagem escolha = new EscolhaPersonagem(perfilPersonagem);
        this.personagemEscolhido = escolha.getEstatistica(new PosicaoMeio());
    }

    public void PersonagemAtacante(String perfilPersonagem){
        EscolhaPersonagem escolha = new EscolhaPersonagem(perfilPersonagem);
        this.personagemEscolhido = escolha.getEstatistica(new PosicaoAtacante());
    }
}
