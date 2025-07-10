package exercicio07;

import java.util.ArrayList;

public class Cliente {

    private int codigo;
    private String nome;
    private ArrayList<Fita> fitas;

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
        this.fitas = new ArrayList<Fita>();
    }

    public ArrayList getFitas() {
        return this.fitas;
    }

    public void setFitas(ArrayList fitas) {
        this.fitas = fitas;
    }

    public void adicionarFita(Fita fita) {
        this.fitas.add(fita);
    }

    public int getQuantidadeFitas() {
        return this.fitas.size();
    }

    public boolean verificarFita(Fita fita) {
        return this.fitas.contains(fita);
    }

    public void removerFita(Fita fita) {
        this.fitas.remove(fita);
    }
}
