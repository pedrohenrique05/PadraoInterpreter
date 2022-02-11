package cheinofresponsability;

public class TipoServicoPresencial implements TipoServico {

    private static TipoServicoPresencial tipoPresencial = new TipoServicoPresencial();

    public TipoServicoPresencial() {
    }

    public static TipoServicoPresencial getTipoServicoPresencial(){
        return tipoPresencial;
    }
}
