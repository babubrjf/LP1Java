package exercicio08;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarValorMensalidadeMensalista() {
        Mensalista mensalista = new Mensalista();
        mensalista.setValorMensalidade(1000.0f);
        mensalista.setNumParcelas(1);
        assertEquals(1000.0f, mensalista.calcularMensalidade());
    }

    @Test
    void deveRetornarValorMensalidadeBolsistaParcial() {
        BolsistaParcial bolsistaParcial = new BolsistaParcial();
        bolsistaParcial.setValorMensalidade(1500.0f);
        bolsistaParcial.setNumParcelas(2);
        bolsistaParcial.setPercentual(10);
        assertEquals(75.0f, bolsistaParcial.calcularMensalidade());
    }

    @Test
    void deveRetornarExcecaoDescontoMaior50() {
        try {
            BolsistaParcial bolsistaParcial = new BolsistaParcial();
            bolsistaParcial.setValorMensalidade(1500.0f);
            bolsistaParcial.setNumParcelas(2);
            bolsistaParcial.setPercentual(50.01f);
            fail();
            bolsistaParcial.calcularMensalidade();
        } catch (IllegalArgumentException e) {
            assertEquals("Percentual Invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoDescontoMenorZero() {
        try {
            BolsistaParcial bolsistaParcial = new BolsistaParcial();
            bolsistaParcial.setValorMensalidade(1500.0f);
            bolsistaParcial.setNumParcelas(2);
            bolsistaParcial.setPercentual(-0.01f);
            fail();
            bolsistaParcial.calcularMensalidade();
        } catch (IllegalArgumentException e) {
            assertEquals("Percentual Invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoDescontoZero() {
        try {
            BolsistaParcial bolsistaParcial = new BolsistaParcial();
            bolsistaParcial.setValorMensalidade(1500.0f);
            bolsistaParcial.setNumParcelas(2);
            bolsistaParcial.setPercentual(0);
            fail();
            bolsistaParcial.calcularMensalidade();
        } catch (IllegalArgumentException e) {
            assertEquals("Percentual Invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarNumParcelasBolsistaIntegral() {
        BolsistaIntegral bolsistaIntegral = new BolsistaIntegral();
        bolsistaIntegral.setNumParcelas(10);
        assertEquals(10, bolsistaIntegral.getNumParcelas());
    }
}