package atividade04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    @Test
    void deveCalcularPrecoPassagemVooDomestico() {
        Voo voo = new VooDomestico("São Paulo", "Rio de Janeiro", 350, LocalDate.of(2026, 5, 20));
        assertEquals(420.0f, voo.calcularPreco(1.2f, 1.0f), 0.01f);
    }

    @Test
    void deveLancarExcecaoFatorPrecoZerado() {
        try {
            VooDomestico vooDomestico = new VooDomestico("São Paulo", "Rio de Janeiro", 350, LocalDate.of(2026, 5, 20));
            vooDomestico.calcularPreco(0, 1.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fator de preco invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoFatorPrecoNegativo() {
        try {
            VooDomestico vooDomestico = new VooDomestico("São Paulo", "Rio de Janeiro", 350, LocalDate.of(2026, 5, 20));
            vooDomestico.calcularPreco(-0.1f, 1.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fator de preco invalido", e.getMessage());
        }
    }
}