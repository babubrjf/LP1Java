package atividade03;

public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, float precoBase){
        super(nome, precoBase);
    }

    public float calcularPreco(float precoVarejo){
        if (precoVarejo <= 0) {
            throw new IllegalArgumentException("Preco varejo invalido");
        }
        return this.precoBase * 0.9f;
    }
}