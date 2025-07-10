package exercicio08;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarZeroAlunos() {
        Curso curso = new Curso();
        assertEquals(0, curso.getQuantidadeAlunos());
    }

    @Test
    void deveRetornarUmAluno() {
        Curso curso = new Curso();
        Aluno aluno = new Mensalista();
        curso.alocar(aluno);
        assertEquals(1, curso.getQuantidadeAlunos());
    }

    @Test
    void deveRetornarMaisDeUmAluno() {
        Curso curso = new Curso();
        Mensalista aluno = new Mensalista();
        curso.alocar(aluno);
        curso.alocar(aluno);
        assertEquals(2, curso.getQuantidadeAlunos());
    }

    @Test
    void deveEncontrarNomeAluno() {
        Mensalista aluno1 = new Mensalista();
        aluno1.setNome("Joao");
        BolsistaIntegral aluno2 = new BolsistaIntegral();
        aluno2.setNome("Pedro");
        Curso curso = new Curso();
        curso.alocar(aluno1);
        curso.alocar(aluno2);
        assertTrue(curso.verificarAlunoPeloNome("Pedro"));
    }

    @Test
    void naoDeveEncontrarNomeAluno() {
        Mensalista aluno1 = new Mensalista();
        aluno1.setNome("Joao");
        BolsistaIntegral aluno2 = new BolsistaIntegral();
        aluno2.setNome("Pedro");
        Curso curso = new Curso();
        curso.alocar(aluno1);
        curso.alocar(aluno2);
        assertFalse(curso.verificarAlunoPeloNome("Ana"));
    }

    @Test
    void deveEncontrarAluno() {
        Mensalista aluno1 = new Mensalista();
        BolsistaIntegral aluno2 = new BolsistaIntegral();
        Curso curso = new Curso();
        curso.alocar(aluno1);
        curso.alocar(aluno2);
        assertTrue(curso.verificarAluno(aluno2));
    }

    @Test
    void naoDeveEncontrarAluno() {
        Mensalista aluno1 = new Mensalista();
        BolsistaIntegral aluno2 = new BolsistaIntegral();
        Curso curso = new Curso();
        curso.alocar(aluno1);
        assertFalse(curso.verificarAluno(aluno2));
    }

    @Test
    void deveDesalocarAluno() {
        Mensalista aluno1 = new Mensalista();
        BolsistaIntegral aluno2 = new BolsistaIntegral();
        Curso curso = new Curso();
        curso.alocar(aluno1);
        curso.alocar(aluno2);
        curso.desalocar(aluno2);
        assertFalse(curso.verificarAluno(aluno2));
    }

    @Test
    void deveRetornarListaAlunos() {
        Mensalista aluno1 = new Mensalista();
        BolsistaIntegral aluno2 = new BolsistaIntegral();
        Curso curso = new Curso();
        curso.alocar(aluno1);
        curso.alocar(aluno2);
        ArrayList<Aluno> lista = new ArrayList<Aluno>();
        lista.add(aluno1);
        lista.add(aluno2);
        assertEquals(lista, curso.getAlunos());
    }

    @Test
    void deveRetornarListaNomesAlunos() {
        Mensalista aluno1 = new Mensalista();
        aluno1.setNome("Joao");
        BolsistaIntegral aluno2 = new BolsistaIntegral();
        aluno2.setNome("Pedro");
        Curso curso = new Curso();
        curso.alocar(aluno1);
        curso.alocar(aluno2);
        ArrayList<String> resposta = new ArrayList<String>();
        resposta.add("Joao");
        resposta.add("Pedro");
        assertEquals(resposta, curso.obterNomesAlunos());
    }

    @Test
    void deveRetornarListaNomesAlunosOrdenados() {
        Mensalista aluno1 = new Mensalista();
        aluno1.setNome("Joao");
        BolsistaIntegral aluno2 = new BolsistaIntegral();
        aluno2.setNome("Pedro");
        Curso curso = new Curso();
        curso.alocar(aluno1);
        curso.alocar(aluno2);
        ArrayList<String> resposta = new ArrayList<String>();
        resposta.add("Pedro");
        resposta.add("Joao");
        assertTrue(curso.verificarListaAlunos(resposta));
    }

    @Test
    void deveRetornarListaNomesAlunosRepetidos() {
        Mensalista aluno1 = new Mensalista();
        aluno1.setNome("Joao");
        BolsistaIntegral aluno2 = new BolsistaIntegral();
        aluno2.setNome("Pedro");
        BolsistaParcial aluno3 = new BolsistaParcial();
        aluno3.setNome("Joao");
        Curso curso = new Curso();
        curso.alocar(aluno1);
        curso.alocar(aluno2);
        curso.alocar(aluno3);
        ArrayList<String> resposta = new ArrayList<String>();
        resposta.add("Pedro");
        resposta.add("Joao");
        assertFalse(curso.verificarListaAlunos(resposta));
    }

    @Test
    void naoDeveAlocarAlunoRepetido() {
        Mensalista aluno = new Mensalista();
        Curso curso = new Curso();
        curso.alocarUnico(aluno);
        curso.alocarUnico(aluno);
        assertEquals(1, curso.getQuantidadeAlunos());
    }
}