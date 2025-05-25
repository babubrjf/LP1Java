package atividade04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VooTest {

    @Test
    void deveRegistrarDadosVoo() {
        Voo voo = new VooDomestico("São Paulo", "Rio de Janeiro", 360, LocalDate.of(2026,5,20));
        assertEquals("São Paulo", voo.getOrigem());
        assertEquals("Rio de Janeiro", voo.getDestino());
        assertEquals(360, voo.getDistancia());
        assertEquals(LocalDate.of(2026,5,20), voo.getData());
    }

    @Test
    void deveRegistrarDadosTirandoEspacos() {
        Voo voo = new VooDomestico(" São Paulo", "Rio de Janeiro   ", 360, LocalDate.of(2026,5,20));
        assertEquals("São Paulo", voo.getOrigem());
        assertEquals("Rio de Janeiro", voo.getDestino());
        assertEquals(360, voo.getDistancia());
        assertEquals(LocalDate.of(2026,5,20), voo.getData());
    }

    @Test
    void deveLancarExcecaoOrigemNula() {
        try {
            Voo voo = new VooDomestico("", "Rio de Janeiro", 360, LocalDate.of(2026,5,20));
            voo.setOrigem("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Origem invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoOrigemNulaConstrutor() {
        try {
            Voo voo = new VooDomestico("", "Rio de Janeiro", 360, LocalDate.of(2026,5,20));
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Origem invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoOrigemVazia() {
        try {
            Voo voo = new VooDomestico(" ", "Rio de Janeiro", 360, LocalDate.of(2026,5,20));
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Origem invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDestinoNulo() {
        try {
            Voo voo = new VooDomestico("São Paulo", "", 360, LocalDate.of(2026,5,20));
            voo.setDestino("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Destino invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDestinoNuloConstrutor() {
        try {
            Voo voo = new VooDomestico("São Paulo", "", 360, LocalDate.of(2026,5,20));
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Destino invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDestinoVazio() {
        try {
            Voo voo = new VooDomestico("São Paulo", " ", 360, LocalDate.of(2026,5,20));
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Destino invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDistanciaZerada() {
        try {
            Voo voo = new VooDomestico("São Paulo", "Rio de Janeiro", 0, LocalDate.of(2026,5,20));
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Distancia invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDistanciaNegativa() {
        try {
            Voo voo = new VooDomestico("São Paulo", "Rio de Janeiro", -0.01f, LocalDate.of(2026,5,20));
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Distancia invalida", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoDataVooAntesHoje() {
        try {
            Voo voo = new VooDomestico("São Paulo", "Rio de Janeiro", 360, LocalDate.of(2025,5, 20));
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Data invalida", e.getMessage());
        }
    }
}