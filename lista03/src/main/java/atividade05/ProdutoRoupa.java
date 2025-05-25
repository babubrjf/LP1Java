package atividade05;

public class ProdutoRoupa extends Produto {

    public ProdutoRoupa(String nome, float precoEtiqueta, int quantidadeEstoque){
        super(nome, precoEtiqueta, quantidadeEstoque);
    }

    public float calcularPreco(int quantidadeComprada, float desconto) {
        if (quantidadeComprada > this.quantidadeEstoque){
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        this.quantidadeEstoque -= quantidadeComprada;
        return (precoUnitario * quantidadeComprada) - ((precoUnitario * quantidadeComprada) * desconto/100);
    }
}
