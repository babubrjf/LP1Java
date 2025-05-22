package atividade05;

public class ProdutoRoupa extends Produto {

    private float percentualDesconto;
    private float precoTotalDesconto;

    public ProdutoRoupa(String nome, float precoUnitario, int quantidadeEstoque, float precoTotal, int quantidadeComprada, float percentualDesconto, float precoTotalDesconto){
        super(nome, precoUnitario, quantidadeEstoque, precoTotal, quantidadeComprada);
        this.setPercentualDesconto(percentualDesconto);
        this.setPrecoTotalDesconto(precoTotalDesconto);
    }

    public float getPercentualDesconto() {
        return this.percentualDesconto;
    }

    public void setPercentualDesconto(float percentualDesconto) {
        if (percentualDesconto < 0) {
            throw new IllegalArgumentException("Desconto invalido");
        }
        this.percentualDesconto = percentualDesconto;
    }

    public float getPrecoTotalDesconto() {
        return this.precoTotalDesconto;
    }

    public void setPrecoTotalDesconto(float precoTotalDesconto) {
        this.precoTotalDesconto = precoTotalDesconto;
    }

    public float calcularPreco() {
        if (quantidadeComprada <= quantidadeEstoque){
            this.quantidadeEstoque = quantidadeEstoque - this.quantidadeComprada;
            precoTotal = precoUnitario*quantidadeComprada;
            return precoTotalDesconto = precoTotal - (precoTotal*percentualDesconto/100);
        } else {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
    }
}
