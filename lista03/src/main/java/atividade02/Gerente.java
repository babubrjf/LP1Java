package atividade02;

public class Gerente extends Funcionario {
    private float bonus;

    public Gerente(float salarioMensal, float bonus) {
        super(salarioMensal);
        this.setBonus(bonus);
    }

    public float getBonus() {
        return this.bonus;
    }

    public void setBonus(float bonus) {
        if (bonus <= 0) {
            throw new IllegalArgumentException("Bonus invalido");
        }
        this.bonus = bonus;
    }

    public float calcularPagamento() {
        return salarioMensal + this.bonus;
    }
}
