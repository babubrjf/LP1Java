package atividade02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveCalcularSalarioDiretor() {
        Funcionario funcionario = new Diretor(5500.0f, 50000.0f, 3.5f);
        assertEquals(7250.0f, funcionario.calcularPagamento(7250.0f) , 0.01f);
    }

    @Test
    void deveLancarExcecaoSalarioZeradoDiretor() {
        try {
            Funcionario funcionario = new Diretor(0, 50000.0f, 3.5f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSalarioNegativoDiretor() {
        try {
            Funcionario funcionario = new Diretor(-0.01f, 50000.0f, 3.5f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPercentualZeradoDiretor() {
        try {
            Funcionario funcionario = new Diretor(13000.0f, 50000.0f, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Percentual invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPercentualNegativoDiretor() {
        try {
            Funcionario funcionario = new Diretor(13000.0f, 50000.0f, -0.01f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Percentual invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoLucroEmpresaZerado() {
        try {
            Funcionario funcionario = new Diretor(5000.0f, 0, 3.5f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Lucro invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoLucroEmpresaNegativo() {
        try {
            Funcionario funcionario = new Diretor(5000.0f, -0.01f, 3.5f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Lucro invalido", e.getMessage());
        }
    }

}