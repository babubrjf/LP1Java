import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    Pessoa pessoa;
    Professor professor;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa();
        professor = new Professor();
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
    public void devePossuirTitulacao() {
        professor.setTitulacao("Doutorado");
        assertEquals("Doutorado", professor.getTitulacao());
    }

    @Test
    public void deveTestarTitulacaoValida() {
        try {
            professor.setTitulacao("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Titulação inválida", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeTitulacao() {
        professor = new Professor("Pessoa", "Mestrado");
        assertEquals("Professor: Pessoa, Titulação: Mestrado", professor.retornaNomeTitulacao());
    }
}