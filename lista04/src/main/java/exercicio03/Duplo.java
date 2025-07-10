package exercicio03;

public class Duplo extends Reserva {

    private int dias;
    private int refeicoes;

    public int getDias() {
        return this.dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getRefeicoes() {
        return refeicoes;
    }

    public void setRefeicoes(int refeicoes) {
        this.refeicoes = refeicoes;
    }

    public float calcularReserva() {
        return this.dias * 80.0f + this.refeicoes * 10.0f;
    }
}