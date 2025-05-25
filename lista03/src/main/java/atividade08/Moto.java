package atividade08;

public class Moto extends Veiculo {

    public Moto(String marca, String modelo, float precoBase) {
        super(marca, modelo, precoBase);
    }

    public float calcularCusto(float fatorFixo) {
        if (fatorFixo <= 0) {
            throw new IllegalArgumentException("Fator fixo invalido");
        }
        return this.precoBase * fatorFixo;
    }
}