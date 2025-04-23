package atividade01;

public class Funcionario {

    private float salario;
    private float aumento;
    private float salarioNovo;
    private float porcentagem;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getAumento() {
        return aumento;
    }

    public void setAumento(float aumento) {
        this.aumento = aumento;
    }

    public float getSalarioNovo() {
        return salarioNovo;
    }

    public void setSalarioNovo(float salarioNovo) {
        this.salarioNovo = salarioNovo;
    }

    public float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }

    public float aumento() {
        return this.salario * this.porcentagem / 100;
    }

    public float salarioNovo() {
        return this.salario + this.aumento;
    }
}
