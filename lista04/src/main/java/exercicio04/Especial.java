package exercicio04;

public class Especial extends Frete {

    private float taxaEntrega;

    public float getTaxaEntrega() {
        return this.taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public float calcularFrete() {
        return getValor() + this.taxaEntrega;
    }
}