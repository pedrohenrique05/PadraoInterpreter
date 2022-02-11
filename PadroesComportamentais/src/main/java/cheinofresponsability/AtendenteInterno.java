package cheinofresponsability;

public class AtendenteInterno extends Atendente{

    public AtendenteInterno(Atendente superior ) {
        listAtendimentos.add(TipoServicoTelefonico.getTipoServicoTelefonico());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoFuncao(){
        return "Tecnico interno";
    }
}
