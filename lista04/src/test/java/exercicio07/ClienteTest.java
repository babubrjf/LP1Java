package exercicio07;

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
    void deveAdicionarFita() {
        Cliente cliente = new Cliente();
        Catalogo catalogo = new Catalogo();
        cliente.adicionarFita(catalogo);
        assertEquals(1, cliente.getQuantidadeFitas());
    }

    @Test
    void deveAdicionarFitas() {
        Cliente cliente = new Cliente();
        Catalogo catalogo = new Catalogo();
        Lancamento lancamento = new Lancamento();
        cliente.adicionarFita(catalogo);
        cliente.adicionarFita(lancamento);
        assertEquals(2, cliente.getQuantidadeFitas());
    }

    @Test
    void deveRetornarZeroFitas() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.getQuantidadeFitas());
    }

    @Test
    void deveEncontrarFita() {
        Catalogo catalogo = new Catalogo();
        Lancamento lancamento = new Lancamento();
        Cliente cliente = new Cliente();
        cliente.adicionarFita(catalogo);
        cliente.adicionarFita(lancamento);
        assertTrue(cliente.verificarFita(catalogo));
    }

    @Test
    void naoDeveEncontrarFita() {
        Catalogo catalogo = new Catalogo();
        Lancamento lancamento = new Lancamento();
        Cliente cliente = new Cliente();
        cliente.adicionarFita(lancamento);
        assertFalse(cliente.verificarFita(catalogo));
    }

    @Test
    void deveRemoverFita() {
        Catalogo catalogo = new Catalogo();
        Lancamento lancamento = new Lancamento();
        Cliente cliente = new Cliente();
        cliente.adicionarFita(catalogo);
        cliente.adicionarFita(lancamento);
        cliente.removerFita(lancamento);
        assertFalse(cliente.verificarFita(lancamento));
    }

    @Test
    void deveRetornarListaFitas() {
        Catalogo catalogo = new Catalogo();
        Lancamento lancamento = new Lancamento();
        Especial especial = new Especial();
        Cliente cliente = new Cliente();
        cliente.adicionarFita(catalogo);
        cliente.adicionarFita(lancamento);
        cliente.adicionarFita(especial);
        ArrayList<Fita> lista = new ArrayList<Fita>();
        lista.add(catalogo);
        lista.add(lancamento);
        lista.add(especial);
        assertEquals(lista, cliente.getFitas());
    }
}