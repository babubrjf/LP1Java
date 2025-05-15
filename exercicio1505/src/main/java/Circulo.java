public class Circulo extends FormaGeometrica {

    private float raio;

    public Circulo(float area, float perimetro) {
        super(area, perimetro);
        raio = this.raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.raio = raio;
    }

    public float calcularArea() {
        area = (3.14f*(this.raio*this.raio));
        return area;
    }

    public float calcularPerimetro() {
        perimetro = (2*(3.14f*this.raio));
        return perimetro;
    }
}
