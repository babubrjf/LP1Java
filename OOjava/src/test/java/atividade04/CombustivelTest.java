package atividade04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombustivelTest {

    Combustivel combustivel;

    @BeforeEach
    public void setUp() {
        combustivel = new Combustivel() ;
    }

    @Test
    public void deveCalcularMedia() {
        combustivel.setQuilometros(400);
        combustivel.setLitros(10);
        assertEquals(40, combustivel.media());
    }

    @Test
    public void deveInformarDistancia() {
        combustivel.setQuilometros(400);
        System.out.println("Distância percorrida: " + combustivel.getQuilometros() + " km");
    }

    @Test
    public void deveInformarConsumo() {
        combustivel.setLitros(10);
        System.out.println("Consumo total: " + combustivel.getLitros() + " litros");
    }
}