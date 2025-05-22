package atividade02;

public class FuncionarioComum extends Funcionario {

    public FuncionarioComum(float salarioMensal) {
        super(salarioMensal);
    }

    public float calcularPagamento() {
        return salarioMensal;
    }
}
