package exercicio06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaTest {

    @Test
    void deveRetornarValorDiario() {
        Diario diario = new Diario();
        diario.setNumDias(2);
        assertEquals(20.0f, diario.calcularValor());
    }

    @Test
    void deveRetornarValorSemanal() {
        Semanal semanal = new Semanal();
        semanal.setNumSemanas(1);
        assertEquals(40.0f, semanal.calcularValor());
    }

    @Test
    void deveRetornarValorMensal() {
        Mensal mensal = new Mensal();
        mensal.setNumMeses(1);
        assertEquals(150.0f, mensal.calcularValor());
    }
}