package exercicio01;

public class Casa extends Imovel {

    private float mQuadradoConstrucao;
    private float mQuadradoTerreno;

    public float getmQuadradoConstrucao() {
        return this.mQuadradoConstrucao;
    }

    public void setmQuadradoConstrucao(float mQuadradoConstrucao) {
        this.mQuadradoConstrucao = mQuadradoConstrucao;
    }

    public float getmQuadradoTerreno() {
        return this.mQuadradoTerreno;
    }

    public void setmQuadradoTerreno(float mQuadradoTerreno) {
        this.mQuadradoTerreno = mQuadradoTerreno;
    }

    public float calcularIPTU() {
        return (this.mQuadradoTerreno * 30.0f) + (this.mQuadradoConstrucao * 50.0f);
    }
}