package Observer;

import java.util.Observable;

public class Servico extends Observable {

    private String nomeCliente;
    private String tipoServico;
    private String horarioAgendamento;

    public Servico(String nomeCliente, String tipoServico, String horarioAgendamento) {
        this.nomeCliente = nomeCliente;
        this.tipoServico = tipoServico;
        this.horarioAgendamento = horarioAgendamento;
    }

    public void setServico(){
        setChanged();
        notifyObservers();
    }

    public String toString(){
        return "Tipo do serviço: "+this.tipoServico+
                " ; Nome do Cliente: "+this.nomeCliente+
                " ; Periodo agendado: "+this.horarioAgendamento;
    }
}
