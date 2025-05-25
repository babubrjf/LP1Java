package atividade02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveCalcularSalarioGerente() {
        Funcionario funcionario = new Gerente(2400.0f, 550.0f);
        assertEquals(2950.0f, funcionario.calcularPagamento(2950.0f) , 0.01f);
    }

    @Test
    void deveLancarExcecaoSalarioZeradoGerente() {
        try {
            Funcionario funcionario = new Gerente(0, 550.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSalarioNegativoGerente() {
        try {
            Funcionario funcionario = new Gerente(-0.01f, 300.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoBonusZeradoGerente() {
        try {
            Funcionario funcionario = new Gerente(2500.0f, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Bonus invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoBonusNegativoGerente() {
        try {
            Funcionario funcionario = new Gerente(2570.45f, -0.01f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Bonus invalido", e.getMessage());
        }
    }
}