package atividade02;

public class Funcionario {

    private float salarioBruto;
    private float salarioLiquido;
    private float salarioTotal;
    private float valorHorasExtras;
    private float numeroHorasExtras;

    public float getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(float salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(float salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public float getValorHorasExtras() {
        return valorHorasExtras;
    }

    public void setValorHorasExtras(float valorHorasExtras) {
        this.valorHorasExtras = valorHorasExtras;
    }

    public float getNumeroHorasExtras() {
        return numeroHorasExtras;
    }

    public void setNumeroHorasExtras(float numeroHorasExtras) {
        this.numeroHorasExtras = numeroHorasExtras;
    }

    public float valorHorasExtras() {
        return this.valorHorasExtras = this.valorHorasExtras * this.numeroHorasExtras;
    }

    public float salarioTotal() {
        return this.salarioTotal = (this.salarioBruto + (this.valorHorasExtras * this.numeroHorasExtras));
    }

    public float salarioLiquido() {
        return this.salarioLiquido = (float) (this.salarioTotal - this.salarioTotal * 0.08);
    }
}
