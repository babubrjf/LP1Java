package atividade05;

public class ProdutoAlimento extends Produto {

    public ProdutoAlimento(String nome, float precoQuilo, int quantidadeEstoque){
        super(nome, precoQuilo, quantidadeEstoque);
    }

    public float calcularPreco(int quantidadeComprada, float desconto) {
        if (quantidadeComprada > this.quantidadeEstoque){
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        this.quantidadeEstoque -= quantidadeComprada;
        return precoUnitario * quantidadeComprada;
    }
}
