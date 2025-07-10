package exercicio03;

import java.util.ArrayList;

public class Hospede {

    private int codigo;
    private String nome;
    private ArrayList<Reserva> reservas;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Hospede() {
        this.reservas = new ArrayList<Reserva>();
    }

    public ArrayList getReservas() {
        return this.reservas;
    }

    public void setReservas(ArrayList reservas) {
        this.reservas = reservas;
    }

    public void reservar(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public int getQuantidadeReservas() {
        return this.reservas.size();
    }

    public boolean verificarReserva(Reserva reserva) {
        return this.reservas.contains(reserva);
    }

    public void removerReserva(Reserva reserva) {
        this.reservas.remove(reserva);
    }
}