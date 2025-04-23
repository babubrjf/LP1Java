package atividade05;

import java.text.DecimalFormat;

public class CalculadoraIMC {

    private float peso;
    private float altura;
    private float imc;
    private String sexo;

    DecimalFormat df = new DecimalFormat("#.##"); // Define o formato com 2 casas decimais

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

    public String imc() {
        this.imc = this.peso / (this.altura * this.altura);
        String imcFormatado = df.format(this.imc);
        return imcFormatado;
    }

    public String condicao(){
        if (sexo.equals("F")) {
            if (imc < 19.1) return "Abaixo do peso";
            else if (imc < 25.8) return "Peso normal";
            else if (imc < 27.3) return "Marginalmente acima do peso";
            else if (imc < 32.3) return "Acima do peso ideal";
            else return "Obeso";
        } else if (sexo.equals("M")) {
            if (imc < 20.7) return "Abaixo do peso";
            else if (imc < 26.4) return "Peso normal";
            else if (imc < 27.8) return "Marginalmente acima do peso";
            else if (imc < 31.1) return "Acima do peso ideal";
            else return "Obeso";
        } else {
            return "Sexo inválido";
        }
    }
}
