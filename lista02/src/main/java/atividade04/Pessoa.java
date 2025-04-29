package atividade04;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void envelhecer(){
        this.idade = (this.idade + 1);
    }

    public void crescer(float centimetros){
        if (this.idade >= 21) {
            throw new IllegalArgumentException("A pessoa tem 21 anos ou mais!");
        }
        this.altura = (this.altura + centimetros);
    }

    public void ganharPeso(float quilos){
        this.peso = (this.peso + quilos);
    }

    public void perderPeso(float quilos){
        if ((this.peso - quilos) <= 0) {
            throw new IllegalArgumentException("Peso Inválido");
        }
        this.peso = (this.peso - quilos);
    }
}
