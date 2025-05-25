package atividade08;

public class Bicicleta extends Veiculo {

    public Bicicleta(String marca, String modelo, float precoBase) {
        super(marca, modelo, precoBase);
    }

    public float calcularCusto(float fatorFixo) {
        if (fatorFixo <= 0) {
            throw new IllegalArgumentException("Fator fixo invalido");
        }
        return this.precoBase * fatorFixo;
    }
}