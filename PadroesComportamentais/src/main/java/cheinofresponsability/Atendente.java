package cheinofresponsability;

import java.util.ArrayList;

public abstract class Atendente {

    protected ArrayList listAtendimentos = new ArrayList();
    private Atendente atendenteSuperior;

    public Atendente getAtendenteSuperior(){
        return this.atendenteSuperior;
    }
    public void setAtendenteSuperior(Atendente atendenteSuperior){
        this.atendenteSuperior = atendenteSuperior;
    }

    public abstract String getDescricaoFuncao();

    public String gerarAtendimento(Atendimento atendimento){
        if(listAtendimentos.contains(atendimento.getTiposervico())){
            return getDescricaoFuncao();
        }else{
            if(atendenteSuperior != null){
                return atendenteSuperior.gerarAtendimento(atendimento);
            }else{
                return "Sem atendimento";
            }
        }
    }

}
