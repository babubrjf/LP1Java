import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Timer;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarNomesProfessoresTurmasCurso() {
        Professor prof1 = new Professor();
        prof1.setNome("Marco Antônio");
        Professor prof2 = new Professor();
        prof2.setNome("Sandro");
        Turma turma1 = new Turma();
        turma1.setProfessor(prof1);
        Turma turma2 = new Turma();
        turma2.setProfessor(prof2);
        Curso curso = new Curso();
        curso.addTurma(turma1);
        curso.addTurma(turma2);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Marco Antônio");
        lista.add("Sandro");
        assertEquals(lista, curso.retornarNomesProfessoresTurmasCurso());
    }

    @Test
    void deveRetornarNomesAlunosTurmaCurso () {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Pablo");
        Aluno aluno3 = new Aluno();
        aluno3.setNome("Pedro");
        Aluno aluno4 = new Aluno();
        aluno4.setNome("Luiz");
        Aluno aluno5 = new Aluno();
        aluno5.setNome("Carlos");
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno2);
        turma1.addAluno(aluno3);
        turma2.addAluno(aluno4);
        turma2.addAluno(aluno5);
        Curso curso = new Curso();
        curso.addTurma(turma1);
        curso.addTurma(turma2);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("João");
        lista.add("Pablo");
        lista.add("Pedro");
        lista.add("Luiz");
        lista.add("Carlos");
        assertEquals(lista, curso.retornarNomesAlunosTurmasCurso());
    }

    @Test
    void deveRetornarNomesAlunosRegistradosCurso () {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Pablo");
        Aluno aluno3 = new Aluno();
        aluno3.setNome("Pedro");
        Aluno aluno4 = new Aluno();
        aluno4.setNome("Luiz");
        Aluno aluno5 = new Aluno();
        aluno5.setNome("Carlos");
        Curso curso = new Curso();
        curso.addAluno(aluno1);
        curso.addAluno(aluno2);
        curso.addAluno(aluno3);
        curso.addAluno(aluno4);
        curso.addAluno(aluno5);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("João");
        lista.add("Pablo");
        lista.add("Pedro");
        lista.add("Luiz");
        lista.add("Carlos");
        assertEquals(lista, curso.retornarNomesAlunosRegistradosCurso());
    }

    @Test
    void deveRetornarDisciplinasTurmaCurso () {
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matemática");
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Português");
        Disciplina disciplina3 = new Disciplina();
        disciplina3.setNome("História");
        Turma turma1 = new Turma();
        turma1.setDisciplina(disciplina1);
        Turma turma2 = new Turma();
        turma2.setDisciplina(disciplina2);
        Turma turma3 = new Turma();
        turma3.setDisciplina(disciplina3);
        Curso curso = new Curso();
        curso.addTurma(turma1);
        curso.addTurma(turma2);
        curso.addTurma(turma3);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Matemática");
        lista.add("Português");
        lista.add("História");
        assertEquals(lista, curso.retornarNomesDisciplinasTurmasCurso());
    }

    @Test
    void deveVerificarAlunoCurso () {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Curso curso = new Curso();
        curso.addAluno(aluno1);
        curso.addAluno(aluno2);
        assertTrue(curso.verificarAluno(aluno1));
    }

    @Test
    void deveVerificarTurmaCurso () {
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
        Curso curso = new Curso();
        curso.addTurma(turma1);
        curso.addTurma(turma2);
        assertTrue(curso.verificarTurma(turma1));
    }

    @Test
    void deveRemoverTurmaCurso () {
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
        Curso curso = new Curso();
        curso.addTurma(turma1);
        curso.addTurma(turma2);
        curso.remTurma(turma1);
        assertFalse(curso.verificarTurma(turma1));
    }

    @Test
    void deveRemoverAlunoCurso () {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Curso curso = new Curso();
        curso.addAluno(aluno1);
        curso.addAluno(aluno2);
        curso.remAluno(aluno2);
        assertFalse(curso.verificarAluno(aluno2));
    }
}