package atividade06;

public abstract class ContaBancaria {

    protected int numeroConta;
    protected float saldo;
    protected String titular;

    public ContaBancaria(int numeroConta, float saldo, String titular){
        this.setNumeroConta(numeroConta);
        this.setSaldo(saldo);
        this.setTitular(titular);
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if (numeroConta <= 0) {
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

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        if (titular.trim().equals("")) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.titular = titular.trim();
    }

    public abstract float depositar(float valor, float taxa);

    public abstract float sacar(float valor, float taxa);

    public abstract float calcularJuros(float taxa);
}
