package atividade05;

public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, float precoUnitario, int quantidadeEstoque, float precoTotal, int quantidadeComprada){
        super(nome, precoUnitario, quantidadeEstoque, precoTotal, quantidadeComprada);
    }

    public float calcularPreco() {
        if (quantidadeComprada <= quantidadeEstoque){
            return precoTotal = (precoUnitario * quantidadeComprada);
        } else {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
    }
}
