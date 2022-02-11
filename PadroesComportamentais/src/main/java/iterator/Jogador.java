package iterator;

public class Jogador {
    
    String nome;
    int idJogador;
    boolean status;

    public Jogador(String nome, int idJogador, boolean status) {
        this.nome = nome;
        this.idJogador = idJogador;
        this.status = status;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdJogador() {
        return this.idJogador;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
