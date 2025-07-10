package exercicio05;

public abstract class Manutencao {

    private int numero;
    private float maoDeObra;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getMaoDeObra() {
        return this.maoDeObra;
    }

    public void setMaoDeObra(float maoDeObra) {
        this.maoDeObra = maoDeObra;
    }

    public abstract float calcularManutencao();
}