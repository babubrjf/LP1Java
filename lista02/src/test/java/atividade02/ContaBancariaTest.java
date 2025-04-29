package atividade02;

import atividade01.Carro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    ContaBancaria contaBancaria;

    @BeforeEach
    public void setUp() {
        contaBancaria = new ContaBancaria("Pablo Rodrigues", 1234567890);
    }

    @Test
    public void deveAdicionarValorAoSaldo() {
        contaBancaria.setSaldo(0);
        contaBancaria.depositar(1000.0f);
        assertEquals(1000.0f,contaBancaria.getSaldo());
    }

    @Test
    public void deveSubtrairValorDoSaldo() {
        contaBancaria.setSaldo(10050.30f);
        contaBancaria.sacar(700.0f);
        assertEquals(9350.30f,contaBancaria.getSaldo());
    }

    @Test
    public void deveTestarSaldoNegativo() {
        try {
            contaBancaria.setSaldo(5000.0f);
            contaBancaria.sacar(5000.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Saldo Inválido", e.getMessage());
        }
    }
}