package Observer;

import java.util.Observable;
import java.util.Observer;

public class Tecnico implements Observer {
    private String nome;
    private String servicoAdd;

    public Tecnico(String nome) {
        this.nome = nome;
    }

    public String getServicoAdd(){
        return this.servicoAdd;
    }

    public void solicitaServico(Servico servico){
        servico.addObserver(this);
    }

    @Override
    public void update(Observable servico, Object arg) {
        this.servicoAdd = this.nome+" - serviço adicionado na agenda: "+servico.toString();
    }
}
