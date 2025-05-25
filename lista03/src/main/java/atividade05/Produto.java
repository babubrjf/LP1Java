package atividade05;

public abstract class Produto {

    protected String nome;
    protected float precoUnitario;
    protected int quantidadeEstoque;

    public Produto(String nome, float precoUnitario, int quantidadeEstoque){
        this.setNome(nome);
        this.setPrecoUnitario(precoUnitario);
        this.setQuantidadeEstoque(quantidadeEstoque);
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
            throw new IllegalArgumentException("Estoque invalido");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public abstract float calcularPreco(int quantidadeComprada, float desconto);
}
