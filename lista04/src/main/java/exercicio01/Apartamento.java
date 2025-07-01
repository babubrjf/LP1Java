package exercicio01;

public class Apartamento extends Imovel {

    private float mQuadradoConstrucao;
    private int andar;

    public float getmQuadradoConstrucao() {
        return this.mQuadradoConstrucao;
    }

    public void setmQuadradoConstrucao(float mQuadradoConstrucao) {
        this.mQuadradoConstrucao = mQuadradoConstrucao;
    }

    public int getAndar() {
        return this.andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public float calcularIPTU() {
        return this.mQuadradoConstrucao * 40.0f * (1 - 0.10f * this.andar);
        // V=A×40×(1−0,10×N)
    }
}