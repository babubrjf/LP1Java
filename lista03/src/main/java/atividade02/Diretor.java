package atividade02;

public class Diretor extends Funcionario {

    private float lucroEmpresa;
    private float percentualParticipacao;

    public Diretor(float salarioMensal, float lucroEmpresa, float percentualParticipacao) {
        super(salarioMensal);
        this.setLucroEmpresa(lucroEmpresa);
        this.setPercentualParticipacao(percentualParticipacao);
    }

    public float getLucroEmpresa() {
        return this.lucroEmpresa;
    }

    public void setLucroEmpresa(float lucroEmpresa) {
        if (lucroEmpresa <= 0) {
            throw new IllegalArgumentException("Lucro invalido");
        }
        this.lucroEmpresa = lucroEmpresa;
    }

    public float getPercentualParticipacao() {
        return this.percentualParticipacao;
    }

    public void setPercentualParticipacao(float percentualParticipacao) {
        if (percentualParticipacao <= 0) {
            throw new IllegalArgumentException("Percentual invalido");
        }
        this.percentualParticipacao = percentualParticipacao;
    }

    public float calcularPagamento() {
        return salarioMensal + (lucroEmpresa * percentualParticipacao/100);
    }
}
