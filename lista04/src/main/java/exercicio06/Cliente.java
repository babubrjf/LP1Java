package exercicio06;

import java.util.ArrayList;

public class Cliente {

    private int codigo;
    private String nome;
    private ArrayList<Vaga> vagas;

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
        this.vagas = new ArrayList<Vaga>();
    }

    public ArrayList getVagas() {
        return this.vagas;
    }

    public void setVagas(ArrayList vagas) {
        this.vagas = vagas;
    }

    public void criarVaga(Vaga vaga) {
        this.vagas.add(vaga);
    }

    public int getQuantidadeVagas() {
        return this.vagas.size();
    }

    public boolean verificarVaga(Vaga vaga) {
        return this.vagas.contains(vaga);
    }

    public void removerVaga(Vaga vaga) {
        this.vagas.remove(vaga);
    }
}
