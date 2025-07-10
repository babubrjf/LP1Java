package exercicio02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveAdicionarNomecliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Pablo");
        assertEquals("Pablo", cliente.getNome());
    }

    @Test
    void deveAdicionarCodigocliente() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(3);
        assertEquals(3, cliente.getCodigo());
    }

    @Test
    void deveAdicionarContaBancaria() {
        Cliente cliente = new Cliente();
        Poupanca poupanca = new Poupanca();
        cliente.adicionarConta(poupanca);
        assertEquals(1, cliente.getQuantidadeContas());
    }

    @Test
    void deveAdicionarContasBancarias() {
        Cliente cliente = new Cliente();
        Poupanca poupanca = new Poupanca();
        CorrenteNormal correnteNormal = new CorrenteNormal();
        cliente.adicionarConta(poupanca);
        cliente.adicionarConta(correnteNormal);
        assertEquals(2, cliente.getQuantidadeContas());
    }

    @Test
    void deveRetornarZeroContas() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.getQuantidadeContas());
    }

    @Test
    void deveEncontrarContaBancaria() {
        Poupanca poupanca = new Poupanca();
        CorrenteEspecial correnteEspecial = new CorrenteEspecial();
        Cliente cliente = new Cliente();
        cliente.adicionarConta(poupanca);
        cliente.adicionarConta(correnteEspecial);
        assertTrue(cliente.verificarConta(poupanca));
    }

    @Test
    void naoDeveEncontrarContaBancaria() {
        Poupanca poupanca = new Poupanca();
        CorrenteEspecial correnteEspecial = new CorrenteEspecial();
        Cliente cliente = new Cliente();
        cliente.adicionarConta(poupanca);
        assertFalse(cliente.verificarConta(correnteEspecial));
    }

    @Test
    void deveRemoverContaBancaria() {
        Poupanca poupanca = new Poupanca();
        CorrenteEspecial correnteEspecial = new CorrenteEspecial();
        Cliente cliente = new Cliente();
        cliente.adicionarConta(poupanca);
        cliente.adicionarConta(correnteEspecial);
        cliente.removerContaBancaria(correnteEspecial);
        assertFalse(cliente.verificarConta(correnteEspecial));
    }

    @Test
    void deveRetornarListaContasBancarias() {
        Poupanca poupanca = new Poupanca();
        CorrenteNormal correnteNormal = new CorrenteNormal();
        CorrenteEspecial correnteEspecial = new CorrenteEspecial();
        Cliente cliente = new Cliente();
        cliente.adicionarConta(poupanca);
        cliente.adicionarConta(correnteNormal);
        cliente.adicionarConta(correnteEspecial);
        ArrayList<ContaBancaria> lista = new ArrayList<ContaBancaria>();
        lista.add(poupanca);
        lista.add(correnteNormal);
        lista.add(correnteEspecial);
        assertEquals(lista, cliente.getContasBancarias());
    }
}