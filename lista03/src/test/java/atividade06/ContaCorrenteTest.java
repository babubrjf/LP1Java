package atividade06;

import atividade05.Produto;
import atividade05.ProdutoRoupa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void deveDepositarValor() {
        ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
        contaBancaria.depositar(25.0f, 3);
        assertEquals(121.25f, contaBancaria.getSaldo());
    }

    @Test
    void deveLancarExcecaoDepositoZerado() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
            contaBancaria.depositar(0, 3);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDepositoNegativo() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
            contaBancaria.depositar(-0.01f, 3);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveSacarValor() {
        ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
        contaBancaria.sacar(25.0f, 3);
        assertEquals(72.75f, contaBancaria.getSaldo());
    }

    @Test
    void deveLancarExcecaoSaqueZerado() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
            contaBancaria.sacar(0, 3);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSaqueNegativo() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
            contaBancaria.sacar(-0.01f, 3);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoValorAcimaSaldo() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
            contaBancaria.sacar(100.01f, 3);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Saldo insuficiente", e.getMessage());
        }
    }
}