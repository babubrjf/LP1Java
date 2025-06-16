import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {

    @Test
    void deveRetornarEscolaridadeProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        assertEquals("Doutorado", professor.getNomeEscolaridade());
    }

    @Test
    public void deveRetornarEscolaridadeCoordenadorCurso() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        Professor coordenador = new Professor();
        coordenador.setEscolaridade(escolaridade);
        Curso curso = new Curso();
        curso.setCoordenacao(coordenador);
        assertEquals("Doutorado", coordenador.getNomeEscolaridade());
    }

    @Test
    public void deveRetornarEscolaridadeDiretorEscola() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        Professor diretor = new Professor();
        diretor.setEscolaridade(escolaridade);
        Escola escola = new Escola();
        escola.setDirecao(diretor);
        assertEquals("Doutorado", diretor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarCidadeNaturalidadeProfessor() {
        Cidade naturalidade = new Cidade();
        naturalidade.setNome("Juiz de Fora");
        Professor professor = new Professor();
        professor.setNaturalidade(naturalidade);
        assertEquals("Juiz de Fora", professor.getNomeCidade());
    }

    @Test
    public void deveRetornarTipoEnsinoProfessor() {
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setNome("Superior");
        Curso curso = new Curso();
        curso.setTipoEnsino(tipoEnsino);
        Professor professor = new Professor();
        professor.setContratacao(curso);
        assertEquals("Superior", professor.getTipoEnsinoProfessor());
    }

    @Test
    public void deveRetornarNomeDiretorProfessor() {
        Professor professor = new Professor();
        professor.setNome("Professor");
        Curso curso = new Curso();
        professor.setContratacao(curso);
        Professor diretor = new Professor();
        diretor.setNome("Diretor");
        Escola escola = new Escola();
        escola.setDirecao(diretor);
        curso.setEscola(escola);
        assertEquals("Diretor", professor.getNomeDiretorProfessor());
    }

    @Test
    public void deveRetornarNomeCoordenadorProfessor() {
        Professor professor = new Professor();
        professor.setNome("Professor");
        Curso curso = new Curso();
        professor.setContratacao(curso);
        Professor coordenador = new Professor();
        coordenador.setNome("Coordenador");
        curso.setCoordenacao(coordenador);
        assertEquals("Coordenador", professor.getNomeCoordenadorProfessor());
    }
}