import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class CursoTest {

    @Test
    void deveRetornarNomeProfessorTurmaCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma();
        curso.addTurma(turma);
        Professor professor = new Professor();
        professor.setNome("Marco");
        turma.setProfessor(professor);
        assertEquals("Marco", curso.getTurmas());
    }

    @Test
    void deveRetornarNomeProfessoresTurmaCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma();
        Professor professor1 = new Professor();
        professor1.setNome("Marco");
        Professor professor2 = new Professor();
        professor2.setNome("Sandro");
        Professor professor3 = new Professor();
        professor3.setNome("Ricardo");
        turma.setProfessor(professor1);
        turma.setProfessor(professor2);
        turma.setProfessor(professor3);
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Marco");
        lista.add("Sandro");
        lista.add("Ricardo");
        assertEquals(lista, curso.getTurma().getNomeProfessorTurma());
    }
}