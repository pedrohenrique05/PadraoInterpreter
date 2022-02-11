package cheinofresponsability;

public class AtendenteAutomatizado extends Atendente{

    public AtendenteAutomatizado(Atendente superior ) {
        listAtendimentos.add(TipoServicoRobotizado.getTipoServicoRobotizado());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoFuncao(){
        return "IA";
    }
}
