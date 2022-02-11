package cheinofresponsability;

public class TipoServicoRobotizado implements TipoServico{

    private static TipoServicoRobotizado tipoRobotizado = new TipoServicoRobotizado();

    public TipoServicoRobotizado() {
    }

    public static TipoServicoRobotizado getTipoServicoRobotizado(){
        return tipoRobotizado;
    }
}
