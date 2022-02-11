package State;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    Cliente cliente;
    @BeforeEach
    public void setUp(){
        cliente = new Cliente();
    }

    /** Testes a partir clienteCadastrado**/
    @Test
    void deveRetornarFalhaAoCadastrar(){
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        assertEquals("cadastro inválido, Cliente já cadastrado no sistema!",cliente.Cadastrar());
    }
    @Test
    void deveRetornarClienteAtivado(){
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        assertEquals("Cliente ativado!",cliente.Ativo());
    }
    @Test
    void deveRetornarClientePendente(){
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        assertEquals("Cliente com pendencia!",cliente.Pendencia());
    }
    @Test
    void deveRetornarClienteCancelado(){
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        assertEquals("Cliente cancelado!",cliente.Cancelado());
    }

    /**Testes a partir de ClienteAtivado**/
    @Test
    void deveRetornarFalhaCadastro(){
        cliente.setEstado(ClienteEstadoAtivado.getInstance());
        assertEquals("Cadastro inválido, cliente já cadastro!",cliente.Cadastrar());
    }
    @Test
    void deveRetornarFalhaAtivacao(){
        cliente.setEstado(ClienteEstadoAtivado.getInstance());
        assertEquals("Ativação inválida, cliente já ativo!",cliente.Ativo());
    }
    @Test
    void deveRetornarPendencia(){
        cliente.setEstado(ClienteEstadoAtivado.getInstance());
        assertEquals("Cliente com pendencia!",cliente.Pendencia());
    }
    @Test
    void deveRetornarCancelamento(){
        cliente.setEstado(ClienteEstadoAtivado.getInstance());
        assertEquals("Cliente cancelado!",cliente.Cancelado());
    }

    /**Testes a partir ClienteCancelado**/

    @Test
    void deveRetornarFalhaCadastroCancelado(){
        cliente.setEstado(ClienteEstadoCancelado.getInstance());
        assertEquals("cadastrado inválido, Cliente já cancelado!",cliente.Cadastrar());
    }

    @Test
    void deveRetornarFalhaAtivacaoCancelado(){
        cliente.setEstado(ClienteEstadoCancelado.getInstance());
        assertEquals("Ativação inválida, Cliente já cancelado!",cliente.Ativo());
    }

    @Test
    void deveRetornarFalhaPendenciaCancelado(){
        cliente.setEstado(ClienteEstadoCancelado.getInstance());
        assertEquals("Pendencia inválida, Cliente já cancelado!",cliente.Pendencia());
    }

    @Test
    void deveRetornarFalhaCancelamentoCancelado(){
        cliente.setEstado(ClienteEstadoCancelado.getInstance());
        assertEquals("Cliente já cancelado!",cliente.Cancelado());
    }

    /**Testes a partir ClientePendente **/
    @Test
    void deveRetornarFalhaCadastrarPendente(){
        cliente.setEstado(ClienteEstadoPendente.getInstance());
        assertEquals("cadastro inválido, Cliente já cadastrado!",cliente.Cadastrar());
    }

    @Test
    void deveRetornarAtivacaoPendente(){
        cliente.setEstado(ClienteEstadoPendente.getInstance());
        assertEquals("Cliente ativado!",cliente.Ativo());
    }

    @Test
    void deveRetornarFalhaPendenciaPendente(){
        cliente.setEstado(ClienteEstadoPendente.getInstance());
        assertEquals("Cliente ja pendente!",cliente.Pendencia());
    }

    @Test
    void deveRetornarCancelamentoPendencia(){
        cliente.setEstado(ClienteEstadoPendente.getInstance());
        assertEquals("Cliente cancelado!",cliente.Cancelado());
    }
}