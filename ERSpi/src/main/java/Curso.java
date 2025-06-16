public class Curso {

    private Professor coordenacao;
    private Escola escola;
    private TipoEnsino tipoEnsino;

    public Professor getCoordenacao() {
        return this.coordenacao;
    }

    public void setCoordenacao(Professor coordenacao) {
        this.coordenacao = coordenacao;
    }

    public Escola getEscola() {
        return this.escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public TipoEnsino getTipoEnsino() {
        return this.tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }
}