package atividade04;

public abstract class Voo {

    protected String origem;
    protected float distancia;
    protected String destino;
    protected String data;
    protected float preco;

    public Voo(String origem, float distancia, String destino, String data, float preco){
        this.setOrigem(origem);
        this.setDistancia(distancia);
        this.setDestino(destino);
        this.setData(data);
        this.setPreco(preco);
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public float getDistancia() {
        return this.distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public abstract float calcularPreco();

    public abstract float calcularDistancia();
}
