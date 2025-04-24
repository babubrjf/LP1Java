package atividade04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro carro;

    @BeforeEach
    public void setUp() {
        carro = new Carro() ;
    }

    @Test
    public void deveCalcularMedia() {
        carro.setQuilometros(400);
        carro.setLitros(10);
        assertEquals(40, carro.media());
    }

    @Test
    public void deveInformarDistancia() {
        carro.setQuilometros(400);
        System.out.println("Distância percorrida: " + carro.getQuilometros() + " km");
    }

    @Test
    public void deveInformarConsumo() {
        carro.setLitros(10);
        System.out.println("Consumo total: " + carro.getLitros() + " litros");
    }
}