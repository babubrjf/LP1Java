package atividade05;

public class ProdutoRoupa extends Produto {

    private float precoEtiqueta;
    private float percentualDesconto;

    public ProdutoRoupa(String nome, float precoUnitario, int quantidadeEstoque, float precoTotal, int quantidadeComprada){
        super(nome, precoUnitario, quantidadeEstoque, precoTotal, quantidadeComprada);
        this.setPrecoEtiqueta(precoEtiqueta);
        this.setPercentualDesconto(percentualDesconto);
    }

    public float getPercentualDesconto() {
        return this.percentualDesconto;
    }

    public void setPercentualDesconto(float percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public float getPrecoEtiqueta() {
        return this.precoEtiqueta;
    }

    public void setPrecoEtiqueta(float precoEtiqueta) {
        this.precoEtiqueta = precoEtiqueta;
    }

    public float calcularPreco() {
        if (quantidadeComprada <= quantidadeEstoque){
            precoTotal = (precoEtiqueta * quantidadeComprada);
            return precoTotal = precoTotal - (precoTotal*percentualDesconto/100);
        } else {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
    }
}
