import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveRetornarNomeProfessorTurma() {
        Turma turma = new Turma();
        Professor professor = new Professor();
        professor.setNome("Marco Antônio");
        turma.setProfessor(professor);
        assertEquals("Marco Antônio", turma.retornarNomeProfessorTurma());
    }

    @Test
    void deveRetornarNomeAlunosTurma() {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Joao");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Pablo");
        Aluno aluno3 = new Aluno();
        aluno3.setNome("Pedro");
        Aluno aluno4 = new Aluno();
        aluno4.setNome("Luiz");
        Aluno aluno5 = new Aluno();
        aluno5.setNome("Carlos");
        Turma turma = new Turma();
        turma.addAluno(aluno1);
        turma.addAluno(aluno2);
        turma.addAluno(aluno3);
        turma.addAluno(aluno4);
        turma.addAluno(aluno5);
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Joao");
        lista.add("Pablo");
        lista.add("Pedro");
        lista.add("Luiz");
        lista.add("Carlos");
        assertEquals(lista, turma.retornarNomesAlunosTurma());
    }

    @Test
    void deveVerificarAlunoTurma () {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Turma turma = new Turma();
        turma.addAluno(aluno1);
        turma.addAluno(aluno2);
        assertTrue(turma.verificarAluno(aluno2));
    }

    @Test
    void deveRemoverAlunoTurma () {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Turma turma = new Turma();
        turma.addAluno(aluno1);
        turma.addAluno(aluno2);
        turma.remAluno(aluno2);
        assertFalse(turma.verificarAluno(aluno2));
    }
}