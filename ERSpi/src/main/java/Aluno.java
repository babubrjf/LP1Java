public class Aluno extends Pessoa {

    private Curso curso;

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getEstadoNaturalidadeAluno() {
        return getNaturalidade().getEstado().getNome();
    }

    public String getEstadoAlunoEstuda() {
        return getCurso().getEscola().getCidade().getEstado().getNome();
    }

    public String getCoordenadorCursoAluno() {
        return getCurso().getCoordenacao().getNome();
    }
}