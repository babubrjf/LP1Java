package aula1;


public class Pessoa{
    private String sexo;


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(!("Feminino".equals(sexo) || "Masculino".equals(sexo))) {
            throw new IllegalArgumentException("Sexo Invalido");
        }else{
            this.sexo = sexo;
        }
    }


    public Pessoa() {
    }

    public Pessoa(String sexo) {
        this.sexo = sexo;
    }

    public String verificarImc(IImc imc) {
        String resultado = "";
        Double valorImc = imc.calcularImc();
        if (this.sexo.equals("Feminino")) {//2
            if (valorImc < 19.1) {//5
                resultado = "Abaixo do peso";
            } else {
                if (valorImc < 25.8) {//6
                    resultado = "No peso normal";
                } else {
                    if (valorImc < 27.3) { //7
                        resultado = "Marginalmente acima do peso";
                    } else {
                        if (valorImc < 32.3) {//8
                            resultado = "Acima do peso ideal";
                        } else {
                            resultado = "Obeso";
                        }
                    }
                }
            }
            return resultado;
        } else {//3
            if (valorImc < 20.7) {//10
                resultado = "Abaixo do peso";
            } else {
                if (valorImc < 26.4) {//11
                    resultado = "No peso normal";
                } else {
                    if (valorImc < 27.8) {//12
                        resultado = "Marginalmente acima do peso";
                    } else {
                        if (valorImc < 31.1) {//13
                            resultado = "Acima do peso ideal";
                        } else {
                            resultado = "Obeso";
                        }
                    }
                }
            }
            return resultado;
        }
    }

}
