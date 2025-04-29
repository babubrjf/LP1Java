package atividade05;

public class Produto {
    private String nome;
    private float preco;
    private int quantidadeEstoque;
    private String categoria;

    public Produto(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidadeEstoque = (this.quantidadeEstoque + quantidade);
    }

    public void removerEstoque(int quantidade){
        if ((this.quantidadeEstoque - quantidade) < 0) {
            throw new IllegalArgumentException("Estoque Inválido");
        }
        this.quantidadeEstoque = (this.quantidadeEstoque - quantidade);
    }

    public void aplicarDesconto(float percentual){
        if (percentual < 0) {
            throw new IllegalArgumentException("Porcentagem Inválida");
        }
        this.preco = this.preco - ((this.preco * percentual)/100);
    }
}
