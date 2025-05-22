package atividade03;

public class ProdutoLivro extends Produto {

    private float precoCapa;

    public ProdutoLivro(String nome, float precoBase, float precoCapa){
        super(nome, precoBase);
        this.setPrecoCapa(precoCapa);
    }

    public float getPrecoCapa() {
        return precoCapa;
    }

    public void setPrecoCapa(float precoCapa) {
        if (precoCapa <= 0) {
            throw new IllegalArgumentException("Preco capa invalido");
        }
        this.precoCapa = precoCapa;
    }

    public float calcularPreco(){
        precoCapa = this.precoBase - (precoBase*20/100);
        return precoCapa;
    }
}
