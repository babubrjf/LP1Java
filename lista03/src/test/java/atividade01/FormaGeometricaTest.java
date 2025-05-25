package atividade01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaGeometricaTest {


    @Test
    void deveCalcularAreaRetangulo() {
        FormaGeometrica formaGeometrica = new Retangulo(5.0f, 2.0f);
        assertEquals(10, formaGeometrica.calcularArea(10.0f));
    }

    @Test
    void deveCalcularPerimetroRetangulo() {
        FormaGeometrica formaGeometrica = new Retangulo(5.0f, 2.0f);
        assertEquals(14, formaGeometrica.calcularPerimetro(14.0f));
    }

    @Test
    void deveCalcularAreaCirculo() {
        FormaGeometrica formaGeometrica = new Circulo(5.0f);
        assertEquals(78.5, formaGeometrica.calcularArea(5.0f), 0.1f);
    }

    @Test
    void deveCalcularPerimetroCirculo() {
        FormaGeometrica formaGeometrica = new Circulo(5.0f);
        assertEquals(31.4, formaGeometrica.calcularPerimetro(5.0f), 0.1f);
    }
}