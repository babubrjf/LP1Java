package atividade03;

public class ProdutoEletronico extends Produto {

    private float precoVarejo;

    public ProdutoEletronico(String nome, float precoBase, float precoVarejo){
        super(nome, precoBase);
        this.setPrecoVarejo(precoVarejo);
    }

    public float getPrecoVarejo() {
        return this.precoVarejo;
    }

    public void setPrecoVarejo(float precoVarejo) {
        if (precoVarejo <= 0) {
            throw new IllegalArgumentException("Preco varejo invalido");
        }
        this.precoVarejo = precoVarejo;
    }

    public float calcularPreco(){
        precoVarejo = this.precoBase - (this.precoBase*10/100);
        return precoVarejo;
    }
}
