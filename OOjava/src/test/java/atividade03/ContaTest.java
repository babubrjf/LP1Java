package atividade03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Conta conta;

    @BeforeEach
    public void setUp() {
        conta = new Conta() ;
    }

    @Test
    public void deveCalcularValorTotal() {
        conta.setQuilowatts(1000);
        assertEquals(141.6, conta.valorTotal());
    }
}