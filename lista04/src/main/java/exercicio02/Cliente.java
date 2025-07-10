package exercicio02;

import java.util.ArrayList;

public class Cliente {

    private int codigo;
    private String nome;
    private ArrayList<ContaBancaria> contasBancarias;

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

    public Cliente() {
        this.contasBancarias = new ArrayList<ContaBancaria>();
    }

    public ArrayList getContasBancarias() {
        return this.contasBancarias;
    }

    public void setContasBancarias(ArrayList contasBancarias) {
        this.contasBancarias = contasBancarias;
    }

    public void adicionarConta(ContaBancaria contaBancaria) {
        this.contasBancarias.add(contaBancaria);
    }

    public int getQuantidadeContas() {
        return this.contasBancarias.size();
    }

    public boolean verificarConta(ContaBancaria contaBancaria) {
        return this.contasBancarias.contains(contaBancaria);
    }

    public void removerContaBancaria(ContaBancaria contaBancaria) {
        this.contasBancarias.remove(contaBancaria);
    }
}
