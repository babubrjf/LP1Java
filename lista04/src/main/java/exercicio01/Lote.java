package exercicio01;

public class Lote extends Imovel {

    private float metragemTerreno;

    public float getMetragemTerreno() {
        return this.metragemTerreno;
    }

    public void setMetragemTerreno(float metragemTerreno) {
        if (metragemTerreno <= 0) {
            throw new IllegalArgumentException("A metragem do terreno deve ser maior que zero.");
        }
        this.metragemTerreno = metragemTerreno;
    }

    public float calcularIPTU() {
        return this.metragemTerreno * 30.0f;
    }
}
