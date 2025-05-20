package atividade02;

public abstract class Funcionario {

    protected float salarioMensal;

    public Funcionario(float salarioMensal) {
        this.setSalarioMensal(salarioMensal);
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal <= 0) {
            throw new IllegalArgumentException("Salario invalido");
        }
        this.salarioMensal = salarioMensal;
    }

    public abstract float calcularPagamento();
}
