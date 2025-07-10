package exercicio07;

public abstract class Fita {

    private Cliente cliente;
    private String data;
    private String nomeFilme;
    private int dias;

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

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public abstract float emprestimo();
}
