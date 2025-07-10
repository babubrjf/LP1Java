package exercicio02;

public class CorrenteEspecial extends ContaBancaria {

    private float saldo;
    private float limite;

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return this.limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float informarSaldo() {
        return this.saldo + this.limite;
    }

    public float informarLimite() {
        return this.limite;
    }
}