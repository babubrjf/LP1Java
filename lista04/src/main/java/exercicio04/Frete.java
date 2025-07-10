package exercicio04;

public abstract class Frete {

    private Cliente cliente;
    private int numero;
    private float valor;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public abstract float calcularFrete();
}
