package atividade02;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private float saldo;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getnumeroConta() {
        return numeroConta;
    }

    public void setnumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        this.saldo = (this.saldo + valor);
    }

    public void sacar(float valor) {
        if ((this.saldo - valor) < 0) {
            throw new IllegalArgumentException("Saldo Inválido");
        }
        this.saldo = this.saldo - valor;
    }
}
