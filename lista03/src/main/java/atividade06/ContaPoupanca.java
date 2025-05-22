package atividade06;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numeroConta, float saldo, String titular) {
        super(numeroConta, saldo, titular);
    }

    public float depositar(float valor, float taxa) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        return this.saldo = (this.saldo + valor);
    }

    public float sacar(float valor, float taxa) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        return this.saldo = (this.saldo - valor);
    }

    public float calcularJuros(float taxa) {
        float juros = this.saldo * (taxa/100);
        if (juros <= 0) {
            throw new IllegalArgumentException("Juros invalidos");
        }
        return this.saldo = this.saldo + juros;
    }
}
