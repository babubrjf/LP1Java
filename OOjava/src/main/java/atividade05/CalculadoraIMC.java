package atividade05;

import java.text.DecimalFormat;

public class CalculadoraIMC {

    private float peso;
    private float altura;
    private float imc;
    private String sexo;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float calculoImc() {
        return this.imc = this.peso / (this.altura * this.altura);
    }

    public String calcularImcMulher() {
        this.imc = this.calculoImc();
        if (this.imc < 19.1) {
            return "Condição: Abaixo do Peso";
        } else if (this.imc >= 19.1 && this.imc < 25.8) {
            return "Condição: Peso Normal";
        } else if (this.imc >= 25.8 && this.imc < 27.3) {
            return "Condição: Marginalmente Acima do Peso";
        } else if (this.imc >= 27.3 && this.imc < 32.3) {
            return "Condição: Acima do Peso Ideal";
        } else {
            return "Condição: Obeso";
        }
    }

    public String calcularImcHomem() {
        this.imc = this.calculoImc();
        if (this.imc < 20.7) {
            return "Condição: Abaixo do Peso";
        } else if (this.imc >= 20.7 && this.imc < 26.4) {
            return "Condição: Peso Normal";
        } else if (this.imc >= 26.4 && this.imc < 27.8) {
            return "Condição: Marginalmente Acima do Peso";
        } else if (this.imc >= 27.8 && this.imc < 31.1) {
            return "Condição: Acima do Peso Ideal";
        } else {
            return "Condição: Obeso";
        }
    }
}
