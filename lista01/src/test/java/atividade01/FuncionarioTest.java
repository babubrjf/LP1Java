package atividade01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario() ;
    }

    @Test
    public void deveCalcularAumento() {
        funcionario.setSalario(1000);
        funcionario.setPorcentagem(50);
        assertEquals(500, funcionario.calcularAumento());
    }

    @Test
    public void deveDefinirSalarioNovo() {
        funcionario.setSalario(1000);
        funcionario.setPorcentagem(50);
        assertEquals(1500, funcionario.calcularSalarioNovo());
    }
}