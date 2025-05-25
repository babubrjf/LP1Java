package atividade01;

public class Retangulo extends FormaGeometrica {
    private float base;
    private float altura;

    public Retangulo(float base, float altura) {
        this.setAltura(altura);
        this.setBase(base);
    }

    public float getBase() {
        return this.base;
    }

    public void setBase(float base) {
        if (base <= 0) {
            throw new IllegalArgumentException("Base invalida");
        }
        this.base = base;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura invalida");
        }
        this.altura = altura;
    }

    public float calcularArea(float area){
        return (this.base * this.altura);
    }

    public float calcularPerimetro(float perimetro){
        return 2*(this.base + this.altura);
    }
}
