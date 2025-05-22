package atividade05;

public abstract class Produto {

    protected String nome;
    protected float precoUnitario;
    protected int quantidadeEstoque;
    protected float precoTotal;
    protected int quantidadeComprada;

    public Produto(String nome, float precoUnitario, int quantidadeEstoque, float precoTotal, int quantidadeComprada){
        this.setNome(nome);
        this.setPrecoUnitario(precoUnitario);
        this.setQuantidadeEstoque(quantidadeEstoque);
        this.setPrecoTotal(precoTotal);
        this.setQuantidadeComprada(quantidadeComprada);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return this.precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getPrecoTotal() {
        return this.precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getQuantidadeComprada() {
        return this.quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public abstract float calcularPreco();
}
