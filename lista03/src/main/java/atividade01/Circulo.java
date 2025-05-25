package atividade01;

public class Circulo extends FormaGeometrica {

    private float raio;

    public Circulo(float raio) {
        this.setRaio(raio);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio invalido");
        }
        this.raio = raio;
    }

    public float calcularArea(float area) {
        return (3.14f*(this.raio*this.raio));
    }

    public float calcularPerimetro(float perimetro) {
        return (2*(3.14f*this.raio));
    }
}