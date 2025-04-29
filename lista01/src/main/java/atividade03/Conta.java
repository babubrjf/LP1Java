package atividade03;

public class Conta {

    private float quilowatts;
    private double valor;
    private float icms;

    public float getIcms() {
        return icms;
    }

    public void setIcms(float icms) {
        this.icms = icms;
    }

    public float getQuilowatts() {
        return quilowatts;
    }

    public void setQuilowatts(float quilowatts) {
        this.quilowatts = quilowatts;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double valorTotal() {
        return this.valor = ((this.quilowatts * 0.12) * 0.18) + (this.quilowatts * 0.12);
    }
}
