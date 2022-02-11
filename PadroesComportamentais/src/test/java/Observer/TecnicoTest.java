package Observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TecnicoTest {

    @Test
    void deveNotificarTecnico(){
        Servico servico = new Servico("José","Mudança de endereço","Manhã");
        Tecnico tecnico = new Tecnico("Tecnico 1");
        tecnico.solicitaServico(servico);
        servico.setServico();
        assertEquals("Tecnico 1 - serviço adicionado na agenda: Tipo do serviço: Mudança de endereço ; Nome " +
                "do Cliente: José ; Periodo agendado: Manhã",tecnico.getServicoAdd());
    }

    @Test
    void deveRetornarAtualizacaoDoisTecnicos(){
        Servico servico = new Servico("José","Mudança de endereço","Manhã");
        Tecnico tecnico = new Tecnico("Tecnico 1");
        Tecnico tecnico2 = new Tecnico("Tecnico 2");
        tecnico.solicitaServico(servico);
        tecnico2.solicitaServico(servico);
        servico.setServico();
        assertEquals("Tecnico 1 - serviço adicionado na agenda: Tipo do serviço: Mudança de endereço ; Nome " +
                "do Cliente: José ; Periodo agendado: Manhã",tecnico.getServicoAdd());
        assertEquals("Tecnico 2 - serviço adicionado na agenda: Tipo do serviço: Mudança de endereço ; Nome " +
                "do Cliente: José ; Periodo agendado: Manhã",tecnico2.getServicoAdd());

    }

    @Test
    void deveRetornarAtualizacaoEmUmDosDoisTecnicos(){
        Servico servico = new Servico("José","Mudança de endereço","Manhã");
        Tecnico tecnico = new Tecnico("Tecnico 1");
        Tecnico tecnico2 = new Tecnico("Tecnico 2");
        tecnico.solicitaServico(servico);
        servico.setServico();
        assertEquals("Tecnico 1 - serviço adicionado na agenda: Tipo do serviço: Mudança de endereço ; Nome " +
                "do Cliente: José ; Periodo agendado: Manhã",tecnico.getServicoAdd());
        assertEquals(null,tecnico2.getServicoAdd());
    }

    @Test
    void deveRetornarNenhumaAtualizacao(){
        Servico servico = new Servico("José","Mudança de endereço","Manhã");
        Tecnico tecnico = new Tecnico("Tecnico 1");
        Tecnico tecnico2 = new Tecnico("Tecnico 2");
        servico.setServico();
        assertEquals(null,tecnico.getServicoAdd());
        assertEquals(null,tecnico2.getServicoAdd());
    }

    @Test
    void deveNotificarNenhumTecnico(){
        Servico servico = new Servico("José","Mudança de endereço","Manhã");
        Tecnico tecnico = new Tecnico("Tecnico 1");
        servico.setServico();
        tecnico.solicitaServico(servico);
        assertEquals(null,tecnico.getServicoAdd());
    }
}