package atividade04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VooIntenacionalTest {

    @Test
    void deveCalcularPrecoPassagemVooInternacional() {
        Voo voo = new VooIntenacional("Rio de Janeiro", "Los Angeles", 10141.5f, LocalDate.of(2026, 5, 20));
        assertEquals(5273.58f, voo.calcularPreco(0.4f, 1.3f),0.01f);
    }

    @Test
    void deveLancarExcecaoTaxaConversaoZerada() {
        try {
            Voo voo = new VooIntenacional("Rio de Janeiro", "Los Angeles", 10141.5f, LocalDate.of(2026, 5, 20));
            voo.calcularPreco(0.4f, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Taxa de Conversao invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoFatorPrecoNegativo() {
        try {
            Voo voo = new VooIntenacional("Rio de Janeiro", "Los Angeles", 10141.5f, LocalDate.of(2026, 5, 20));
            voo.calcularPreco(0.4f, -0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Taxa de Conversao invalida", e.getMessage());
        }
    }
}