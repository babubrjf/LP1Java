package atividade02;

public class Gerente extends Funcionario {
    private float bonusFixo;

    public Gerente(float salarioMensal) {
        super(salarioMensal);
    }

    public float getBonusFixo() {
        return bonusFixo;
    }

    public void setBonusFixo(float bonusFixo) {
        if (bonusFixo <= 0) {
            throw new IllegalArgumentException("Bonus invalido");
        }
        this.bonusFixo = bonusFixo;
    }

    public float calcularPagamento() {
        this.salarioMensal = salarioMensal*(this.bonusFixo/100);
        return salarioMensal;
    }
}
