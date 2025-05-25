package atividade05;

public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, float precoUnitario, int quantidadeEstoque){
        super(nome, precoUnitario, quantidadeEstoque);
    }

    public float calcularPreco( int quantidadeComprada, float desconto) {
        if (quantidadeComprada > quantidadeEstoque){
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        this.quantidadeEstoque = this.quantidadeEstoque - quantidadeComprada;
        return precoUnitario * quantidadeComprada;
    }
}
