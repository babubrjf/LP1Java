package atividade02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void devePossuirSalario() {
        Funcionario funcionario = new FuncionarioComum(2000);
        assertEquals(2000, funcionario.getSalarioMensal());
    }

    @Test
    void deveLancarExcecaoSalarioZerado() {
        try {
            Funcionario funcionario = new FuncionarioComum(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSalarioNegativo() {
        try {
            Funcionario funcionario = new FuncionarioComum(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }
}