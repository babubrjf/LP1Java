package exercicio06;

public abstract class Vaga {

    private int numero;
    private String placa;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public abstract float calcularValor();

}
