public class Retangulo extends FormaGeometrica {
    private float base;
    private float altura;

    public Retangulo(float area, float perimetro) {
        super(area, perimetro);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        if (base <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.altura = altura;
    }

    public float calcularArea(){
        area = (this.base * this.altura);
        return area;
    }

    public float calcularPerimetro(){
        perimetro = 2*(this.base + this.altura);
        return perimetro;
    }
}
