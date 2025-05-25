package atividade08;

public abstract class Veiculo {

    protected String marca;
    protected String modelo;
    protected float precoBase;

    public Veiculo(String marca, String modelo, float precoBase) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPrecoBase(precoBase);
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if (marca.trim().equals("")) {
            throw new IllegalArgumentException("Marca invalida");
        }
        this.marca = marca.trim();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.trim().equals("")) {
            throw new IllegalArgumentException("Modelo invalido");
        }
        this.modelo = modelo.trim();
    }

    public float getPrecoBase() {
        return this.precoBase;
    }

    public void setPrecoBase(float precoBase) {
        if (precoBase <= 0) {
            throw new IllegalArgumentException("Preco base invalido");
        }
        this.precoBase = precoBase;
    }

    public abstract float calcularCusto(float fatorFixo);
}
