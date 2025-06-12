import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarNomeEscolaridade() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        assertEquals("Doutorado", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarPessoaSemEscolaridade() {
        Professor professor = new Professor();
        assertEquals("Pessoa sem escolaridade", professor.getNomeEscolaridade());

    }

    @Test
    void deveRetornarNomeCidade() {
        Cidade cidade = new Cidade(new Estado());
        cidade.setNome("Juiz de Fora");
        Professor professor = new Professor();
        professor.setCidade(cidade);
        assertEquals("Juiz de Fora", professor.getNomeCidade());
    }

    @Test
    void deveRetornarExcecaoCidadeNula() {
        try {
            Cidade cidade = new Cidade(new Estado());
            cidade.setNome(null);
            Professor professor = new Professor();
            professor.getNomeCidade();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Cidade invalida", e.getMessage());
        }
    }
}