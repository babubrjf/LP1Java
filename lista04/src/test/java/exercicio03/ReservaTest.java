package exercicio03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void deveCalcularReservaSingle() {
        Single single = new Single();
        single.setDias(5);
        assertEquals(250, single.calcularReserva(), 0.01f);
    }

    @Test
    void deveCalcularReservaDuplo() {
        Duplo duplo = new Duplo();
        duplo.setDias(3);
        duplo.setRefeicoes(6);
        assertEquals(300, duplo.calcularReserva(), 0.01f);
    }

    @Test
    void deveCalcularReservaTriplo() {
        Triplo triplo = new Triplo();
        triplo.setDias(2);
        triplo.setRefeicoes(3);
        assertEquals(230, triplo.calcularReserva(), 0.01f);
    }
}