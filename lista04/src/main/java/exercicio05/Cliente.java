package exercicio05;

import java.util.ArrayList;

public class Cliente {

    private int codigo;
    private String nome;
    private ArrayList<Manutencao> manutencoes;

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
        this.manutencoes = new ArrayList<Manutencao>();
    }

    public ArrayList getManutencoes() {
        return this.manutencoes;
    }

    public void setManutencoes(ArrayList manutencoes) {
        this.manutencoes = manutencoes;
    }

    public void novaManutencao(Manutencao manutencao) {
        this.manutencoes.add(manutencao);
    }

    public int getQuantidadeManutencoes() {
        return this.manutencoes.size();
    }

    public boolean verificarManutencao(Manutencao manutencao) {
        return this.manutencoes.contains(manutencao);
    }

    public void removerManutencao(Manutencao manutencao) {
        this.manutencoes.remove(manutencao);
    }
}
