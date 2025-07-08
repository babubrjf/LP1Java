package exercicio07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    
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
        Especial especial = new Especial();
        cliente.adicionarFita(catalogo);
        cliente.adicionarFita(especial);
        cliente.adicionarFita(catalogo);
        assertEquals(3, cliente.getQuantidadeFitas());
    }

    @Test
    void deveCalcularEmprestimoTotal() {
        Cliente cliente = new Cliente();
        Catalogo catalogo = new Catalogo();
        Especial especial = new Especial();
        catalogo.setDias(5);
        especial.setDias(3);
        especial.setAluguelDiario(7.0f);
        cliente.adicionarFita(catalogo);
        cliente.adicionarFita(especial);
        assertEquals(46.0f, cliente.calcularTotalEmprestimo(), 0.01f);
    }

    @Test
    void deveRetornarIPTUZeradoContribuinteSemImoveis() {
        Cliente cliente = new Cliente();
        assertEquals(0.0f, cliente.calcularTotalEmprestimo(), 0.01f);
    }

    @Test
    void deveRetornarZeroImoveisContribuinteSemImoveis() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.getQuantidadeFitas());
    }
}