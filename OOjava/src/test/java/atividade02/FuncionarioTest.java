package atividade02;

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
    public void deveCalcularValorHorasExtras() {
        funcionario.setNumeroHorasExtras(5);
        funcionario.setValorHorasExtras(10);
        assertEquals(50, funcionario.valorHorasExtras());
    }

    @Test
    public void deveCalcularSalarioTotal() {
        funcionario.setSalarioBruto(1000);
        funcionario.setNumeroHorasExtras(5);
        funcionario.setValorHorasExtras(10);
        assertEquals(1050, funcionario.salarioTotal());
    }

    @Test
    public void deveCalcularSalarioLiquido() {
        funcionario.setSalarioTotal(1050);
        assertEquals(966, funcionario.salarioLiquido());
    }
}