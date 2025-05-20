package atividade02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void deveCalcularSalario() {
        Funcionario funcionarioComum = new FuncionarioComum(500);
        funcionarioComum.setSalarioMensal(500.0f);
        assertEquals(500.0f, funcionarioComum.calcularPagamento(), 0.1f);
    }

    @Test
    void deveLancarExcecaoSalarioZerado() {
        try {
            Funcionario funcionario = new FuncionarioComum(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSalarioNegativo() {
        try {
            Funcionario funcionario = new FuncionarioComum(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }
}