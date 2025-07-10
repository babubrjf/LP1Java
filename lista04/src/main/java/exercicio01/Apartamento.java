package exercicio01;

public class Apartamento extends Imovel {

    private int andar;
    private float metragemConstrucao;

    public int getAndar() {
        return this.andar;
    }

    public void setAndar(int andar) {
        if (andar < 0) {
            throw new IllegalArgumentException("O andar do predio deve ser maior que zero.");
        }
        this.andar = andar;
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
        return this.metragemConstrucao * 40.0f * Math.max(1 - 0.10f * this.andar, 0.10f);
    }
}
