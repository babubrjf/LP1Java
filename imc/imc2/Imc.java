package aula1;

public class Imc implements IImc {


    private Double peso;
    private Double altura;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        if (peso == null) {
            throw new IllegalArgumentException("Peso não pode ser nulo");
        } else {
            if(peso<=0.0){
                throw new IllegalArgumentException("Peso invalido");
            }
            else {
                this.peso = peso;
            }
        }
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        if (altura == null) {
            throw new IllegalArgumentException("Altura não pode ser nula");
        }else{
            if(altura<=0.0){
                throw new IllegalArgumentException("Altura invalida");
            }else{
                this.altura = altura;
            }
        }
    }


    public Double calcularImc() {
        return this.peso / (this.altura * this.altura);
    }
}
