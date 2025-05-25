package atividade06;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numeroConta, float saldo, String titular) {
        super(numeroConta, saldo, titular);
    }

    public float depositar(float valor, float taxa) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        return this.saldo = (this.saldo + valor) - ((this.saldo + valor)*taxa/100);
    }

    public float sacar(float valor, float taxa) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        } else if (taxa <= 0) {
            throw new IllegalArgumentException("Taxa invalida");
        }
        return this.saldo = (this.saldo - valor) - ((this.saldo - valor)*taxa/100);
    }

    public float calcularJuros(float taxa) {
        return 0;
    }
}
