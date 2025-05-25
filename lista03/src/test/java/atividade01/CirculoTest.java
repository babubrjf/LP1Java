package atividade01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void deveLancarExcecaoValorRaioZerado() {
        try {
            FormaGeometrica formaGeometrica = new Circulo(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Raio invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoValorRaioMenorQueZero() {
        try {
            FormaGeometrica formaGeometrica = new Circulo(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Raio invalido", e.getMessage());
        }
    }
}