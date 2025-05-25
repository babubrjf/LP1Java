package atividade03;

public class ProdutoRoupa extends Produto {

    public ProdutoRoupa(String nome, float precoBase){
        super(nome, precoBase);
    }

    public float calcularPreco(float precoEtiqueta){
        if (precoEtiqueta <= 0) {
            throw new IllegalArgumentException("Preco etiqueta invalido");
        }
        return this.precoBase * 0.8f;
    }
}
