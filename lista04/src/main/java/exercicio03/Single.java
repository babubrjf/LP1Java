package exercicio03;

public class Single extends Reserva {

    private int dias;

    public int getDias() {
        return this.dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float calcularReserva() {
        return this.dias * 50.0f;
    }
}