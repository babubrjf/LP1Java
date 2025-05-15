public abstract class FormaGeometrica {
    protected float area;
    protected float perimetro;

    public FormaGeometrica(float area, float perimetro) {
        this.setArea(area);
        this.setPerimetro(perimetro);
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public abstract float calcularArea();

    public abstract float calcularPerimetro();
}
