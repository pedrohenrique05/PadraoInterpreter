package templatemethod;

public abstract class Jogador {

    String nome;
    int idJogador;
    int vida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public abstract String getPatenteJogador();

    public abstract String nivelVida();

    public String getInformacaoJogador(){
        return "Nome: "+this.nome+
                "\nID Jogador: "+this.idJogador+
                "\nSatus vida: "+this.nivelVida()+
                "\nPatente: "+this.getPatenteJogador();
    }
}
