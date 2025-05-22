package atividade06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveCalcularJuros() {
        ContaBancaria contaBancaria = new ContaPoupanca(123, 100.0f, "Pablo");
        contaBancaria.calcularJuros(5);
        assertEquals(105.0f, contaBancaria.getSaldo());
    }

    @Test
    void deveLancarExcecaoJurosZerado() {
        try {
            ContaBancaria contaBancaria = new ContaPoupanca(123, 100.0f, "Pablo");
            contaBancaria.calcularJuros(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Juros invalidos", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoJurosNegativos() {
        try {
            ContaBancaria contaBancaria = new ContaPoupanca(123, 100.0f, "Pablo");
            contaBancaria.calcularJuros(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Juros invalidos", e.getMessage());
        }
    }
}