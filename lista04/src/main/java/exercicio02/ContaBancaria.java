package exercicio02;

public abstract class ContaBancaria {

    private Cliente cliente;
    private int numero;
    private float saldo;

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Numero da conta invalido.");
        }
        this.numero = numero;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public abstract float informarSaldo();
}
