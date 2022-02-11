package cheinofresponsability;

public class Atendimento {
    private TipoServico tiposervico;

    public Atendimento(TipoServico tiposervico) {
        this.tiposervico = tiposervico;
    }

    public TipoServico getTiposervico(){
        return tiposervico;
    }

    public void setTiposervico(TipoServico tiposervico){
        this.tiposervico = tiposervico;
    }
}
