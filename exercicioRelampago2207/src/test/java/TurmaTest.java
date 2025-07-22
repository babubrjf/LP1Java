import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveRetornarNomeProfessorTurma() {
        Turma turma = new Turma();
        Professor professor = new Professor();
        professor.setNome("Marco");
        turma.setProfessor(professor);
        assertEquals("Marco", turma.getNomeProfessorTurma());
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
        turma.addAlunoTurma(aluno1);
        turma.addAlunoTurma(aluno2);
        turma.addAlunoTurma(aluno3);
        turma.addAlunoTurma(aluno4);
        turma.addAlunoTurma(aluno5);
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Joao");
        lista.add("Pablo");
        lista.add("Pedro");
        lista.add("Luiz");
        lista.add("Carlos");
        assertEquals(lista, turma.obterNomesAlunos());
    }
}