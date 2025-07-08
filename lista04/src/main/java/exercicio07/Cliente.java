package exercicio07;

import java.util.ArrayList;

public class Cliente {

    private int codigo;
    private String nome;

    private ArrayList<Fita> fitas;

    public Cliente() {
        this.fitas = new ArrayList<Fita>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public float calcularTotalEmprestimo() {
        float total = 0.0f;
        for (Fita fita : this.fitas) {
            total += fita.emprestimo();
        }
        return total;
    }
}
