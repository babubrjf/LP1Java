package exercicio01;

public abstract class Imovel {

    private String tipo;

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract float calcularIPTU();
}
