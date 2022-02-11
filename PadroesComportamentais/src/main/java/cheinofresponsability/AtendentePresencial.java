package cheinofresponsability;

public class AtendentePresencial extends Atendente{

    public AtendentePresencial(Atendente superior ) {
        listAtendimentos.add(TipoServicoPresencial.getTipoServicoPresencial());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoFuncao(){
        return "Tecnico de campo";
    }
}
