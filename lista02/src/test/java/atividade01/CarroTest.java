package atividade01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro carro;

    @BeforeEach
    public void setUp() {
        carro = new Carro("Volkswagen", "Gol", 2012) ;
    }

    @Test
    public void deveLigarCarro() {
        carro.ligar();
        assertTrue(carro.estadoCarro());
    }

    @Test
    public void deveDesligarCarro() {
        carro.desligar();
        assertFalse(carro.estadoCarro());
    }

    @Test
    public void deveAumentarVelocidadePelaQuantidade() {
        carro.ligar();
        carro.acelerar(50.0f);
        assertEquals(50.0f, carro.getVelocidadeAtual());
    }

    @Test
    public void deveDiminuirVelocidadePelaQuantidade() {
        carro.setVelocidadeAtual(100.0f);
        carro.frear(30.0f);
        assertEquals(70.0f, carro.getVelocidadeAtual());
    }

    @Test
    public void deveTestarAumentarVelocidadeCarroDesligado() {
        carro.desligar();
        carro.acelerar(100.0f);
        assertEquals(0.0f, carro.getVelocidadeAtual());
    }

    @Test
    public void deveTestarDiminuirVelocidadePelaQuantidadeMaiorQueVelocidade() {
        carro.setVelocidadeAtual(100.0f);
        carro.frear(110.0f);
        assertEquals(0.0f, carro.getVelocidadeAtual());
    }

    @Test
    public void deveDesligarCarroEZerarVelocidade() {
        carro.ligar();
        carro.acelerar(50.0f);
        carro.desligar();
        assertFalse(carro.estadoCarro());
        assertEquals(0, carro.getVelocidadeAtual());
    }
}