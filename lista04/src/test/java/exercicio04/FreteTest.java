package exercicio04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteTest {

    @Test
    void deveRetornarValorFreteNormal() {
        Normal normal = new Normal();
        normal.setValor(250.0f);
        assertEquals(250.0f, normal.calcularFrete());
    }

    @Test
    void deveRetornarValorFreteEspecial() {
        Especial especial = new Especial();
        especial.setValor(150.0f);
        especial.setTaxaEntrega(50.0f);
        assertEquals(200.0f, especial.calcularFrete());
    }

    @Test
    void deveRetornarValorFreteUrgente() {
        Urgente urgente = new Urgente();
        urgente.setValor(150.0f);
        urgente.setTaxaEntrega(50.0f);
        urgente.setItens(3);
        assertEquals(230.0f, urgente.calcularFrete());
    }
}