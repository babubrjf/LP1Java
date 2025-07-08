package exercicio07;

public abstract class Fita {

    private String data;
    private String nomeFilme;

    private Cliente cliente;

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNomeFilme() {
        return this.nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public abstract float emprestimo();
}
