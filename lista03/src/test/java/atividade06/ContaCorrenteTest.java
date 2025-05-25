package atividade06;

import atividade05.Produto;
import atividade05.ProdutoRoupa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void deveDepositarValorContaCorrente() {
        ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
        contaBancaria.depositar(25.0f, 3);
        assertEquals(121.25f, contaBancaria.getSaldo());
    }

    @Test
    void deveLancarExcecaoDepositoZeradoContaCorrente() {
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
    void deveLancarExcecaoDepositoNegativoContaCorrente() {
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
    void deveSacarValorContaCorrente() {
        ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
        contaBancaria.sacar(25.0f, 3);
        assertEquals(72.75f, contaBancaria.getSaldo());
    }

    @Test
    void deveLancarExcecaoSaqueZeradoContaCorrente() {
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
    void deveLancarExcecaoSaqueNegativoContaCorrente() {
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
    void deveLancarExcecaoSaqueAcimaSaldoContaCorrente() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
            contaBancaria.sacar(100.01f, 3);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Saldo insuficiente", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoTaxaZeradaContaCorrente() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
            contaBancaria.sacar(25, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Taxa invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoTaxaNegativaContaCorrente() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
            contaBancaria.sacar(25, -0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Taxa invalida", e.getMessage());
        }
    }
}