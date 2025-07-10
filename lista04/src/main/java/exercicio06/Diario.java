package exercicio06;

public class Diario extends Vaga {

    private int numDias;

    public int getNumDias() {
        return this.numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public float calcularValor() {
        return this.numDias * 10.0f;
    }
}
