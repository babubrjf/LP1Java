import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {
    Pessoa pessoa;
    Aluno aluno;
    AlunoEnsinoMedio alunoEnsinoMedio;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa();
        aluno = new Aluno();
        alunoEnsinoMedio = new AlunoEnsinoMedio();
    }

    @Test
    public void devePossuirNomeValido() {
        pessoa.setNome("Pessoa");
        assertEquals("Pessoa", pessoa.getNome());
    }

    @Test
    public void deveTestarNomeVazio() {
        try {
            pessoa.setNome("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    public void deveCalcularMedia() {
        aluno.setNota1(8);
        aluno.setNota2(6);
        assertEquals(7, aluno.calcularMedia());
    }

    @Test
    public void deveTestarNota1Negativa() {
        try {
            aluno.setNota1(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota 1 inválida", e.getMessage());
        }
    }

    @Test
    public void deveTestarNota2Negativa() {
        try {
            aluno.setNota2(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota 2 inválida", e.getMessage());
        }
    }

    @Test
    public void deveTestarMediaNegativa() {
        try {
            aluno.setMedia(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Média inválida", e.getMessage());
        }
    }

    @Test
    public void deveTestarNota1MaiorQueDez() {
        try {
            aluno.setNota1(10.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota 1 inválida", e.getMessage());
        }
    }

    @Test
    public void deveTestarNota2MaiorQueDez() {
        try {
            aluno.setNota2(10.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota 2 inválida", e.getMessage());
        }
    }

    @Test
    public void deveTestarMediaMaiorQueDez() {
        try {
            aluno.setMedia(10.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Média inválida", e.getMessage());
        }
    }

    @Test
    public void deveTestarMatriculaNegativa() {
        try {
            aluno.setMatricula(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Matricula inválida", e.getMessage());
        }
    }

    @Test
    public void deveAprovarAlunoEnsinoMedio() {
        alunoEnsinoMedio.setMedia(6);
        alunoEnsinoMedio.alunoAprovado();
        assertTrue(alunoEnsinoMedio.isAprovado());
    }

    @Test
    public void deveReprovarAlunoEnsinoMedio() {
        alunoEnsinoMedio.setMedia(5.9f);
        alunoEnsinoMedio.alunoReprovado();
        assertFalse(alunoEnsinoMedio.isAprovado());
    }
}