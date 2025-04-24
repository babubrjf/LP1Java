package atividade01;

public class Funcionario {

    private float salario;
    private float porcentagem;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }

    public float calcularAumento() {
        return this.salario * this.porcentagem / 100;
    }

    public float calcularSalarioNovo() {
        return this.salario + this.calcularAumento();
    }
}
