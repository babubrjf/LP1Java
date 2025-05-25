package atividade06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveDepositarValorContaPoupanca() {
        ContaBancaria contaBancaria = new ContaPoupanca(123, 100.0f, "Pablo");
        contaBancaria.depositar(25.0f, 0);
        assertEquals(125.0f, contaBancaria.getSaldo());
    }

    @Test
    void deveLancarExcecaoDepositoZeradoContaPoupanca() {
        try {
            ContaBancaria contaBancaria = new ContaPoupanca(123, 100.0f, "Pablo");
            contaBancaria.depositar(0,0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDepositoNegativoContaPoupanca() {
        try {
            ContaBancaria contaBancaria = new ContaPoupanca(123, 100.0f, "Pablo");
            contaBancaria.depositar(-0.01f,0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveSacarValorContaPoupanca() {
        ContaBancaria contaBancaria = new ContaPoupanca(123, 100.0f, "Pablo");
        contaBancaria.sacar(25.0f,0);
        assertEquals(75.0f, contaBancaria.getSaldo());
    }

    @Test
    void deveLancarExcecaoSaqueZeradoContaPoupanca() {
        try {
            ContaBancaria contaBancaria = new ContaPoupanca(123, 100.0f, "Pablo");
            contaBancaria.sacar(0,0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSaqueNegativoContaPoupanca() {
        try {
            ContaBancaria contaBancaria = new ContaPoupanca(123, 100.0f, "Pablo");
            contaBancaria.sacar(-0.01f,0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSaqueAcimaSaldoContaPoupanca() {
        try {
            ContaBancaria contaBancaria = new ContaPoupanca(123, 100.0f, "Pablo");
            contaBancaria.sacar(100.01f,0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Saldo insuficiente", e.getMessage());
        }
    }
    
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