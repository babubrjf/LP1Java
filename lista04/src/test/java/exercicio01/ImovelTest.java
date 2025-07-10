package exercicio01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImovelTest {

    @Test
    void deveCalcularIPTULote() {
        Lote lote = new Lote();
        lote.setMetragemTerreno(40.0f);
        assertEquals(1200.0f, lote.calcularIPTU(), 0.01f);
    }

    @Test
    void deveCalcularIPTUCasa() {
        Casa casa = new Casa();
        casa.setMetragemTerreno(35.0f);
        casa.setMetragemConstrucao(20.0f);
        assertEquals(2050.0f, casa.calcularIPTU(), 0.01f);
    }

    @Test
    void deveCalcularIPTUApartamento() {
        Apartamento apartamento = new Apartamento();
        apartamento.setMetragemConstrucao(80.0f);
        apartamento.setAndar(2);
        assertEquals(2560.0f, apartamento.calcularIPTU(), 0.01f);
    }
}