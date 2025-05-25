package atividade01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void deveLancarExcecaoValorBaseZerado() {
        try {
            Retangulo retangulo = new Retangulo(0, 10);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Base invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoValorBaseMenorQueZero() {
        try {
            Retangulo retangulo = new Retangulo(-0.1f, 10);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Base invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoValorAlturaZerado() {
        try {
            Retangulo retangulo = new Retangulo(10, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Altura invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoValorAlturaMenorQueZero() {
        try {
            Retangulo retangulo = new Retangulo(10, -0.01f);
            retangulo.setAltura(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Altura invalida", e.getMessage());
        }
    }
}