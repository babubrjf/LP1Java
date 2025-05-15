import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void deveCalcularAreaCirculo() {
        Circulo circulo = new Circulo(0, 0);
        circulo.setRaio(5.0f);
        assertEquals(78.5, circulo.calcularArea(), 0.1f);
    }

    @Test
    void deveCalcularPerimetroCirculo() {
        Circulo circulo = new Circulo(0, 0);
        circulo.setRaio(5.0f);
        assertEquals(31.4, circulo.calcularPerimetro(), 0.1f);
    }

    @Test
    void deveLancarExcecaoValorRaioZerado() {
        try {
            Circulo circulo = new Circulo(0,0);
            circulo.setRaio(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoValorRaioMenorQueZero() {
        try {
            Circulo circulo = new Circulo(0,0);
            circulo.setRaio(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }
}