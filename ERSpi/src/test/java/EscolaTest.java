import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarEscolaridadeDiretor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Mestrado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        assertEquals("Mestrado", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarDiretorSemEscolaridade() {
        Curso curso = new Curso();
        assertEquals("Pessoa sem escolaridade", curso.getEscolaridadeProfessor());
    }
}