package atividade05;

public class ProdutoAlimento extends Produto {

    private float precoKg;

    public ProdutoAlimento(String nome, float precoUnitario, int quantidadeEstoque, float precoTotal, int quantidadeComprada){
        super(nome, precoUnitario, quantidadeEstoque, precoTotal, quantidadeComprada);
        this.setPrecoKg(precoKg);
    }

    public float getPrecoKg() {
        return this.precoKg;
    }

    public void setPrecoKg(float precoKg) {
        this.precoKg = precoKg;
    }

    public float calcularPreco() {
        if (quantidadeComprada <= quantidadeEstoque){
            return precoTotal = (precoKg * quantidadeComprada);
        } else {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
    }
}
