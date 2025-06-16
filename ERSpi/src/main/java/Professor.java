public class Professor extends Pessoa {

    private Curso contratacao;

    public Curso getContratacao() {
        return this.contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public String getTipoEnsinoProfessor() {
        return getContratacao().getTipoEnsino().getNome();
    }

    public String getNomeDiretorProfessor() {
        return getContratacao().getEscola().getDirecao().getNome();
    }

    public String getNomeCoordenadorProfessor() {
        return getContratacao().getCoordenacao().getNome();
    }
}