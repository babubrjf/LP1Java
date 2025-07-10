package exercicio03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HospedeTest {

    @Test
    void deveAdicionarNomeHospede() {
        Hospede hospede = new Hospede();
        hospede.setNome("Pablo");
        assertEquals("Pablo", hospede.getNome());
    }

    @Test
    void deveAdicionarCodigoHospede() {
        Hospede hospede = new Hospede();
        hospede.setCodigo(3);
        assertEquals(3, hospede.getCodigo());
    }

    @Test
    void deveAdicionarReserva() {
        Hospede hospede = new Hospede();
        Single single = new Single();
        hospede.reservar(single);
        assertEquals(1, hospede.getQuantidadeReservas());
    }

    @Test
    void deveAdicionarReservas() {
        Hospede hospede = new Hospede();
        Single single = new Single();
        Duplo duplo = new Duplo();
        hospede.reservar(single);
        hospede.reservar(duplo);
        assertEquals(2, hospede.getQuantidadeReservas());
    }

    @Test
    void deveRetornarZeroReservas() {
        Hospede hospede = new Hospede();
        assertEquals(0, hospede.getQuantidadeReservas());
    }

    @Test
    void deveEncontrarReserva() {
        Single single = new Single();
        Duplo duplo = new Duplo();
        Hospede hospede = new Hospede();
        hospede.reservar(single);
        hospede.reservar(duplo);
        assertTrue(hospede.verificarReserva(single));
    }

    @Test
    void naoDeveEncontrarReserva() {
        Single single = new Single();
        Duplo duplo = new Duplo();
        Hospede hospede = new Hospede();
        hospede.reservar(duplo);
        assertFalse(hospede.verificarReserva(single));
    }

    @Test
    void deveRemoverReserva() {
        Single single = new Single();
        Duplo duplo = new Duplo();
        Hospede hospede = new Hospede();
        hospede.reservar(single);
        hospede.reservar(duplo);
        hospede.removerReserva(duplo);
        assertFalse(hospede.verificarReserva(duplo));
    }

    @Test
    void deveRetornarListaReservas() {
        Single single = new Single();
        Duplo duplo = new Duplo();
        Triplo triplo = new Triplo();
        Hospede hospede = new Hospede();
        hospede.reservar(single);
        hospede.reservar(duplo);
        hospede.reservar(triplo);
        ArrayList<Reserva> lista = new ArrayList<Reserva>();
        lista.add(single);
        lista.add(duplo);
        lista.add(triplo);
        assertEquals(lista, hospede.getReservas());
    }
}