package atividade03;

public class ProdutoEletronico extends Produto {

    private float precoVarejo;

    public float getPrecoVarejo() {
        return precoVarejo;
    }

    public void setPrecoVarejo(float precoVarejo) {
        this.precoVarejo = precoVarejo;
    }

    public float calcularPreco(){
        precoBase = this.precoVarejo - (this.precoVarejo*10/100);
        return precoBase;
    }
}
