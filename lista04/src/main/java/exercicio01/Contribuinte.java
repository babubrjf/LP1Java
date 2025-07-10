package exercicio01;

import exemplo.Funcionario;

import java.util.ArrayList;

public class Contribuinte {

    private int codigo;
    private String nome;
    private ArrayList<Imovel> imoveis;

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

    public Contribuinte() {
        this.imoveis = new ArrayList<Imovel>();
    }

    public ArrayList getImoveis() {
        return this.imoveis;
    }

    public void setImoveis(ArrayList imoveis) {
        this.imoveis = imoveis;
    }

    public void adicionarImovel(Imovel imovel) {
        this.imoveis.add(imovel);
    }

    public int getQuantidadeImoveis() {
        return this.imoveis.size();
    }

    public float calcularTotalIPTU() {
        float total = 0.0f;
        for (Imovel imovel : this.imoveis) {
            total += imovel.calcularIPTU();
        }
        return total;
    }

    public boolean verificarImovel(Imovel imovel) {
        return this.imoveis.contains(imovel);
    }

    public void removerImovel(Imovel imovel) {
        this.imoveis.remove(imovel);
    }
}
