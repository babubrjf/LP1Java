public class Professor extends Pessoa {
    private String titulacao;

    public Professor(String nome, String titulacao) {
        super(nome);
        this.titulacao = titulacao;
    }

    public Professor() {

    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        if (titulacao == null || titulacao.isBlank()) {
            throw new IllegalArgumentException("Titulação inválida");
        }
        this.titulacao = titulacao;
    }

    public String retornaNomeTitulacao() {
        return "Professor: " + getNome() + ", Titulação: " + titulacao;
    }
}
