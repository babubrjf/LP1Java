package exercicio06;

public class Semanal extends Vaga {

    private int numSemanas;

    public int getNumSemanas() {
        return this.numSemanas;
    }

    public void setNumSemanas(int numSemanas) {
        this.numSemanas = numSemanas;
    }

    public float calcularValor() {
        return this.numSemanas * 40.0f;
    }
}
