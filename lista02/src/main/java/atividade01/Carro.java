package atividade01;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeAtual;
    private boolean estado;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isEstado(boolean b) {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void ligar(){
        this.estado = true;
    }

    public void desligar(){
        this.estado = false;
        this.velocidadeAtual = 0.0f;
    }

    public boolean estadoCarro(){
        return this.estado;
    }

    public void acelerar(float quantidade){
        if (this.estado == true) {
            this.velocidadeAtual = (this.velocidadeAtual + quantidade);
        }
    }

    public void frear(float quantidade) {
        this.velocidadeAtual = (this.velocidadeAtual - quantidade);
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }
}