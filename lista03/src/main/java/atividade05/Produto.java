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
        if (nome.trim().equals("")) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome.trim();
    }

    public float getPrecoUnitario() {
        return this.precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario <= 0){
            throw new IllegalArgumentException("Preco invalido");
        }
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0){
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getPrecoTotal() {
        return this.precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        if (precoTotal < 0){
            throw new IllegalArgumentException("Preco invalido");
        }
        this.precoTotal = precoTotal;
    }

    public int getQuantidadeComprada() {
        return this.quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada < 0){
            throw new IllegalArgumentException("Quantidade invalida");
        }
        this.quantidadeComprada = quantidadeComprada;
    }

    public abstract float calcularPreco();
}
