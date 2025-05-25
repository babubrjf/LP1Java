package atividade06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void deveRegistrarConta() {
        ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "Pablo");
        assertEquals(123, contaBancaria.getNumeroConta());
        assertEquals(100.0f, contaBancaria.getSaldo());
        assertEquals("Pablo", contaBancaria.getTitular());
    }

    @Test
    void deveRegistrarContaTirandoEspacos() {
        ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "   Pablo");
        assertEquals(123, contaBancaria.getNumeroConta());
        assertEquals(100.0f, contaBancaria.getSaldo());
        assertEquals("Pablo", contaBancaria.getTitular());
    }

    @Test
    void deveLancarExcecaoNomeNulo() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "");
            contaBancaria.setTitular("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeNuloConstrutor() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, "");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(123, 100.0f, " ");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSaldoNegativo() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(123, -0.01f, "Pablo");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Saldo invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNumeroContaZerado() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(0, 100.0f, "Pablo");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Numero da conta invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNumeroContaNegativo() {
        try {
            ContaBancaria contaBancaria = new ContaCorrente(-1, 100.0f, "Pablo");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Numero da conta invalido", e.getMessage());
        }
    }
}