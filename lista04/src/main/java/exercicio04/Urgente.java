package exercicio04;

public class Urgente extends Frete {

    private float taxaEntrega;
    private int itens;

    public float getTaxaEntrega() {
        return this.taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public int getItens() {
        return this.itens;
    }

    public void setItens(int itens) {
        this.itens = itens;
    }

    public float calcularFrete() {
        return getValor() + this.taxaEntrega + (10.0f * this.itens);
    }
}
