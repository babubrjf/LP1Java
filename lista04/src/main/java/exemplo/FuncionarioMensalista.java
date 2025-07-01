package exemplo;

public class FuncionarioMensalista extends Funcionario {

    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calcularSalario() {
        return this.salario;
    }
}
