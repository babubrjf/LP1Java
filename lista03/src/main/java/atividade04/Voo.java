package atividade04;

import java.time.LocalDate;

public abstract class Voo {

    protected String origem;
    protected String destino;
    protected float distancia;
    protected LocalDate data;

    public Voo(String origem, String destino, float distancia, LocalDate data){
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setDistancia(distancia);
        this.setData(data);
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        if (origem.trim().equals("")) {
            throw new IllegalArgumentException("Origem invalida");
        }
        this.origem = origem.trim();
    }

    public float getDistancia() {
        return this.distancia;
    }

    public void setDistancia(float distancia) {
        if (distancia <= 0) {
            throw new IllegalArgumentException("Distancia invalida");
        }
        this.distancia = distancia;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        if (destino.trim().equals("")) {
            throw new IllegalArgumentException("Destino invalido");
        }
        this.destino = destino.trim();
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        if (data.isBefore(LocalDate.now()) || data.equals("")) {
            throw new IllegalArgumentException("Data invalida");
        }
        this.data = data;
    }

    public abstract float calcularPreco(float fatorPreco, float taxaConversao);
}
