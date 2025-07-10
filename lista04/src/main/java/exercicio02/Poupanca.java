package exercicio02;

public class Poupanca extends ContaBancaria {

    private float saldo;

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float informarSaldo() {
        return this.saldo;
    }
}