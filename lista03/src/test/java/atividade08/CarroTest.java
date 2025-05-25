package atividade08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveCalcularPrecoBaseFatorFixo() {
        Veiculo veiculo = new Carro("Volkswagen", "Gol", 16500.50f);
        assertEquals(29700.90f, veiculo.calcularCusto(1.8f), 0.01f);
    }

    @Test
    void deveLancarExcecaoFatorFixoZerado() {
        try {
            Veiculo veiculo = new Carro("Volkswagen", "Gol", 16500.50f);
            veiculo.calcularCusto(0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fator fixo invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoFatorFixoNegativo() {
        try {
            Veiculo veiculo = new Carro("Volkswagen", "Gol", 16500.50f);
            veiculo.calcularCusto(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fator fixo invalido", e.getMessage());
        }
    }
}