package atividade06;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;
    private String departamento;

    public Funcionario(String nome, String cargo, float salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void receberAumento(float percentual){
        if (percentual < 0) {
            throw new IllegalArgumentException("Porcentagem Inválida");
        }
        this.salario = this.salario + ((this.salario * percentual)/100);
    }

    public void mudarDepartamento(String novoDepartamento){
        this.departamento = novoDepartamento;
    }

    public void exibirDados(){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }
}
