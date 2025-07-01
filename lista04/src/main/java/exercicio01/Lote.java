package exercicio01;

public class Lote extends Imovel {

    private float mQuadradoTerreno;

    public float getmQuadradoTerreno() {
        return this.mQuadradoTerreno;
    }

    public void setmQuadradoTerreno(float mQuadradoTerreno) {
        this.mQuadradoTerreno = mQuadradoTerreno;
    }

    public float calcularIPTU() {
        return (this.mQuadradoTerreno * 30.0f);
    }
}