package atividade03;

public class ProdutoLivro extends Produto {

    public ProdutoLivro(String nome, float precoBase){
        super(nome, precoBase);
    }

    public float calcularPreco(float precoCapa){
        if (precoCapa <= 0) {
            throw new IllegalArgumentException("Preco capa invalido");
        }
        return this.precoBase * 0.95f;
    }
}
