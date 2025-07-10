package exercicio05;

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
    void deveAdicionarManutencao() {
        Cliente cliente = new Cliente();
        Monitor monitor = new Monitor();
        cliente.novaManutencao(monitor);
        assertEquals(1, cliente.getQuantidadeManutencoes());
    }

    @Test
    void deveAdicionarManutencoes() {
        Cliente cliente = new Cliente();
        Monitor monitor = new Monitor();
        CPU cpu = new CPU();
        cliente.novaManutencao(monitor);
        cliente.novaManutencao(cpu);
        assertEquals(2, cliente.getQuantidadeManutencoes());
    }

    @Test
    void deveRetornarZeroManutencoes() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.getQuantidadeManutencoes());
    }

    @Test
    void deveEncontrarManutencao() {
        Monitor monitor = new Monitor();
        CPU cpu = new CPU();
        Cliente cliente = new Cliente();
        cliente.novaManutencao(monitor);
        cliente.novaManutencao(cpu);
        assertTrue(cliente.verificarManutencao(cpu));
    }

    @Test
    void naoDeveEncontrarManutencao() {
        Monitor monitor = new Monitor();
        CPU cpu = new CPU();
        Cliente cliente = new Cliente();
        cliente.novaManutencao(cpu);
        assertFalse(cliente.verificarManutencao(monitor));
    }

    @Test
    void deveRemoverManutencao() {
        Monitor monitor = new Monitor();
        CPU cpu = new CPU();
        Cliente cliente = new Cliente();
        cliente.novaManutencao(monitor);
        cliente.novaManutencao(cpu);
        cliente.removerManutencao(cpu);
        assertFalse(cliente.verificarManutencao(cpu));
    }

    @Test
    void deveRetornarListaManutencoes() {
        Monitor monitor = new Monitor();
        CPU cpu = new CPU();
        Impressora impressora = new Impressora();
        Cliente cliente = new Cliente();
        cliente.novaManutencao(monitor);
        cliente.novaManutencao(cpu);
        cliente.novaManutencao(impressora);
        ArrayList<Manutencao> lista = new ArrayList<Manutencao>();
        lista.add(monitor);
        lista.add(cpu);
        lista.add(impressora);
        assertEquals(lista, cliente.getManutencoes());
    }
}