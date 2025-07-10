package exercicio04;

import java.util.ArrayList;

public class Cliente {

    private int codigo;
    private String nome;
    private ArrayList<Frete> fretes;

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
        this.fretes = new ArrayList<Frete>();
    }

    public ArrayList getFretes() {
        return this.fretes;
    }

    public void setFretes(ArrayList fretes) {
        this.fretes = fretes;
    }

    public void novoFrete(Frete frete) {
        this.fretes.add(frete);
    }

    public int getQuantidadeFretes() {
        return this.fretes.size();
    }

    public boolean verificarFrete(Frete frete) {
        return this.fretes.contains(frete);
    }

    public void cancelarFrete(Frete frete) {
        this.fretes.remove(frete);
    }
}
