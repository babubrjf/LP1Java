package exercicio04;

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
    void deveAdicionarFrete() {
        Cliente cliente = new Cliente();
        Normal normal = new Normal();
        cliente.novoFrete(normal);
        assertEquals(1, cliente.getQuantidadeFretes());
    }

    @Test
    void deveAdicionarFretes() {
        Cliente cliente = new Cliente();
        Normal normal = new Normal();
        Especial especial = new Especial();
        cliente.novoFrete(normal);
        cliente.novoFrete(especial);
        assertEquals(2, cliente.getQuantidadeFretes());
    }

    @Test
    void deveRetornarZeroFretes() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.getQuantidadeFretes());
    }

    @Test
    void deveEncontrarFrete() {
        Normal normal = new Normal();
        Especial especial = new Especial();
        Cliente cliente = new Cliente();
        cliente.novoFrete(normal);
        cliente.novoFrete(especial);
        assertTrue(cliente.verificarFrete(especial));
    }

    @Test
    void naoDeveEncontrarFrete() {
        Normal normal = new Normal();
        Especial especial = new Especial();
        Cliente cliente = new Cliente();
        cliente.novoFrete(especial);
        assertFalse(cliente.verificarFrete(normal));
    }

    @Test
    void deveCancelarFrete() {
        Normal normal = new Normal();
        Especial especial = new Especial();
        Cliente cliente = new Cliente();
        cliente.novoFrete(normal);
        cliente.novoFrete(especial);
        cliente.cancelarFrete(especial);
        assertFalse(cliente.verificarFrete(especial));
    }

    @Test
    void deveRetornarListaFretes() {
        Normal normal = new Normal();
        Especial especial = new Especial();
        Urgente urgente = new Urgente();
        Cliente cliente = new Cliente();
        cliente.novoFrete(normal);
        cliente.novoFrete(especial);
        cliente.novoFrete(urgente);
        ArrayList<Frete> lista = new ArrayList<Frete>();
        lista.add(normal);
        lista.add(especial);
        lista.add(urgente);
        assertEquals(lista, cliente.getFretes());
    }
}