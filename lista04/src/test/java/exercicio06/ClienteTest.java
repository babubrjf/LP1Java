package exercicio06;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveAdicionarNomeCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Pablo");
        assertEquals("Pablo", cliente.getNome());
    }

    @Test
    void deveAdicionarCodigoCliente() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(3);
        assertEquals(3, cliente.getCodigo());
    }

    @Test
    void deveAdicionarVaga() {
        Cliente cliente = new Cliente();
        Diario diario = new Diario();
        cliente.criarVaga(diario);
        assertEquals(1, cliente.getQuantidadeVagas());
    }

    @Test
    void deveAdicionarVagas() {
        Cliente cliente = new Cliente();
        Diario diario = new Diario();
        Semanal semanal = new Semanal();
        cliente.criarVaga(diario);
        cliente.criarVaga(semanal);
        assertEquals(2, cliente.getQuantidadeVagas());
    }

    @Test
    void deveRetornarZeroVagas() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.getQuantidadeVagas());
    }

    @Test
    void deveEncontrarVaga() {
        Diario diario = new Diario();
        Semanal semanal = new Semanal();
        Cliente cliente = new Cliente();
        cliente.criarVaga(diario);
        cliente.criarVaga(semanal);
        assertTrue(cliente.verificarVaga(semanal));
    }

    @Test
    void naoDeveEncontrarVaga() {
        Diario diario = new Diario();
        Semanal semanal = new Semanal();
        Cliente cliente = new Cliente();
        cliente.criarVaga(semanal);
        assertFalse(cliente.verificarVaga(diario));
    }

    @Test
    void deveRemoverVaga() {
        Diario diario = new Diario();
        Semanal semanal = new Semanal();
        Cliente cliente = new Cliente();
        cliente.criarVaga(diario);
        cliente.criarVaga(semanal);
        cliente.removerVaga(semanal);
        assertFalse(cliente.verificarVaga(semanal));
    }

    @Test
    void deveRetornarListaVagas() {
        Diario diario = new Diario();
        Semanal semanal = new Semanal();
        Mensal mensal = new Mensal();
        Cliente cliente = new Cliente();
        cliente.criarVaga(diario);
        cliente.criarVaga(semanal);
        cliente.criarVaga(mensal);
        ArrayList<Vaga> lista = new ArrayList<Vaga>();
        lista.add(diario);
        lista.add(semanal);
        lista.add(mensal);
        assertEquals(lista, cliente.getVagas());
    }
}