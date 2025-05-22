package atividade06;

public class ContaCorrente extends ContaBancaria {

    private float taxaManutencao;

    public ContaCorrente(int numeroConta, float saldo, , float valor, String titular, float taxaManutencao) {
        super(numeroConta, saldo, valor, titular);
        this.setTaxaManutencao(taxaManutencao);
    }

    public float getTaxaManutencao() {
        return this.taxaManutencao;
    }

    public void setTaxaManutencao(float taxaManutencao) {
        if (taxaManutencao < 0) {
            throw new IllegalArgumentException("Taxa invalida");
        }
        this.taxaManutencao = taxaManutencao;
    }

    public float depositar() {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor Inválido");
        }
        return this.saldo = (this.saldo + valor);
    }

    public float sacar() {
        if ((saldo - valor) < 0) {
            throw new IllegalArgumentException("Saldo Inválido");
        }
        return this.saldo = this.saldo - this.valor;
    }

    public float calcularJuros() {
        return 0;
    }
}
