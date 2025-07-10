package exercicio05;

public class CPU extends Manutencao {

    private float valorPecas;

    public float getValorPecas() {
        return this.valorPecas;
    }

    public void setValorPecas(float valorPecas) {
        this.valorPecas = valorPecas;
    }

    public float calcularManutencao() {
        return getMaoDeObra() + this.valorPecas;
    }
}
