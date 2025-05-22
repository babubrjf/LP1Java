package atividade06;

public abstract class ContaBancaria {

    protected int numeroConta;
    protected float saldo;
    protected float valor;
    protected String titular;

    public ContaBancaria(int numeroConta, float saldo, float valor, String titular){
        this.setNumeroConta(numeroConta);
        this.setSaldo(saldo);
        this.setValor(valor);
        this.setTitular(titular);
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if (numeroConta < 0) {
            throw new IllegalArgumentException("Numero da conta invalido");
        }
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo invalido");
        }
        this.saldo = saldo;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.valor = valor;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        if (titular.trim().equals("")) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.titular = titular.trim();
    }

    public abstract float depositar();

    public abstract float sacar();

    public abstract float calcularJuros();
}
