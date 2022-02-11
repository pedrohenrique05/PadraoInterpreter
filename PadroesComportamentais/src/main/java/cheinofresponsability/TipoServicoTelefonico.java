package cheinofresponsability;

public class TipoServicoTelefonico implements TipoServico{

    private static TipoServicoTelefonico tipoTelefonico = new TipoServicoTelefonico();

    public TipoServicoTelefonico() {
    }

    public static TipoServicoTelefonico getTipoServicoTelefonico(){
        return tipoTelefonico;
    }
}
