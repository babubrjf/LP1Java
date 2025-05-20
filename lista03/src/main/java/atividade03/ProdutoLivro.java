package atividade03;

public class ProdutoLivro extends Produto {

    private float precoCapa;

    public float getPrecoCapa() {
        return precoCapa;
    }

    public void setPrecoCapa(float precoCapa) {
        this.precoCapa = precoCapa;
    }

    public float calcularPreco(){
        precoBase = this.precoCapa - (precoCapa*20/100);
        return precoBase;
    }
}
