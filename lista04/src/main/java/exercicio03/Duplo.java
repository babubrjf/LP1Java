package exercicio03;

public class Duplo extends Reserva {

    private int refeicoes;


    public int getRefeicoes() {
        return refeicoes;
    }

    public void setRefeicoes(int refeicoes) {
        this.refeicoes = refeicoes;
    }

    public float calcularReserva() {
        return getDias() * 80.0f + this.refeicoes * 10.0f;
    }
}