package atividade02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveCalcularSalarioGerente() {
        Gerente gerente = new Gerente(2400.0f, 550.0f);
        assertEquals(2950.0f, gerente.calcularPagamento());
    }

    @Test
    void deveLancarExcecaoSalarioZeradoGerente() {
        try {
            Gerente gerente = new Gerente(0, 550.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoBonusZeradoGerente() {
        try {
            Gerente gerente = new Gerente(2500.0f, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Bonus invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSalarioNegativoGerente() {
        try {
            Gerente gerente = new Gerente(-0.1f, 300.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoBonusNegativoGerente() {
        try {
            Gerente gerente = new Gerente(2570.45f, -0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Bonus invalido", e.getMessage());
        }
    }
}