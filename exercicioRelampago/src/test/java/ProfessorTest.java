package IF_OO_20251.ERS35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarDadosProfessor() {
        Professor professor = new Professor("Sandro");
        professor.setTitulacao("Doutor");
        assertEquals("Nome: Sandro - Titulacao: Doutor", professor.obterDados());
    }

}