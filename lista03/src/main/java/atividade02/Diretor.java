package atividade02;

public class Diretor extends Funcionario {

    private float participacaoLucros;

    public Diretor(float salarioMensal) {
        super(salarioMensal);
    }

    public float getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(float participacaoLucros) {
        if (participacaoLucros <= 0) {
            throw new IllegalArgumentException("Bonus invalido");
        }
        this.participacaoLucros = participacaoLucros;
    }

    public float calcularPagamento() {
        this.salarioMensal = salarioMensal*(this.participacaoLucros/100);
        return salarioMensal;
    }
}
