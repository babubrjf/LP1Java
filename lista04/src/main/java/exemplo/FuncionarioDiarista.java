package exemplo;

public class FuncionarioDiarista extends Funcionario {

    private float salarioDia;
    private int numDias;

    public float getSalarioDia() {
        return salarioDia;
    }

    public void setSalarioDia(float salarioDia) {
        this.salarioDia = salarioDia;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public float calcularSalario() {
        return this.numDias * this.salarioDia;
    }
}
