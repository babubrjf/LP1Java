package exercicio02;

public class CorrenteEspecial extends ContaBancaria {

    private float limite;

    public float getLimite() {
        return this.limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float informarSaldo() {
        return getSaldo() + this.limite;
    }

    public float informarLimite() {
        return this.limite;
    }
}