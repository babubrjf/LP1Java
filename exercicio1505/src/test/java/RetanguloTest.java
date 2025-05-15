import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void deveCalcularAreaRetangulo() {
        Retangulo retangulo = new Retangulo(0, 0);
        retangulo.setBase(5.0f);
        retangulo.setAltura(2.0f);
        assertEquals(10, retangulo.calcularArea());
    }

    @Test
    void deveCalcularPerimetroRetangulo() {
        Retangulo retangulo = new Retangulo(0, 0);
        retangulo.setBase(5.0f);
        retangulo.setAltura(2.0f);
        assertEquals(14, retangulo.calcularPerimetro());
    }

    @Test
    void deveLancarExcecaoValorBaseZerado() {
        try {
            Retangulo retangulo = new Retangulo(0, 0);
            retangulo.setBase(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoValorAlturaZerado() {
        try {
            Retangulo retangulo = new Retangulo(0, 0);
            retangulo.setAltura(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoValorBaseMenorQueZero() {
        try {
            Retangulo retangulo = new Retangulo(0, 0);
            retangulo.setBase(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoValorAlturaMenorQueZero() {
        try {
            Retangulo retangulo = new Retangulo(0, 0);
            retangulo.setAltura(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }
}