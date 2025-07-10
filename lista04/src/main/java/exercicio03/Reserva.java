package exercicio03;

public abstract class Reserva {

    private Hospede hospede;
    private int dias;

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public abstract float calcularReserva();
}