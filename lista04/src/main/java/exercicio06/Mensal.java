package exercicio06;

public class Mensal extends Vaga {

    private int numMeses;

    public int getNumMeses() {
        return this.numMeses;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }

    @Override
    public float calcularValor() {
        return this.numMeses * 150.0f;
    }
}
