public class Pessoa {

    private Cidade naturalidade;
    private Escolaridade escolaridade;
    private String nome;

    public Cidade getNaturalidade() {
        return this.naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeEscolaridade() {
        if (this.escolaridade == null) {
            return "Pessoa sem escolaridade";
        }
        else {
            return this.escolaridade.getNome();
        }
    }

    public String getNomeCidade() {
        if (this.naturalidade == null) {
            return "Pessoa sem naturalidade";
        }
        else {
            return this.naturalidade.getNome();
        }
    }
}