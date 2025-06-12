public class Pessoa {

    private Escolaridade escolaridade;
    private Cidade cidade;

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNomeEscolaridade() {
        if (this.escolaridade == null) {
            return "Pessoa sem escolaridade";
        } else {
            return this.escolaridade.getNome();
        }
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNomeCidade() {
        if (this.cidade == null) {
            throw new IllegalArgumentException("Cidade invalida");
        } else {
            return this.cidade.getNome();
        }
    }
}
