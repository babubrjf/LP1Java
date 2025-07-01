package exemplo;

import java.util.ArrayList;

public class Departamento {

    private ArrayList<Funcionario> funcionarios;

    public Departamento() {
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public ArrayList getFuncionarios() {
        return this.funcionarios;
    }

    public void setFuncionarios(ArrayList funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void alocar(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public int getNumeroFuncionarios() {
        return this.funcionarios.size();
    }

    public float calcularFolhaPagamento() {
        float salario;
        float totalFolhaPagamento = 0.0f;
        for (Funcionario funcionario : this.funcionarios) {
            salario = funcionario.calcularSalario();
            totalFolhaPagamento += salario;
        }
        return totalFolhaPagamento;
    }

    public boolean verificarFuncionarioPeloNome(String nome) {
        boolean achou = false;
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                achou = true;
            }
        }
        return achou;
    }

    public boolean verificarFuncionario(Funcionario funcionario) {
        return this.funcionarios.contains(funcionario);
    }

    public void desalocar(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public ArrayList<String> obterNomesFuncionarios() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Funcionario funcionario : this.funcionarios) {
            resultado.add(funcionario.getNome());
        }
        return resultado;
    }

    public boolean verificarListaFuncionarios(ArrayList<String> lista) {
        int contador = 0;
//        for (Funcionario funcionario : this.funcionarios) {
//            if (lista.contains(funcionario.getNome())) {
//                contador += 1;
//            }
//        }
        for (String nome : lista) {
            if (this.verificarFuncionarioPeloNome(nome)) {
                contador += 1;
            }
        }
        return (contador == this.funcionarios.size());
    }

    public void alocarUnico(Funcionario funcionario)
    {
        if (!this.funcionarios.contains(funcionario)) {
            this.funcionarios.add(funcionario);
        }
    }


}
