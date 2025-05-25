package atividade03;

public abstract class Produto {

    protected String nome;
    protected float precoBase;

    public Produto(String nome, float precoBase){
        this.setNome(nome);
        this.setPrecoBase(precoBase);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().equals("")) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome.trim();
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        if (precoBase <= 0) {
            throw new IllegalArgumentException("Preco base invalido");
        }
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco(float precoBase);
}