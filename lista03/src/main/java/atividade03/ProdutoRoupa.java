package atividade03;

public class ProdutoRoupa extends Produto {

    private float precoEtiqueta;

    public ProdutoRoupa(String nome, float precoBase, float precoEtiqueta){
        super(nome, precoBase);
        this.setPrecoEtiqueta(precoEtiqueta);
    }

    public float getPrecoEtiqueta() {
        return precoEtiqueta;
    }

    public void setPrecoEtiqueta(float precoEtiqueta) {
        if (precoEtiqueta <= 0) {
            throw new IllegalArgumentException("Preco roupa invalido");
        }
        this.precoEtiqueta = precoEtiqueta;
    }

    public float calcularPreco(){
        precoBase = this.precoEtiqueta - (precoEtiqueta*5/100);
        return precoBase;
    }
}
