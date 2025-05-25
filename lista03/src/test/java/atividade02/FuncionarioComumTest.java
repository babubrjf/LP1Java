package atividade02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void deveCalcularSalarioFuncionarioComum() {
        Funcionario funcionario = new FuncionarioComum(2000.0f);
        assertEquals(2000.0, funcionario.calcularPagamento(2000.0f), 0.01);
    }
}