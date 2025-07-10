package exercicio01;

public class Casa extends Imovel {

    private float metragemTerreno;
    private float metragemConstrucao;

    public float getMetragemTerreno() {
        return this.metragemTerreno;
    }

    public void setMetragemTerreno(float metragemTerreno) {
        if (metragemTerreno <= 0) {
            throw new IllegalArgumentException("A area do terreno deve ser maior que zero.");
        }
        this.metragemTerreno = metragemTerreno;
    }

    public float getMetragemConstrucao() {
        return metragemConstrucao;
    }

    public void setMetragemConstrucao(float metragemConstrucao) {
        if (metragemConstrucao <= 0) {
            throw new IllegalArgumentException("A area da construcao deve ser maior que zero.");
        }
        this.metragemConstrucao = metragemConstrucao;
    }

    public float calcularIPTU() {
        return this.metragemTerreno * 30.0f + this.metragemConstrucao * 50.0f;
    }
}
