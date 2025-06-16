import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    void deveRetornarEstadoNaturalidadeAluno() {
        Aluno aluno = new Aluno();
        Cidade naturalidade = new Cidade();
        naturalidade.setNome("Juiz de Fora");
        Estado estado = new Estado();
        estado.setNome("MG");
        naturalidade.setEstado(estado);
        aluno.setNaturalidade(naturalidade);
        assertEquals("MG", aluno.getEstadoNaturalidadeAluno());
    }

    @Test
    public void deveRetornarEstadoAlunoEstuda() {
        Estado estado = new Estado();
        estado.setNome("MG");
        Cidade cidade = new Cidade();
        cidade.setNome("Juiz de Fora");
        cidade.setEstado(estado);
        Escola escola = new Escola();
        escola.setCidade(cidade);
        Curso curso = new Curso();
        curso.setEscola(escola);
        Aluno aluno = new Aluno();
        aluno.setCurso(curso);
        assertEquals("MG", aluno.getEstadoAlunoEstuda());
    }

    @Test
    public void deveRetornarCoordenadorCursoAluno() {
        Professor coordenador = new Professor();
        coordenador.setNome("Marcão");
        Curso curso = new Curso();
        curso.setCoordenacao(coordenador);
        Aluno aluno = new Aluno();
        aluno.setCurso(curso);
        assertEquals("Marcão", aluno.getCoordenadorCursoAluno());
    }
}