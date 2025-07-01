package exemplo;

public class FuncionarioHorista extends Funcionario
{
    private float salarioHora;
    private int numDias;
    private int numHorasDia;

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public int getNumHorasDia() {
        return numHorasDia;
    }

    public void setNumHorasDia(int numHorasDia) {
        this.numHorasDia = numHorasDia;
    }

    public float calcularSalario() {
        return this.numDias * this.numHorasDia * this.salarioHora;
    }
}
