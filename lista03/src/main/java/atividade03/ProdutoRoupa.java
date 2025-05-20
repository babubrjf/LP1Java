package atividade03;

public class ProdutoRoupa extends Produto {

    private float precoEtiqueta;

    public float getPrecoEtiqueta() {
        return precoEtiqueta;
    }

    public void setPrecoEtiqueta(float precoEtiqueta) {
        this.precoEtiqueta = precoEtiqueta;
    }

    public float calcularPreco(){
        precoBase = this.precoEtiqueta - (precoEtiqueta*5/100);
        return precoBase;
    }
}
