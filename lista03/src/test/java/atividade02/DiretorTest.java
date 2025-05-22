package atividade02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveCalcularSalarioDiretor() {
        Diretor diretor = new Diretor(5500.0f, 50000.0f, 3.5f);
        assertEquals(7250.0f, diretor.calcularPagamento());
    }

    @Test
    void deveLancarExcecaoSalarioZeradoDiretor() {
        try {
            Diretor diretor = new Diretor(0, 50000.0f, 3.5f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPercentualZeradoDiretor() {
        try {
            Diretor diretor = new Diretor(13000.0f, 50000.0f, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Percentual invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoLucroEmpresaZerado() {
        try {
            Diretor diretor = new Diretor(5000.0f, 0, 3.5f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Lucro invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSalarioNegativoDiretor() {
        try {
            Diretor diretor = new Diretor(-0.1f, 50000.0f, 3.5f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPercentualNegativoDiretor() {
        try {
            Diretor diretor = new Diretor(13000.0f, 50000.0f, -0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Percentual invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoLucroEmpresaNegativo() {
        try {
            Diretor diretor = new Diretor(5000.0f, -0.01f, 3.5f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Lucro invalido", e.getMessage());
        }
    }

}