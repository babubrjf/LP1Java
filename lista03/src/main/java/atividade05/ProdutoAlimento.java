package atividade05;

public class ProdutoAlimento extends Produto {

    public ProdutoAlimento(String nome, float precoUnitario, int quantidadeEstoque, float precoTotal, int quantidadeComprada){
        super(nome, precoUnitario, quantidadeEstoque, precoTotal, quantidadeComprada);
    }

    public float calcularPreco() {
        if (quantidadeComprada <= quantidadeEstoque){
            this.quantidadeEstoque = quantidadeEstoque - this.quantidadeComprada;
            return precoTotal = (precoUnitario * quantidadeComprada);
        } else {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
    }
}
