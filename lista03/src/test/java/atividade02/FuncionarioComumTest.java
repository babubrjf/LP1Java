package atividade02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void deveCalcularSalarioFuncionarioComum() {
        Funcionario funcionario = new FuncionarioComum(2000.0f);
        assertEquals(2000.0, funcionario.calcularPagamento());
    }

    @Test
    void deveLancarExcecaoSalarioZeradoFuncionarioComum() {
        try {
            Funcionario funcionario = new FuncionarioComum(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSalarioNegativoFuncionarioComum() {
        try {
            Funcionario funcionario = new FuncionarioComum(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }
}