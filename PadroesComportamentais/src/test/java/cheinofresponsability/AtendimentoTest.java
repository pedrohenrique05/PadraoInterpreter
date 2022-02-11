package cheinofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoTest {

    AtendentePresencial atendimentopresencial;
    AtendenteInterno atendimentointerno;
    AtendenteAutomatizado atendimentoautomatizado;

    @BeforeEach
    void setUp(){
        atendimentopresencial = new AtendentePresencial(null);
        atendimentointerno = new AtendenteInterno(atendimentopresencial);
        atendimentoautomatizado = new AtendenteAutomatizado(atendimentointerno);
    }

    @Test
    void deveRetornarServicoAutomatizado(){
        assertEquals("IA",atendimentoautomatizado.gerarAtendimento(new Atendimento(TipoServicoRobotizado.getTipoServicoRobotizado())));
    }

    @Test
    void deveRetornarServicoTelefonico(){
        assertEquals("Tecnico interno",atendimentoautomatizado.gerarAtendimento(new Atendimento(TipoServicoTelefonico.getTipoServicoTelefonico())));
    }

    @Test
    void deveRetornarServicoPresencial(){
        assertEquals("Tecnico de campo",atendimentoautomatizado.gerarAtendimento(new Atendimento(TipoServicoPresencial.getTipoServicoPresencial())));
    }
}