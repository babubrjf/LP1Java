package atividade06;

import atividade04.Pessoa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FuncionarioTest {
    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario("Pablo", "Desenvolvedor", 1125.0f, "Desenvolvimento");
    }

    @Test
    public void deveReceberAumento() {
        funcionario.setSalario(1125.0f);
        funcionario.receberAumento(20);
        assertEquals(1350.0f, funcionario.getSalario());
    }

    @Test
    public void deveMudarDepartamento() {
        funcionario.setDepartamento("Implantação");
        funcionario.mudarDepartamento("Desenvolvimento");
        assertEquals("Desenvolvimento", funcionario.getDepartamento());
    }

    @Test
    public void deveExibirDadosFuncionario() {
        funcionario.setNome("Pablo");
        funcionario.setCargo("Desenvolvedor");
        funcionario.setSalario(1125.0f);
        funcionario.setDepartamento("Desenvolvimento");
        assertEquals("Pablo",funcionario.getNome());
        assertEquals("Desenvolvedor",funcionario.getCargo());
        assertEquals(1125.0f,funcionario.getSalario());
        assertEquals("Desenvolvimento",funcionario.getDepartamento());
    }

    @Test
    public void deveTestarPercentualNegativo() {
        try {
            funcionario.setSalario(139.9f);
            funcionario.receberAumento(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Porcentagem Inválida", e.getMessage());
        }
    }
}