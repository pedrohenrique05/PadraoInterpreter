package State;

public class Cliente {
    private String nome;
    private int cod;
    private ClienteEstado estado;

    public Cliente(){
        this.estado = ClienteEstadoCadastrado.getInstance();
    }

    public void setEstado(ClienteEstado estado){
        this.estado = estado;
    }

    public String getNomeEstado(){
        return estado.getEstado();
    }

    public String Ativo(){
        return estado.ativar(this);
    }

    public String Pendencia(){
        return estado.pendencia(this);
    }

    public String Cancelado(){
        return estado.cancelar(this);
    }

    public String Cadastrar(){
        return estado.cadastrar(this);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
