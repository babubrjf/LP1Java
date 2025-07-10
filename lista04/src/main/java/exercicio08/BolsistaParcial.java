package exercicio08;

public class BolsistaParcial extends Aluno {

    private float valorMensalidade;
    private int numParcelas;
    private float percentual;

    public float getValorMensalidade() {
        return this.valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public int getNumParcelas() {
        return this.numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public float getPercentual() {
        return this.percentual;
    }

    public void setPercentual(float percentual) {
        if (percentual <= 0.0f || percentual > 50.0f) {
            throw new IllegalArgumentException("Percentual Invalido");
        }
        this.percentual = percentual;
    }

    public float calcularMensalidade() {
        return (this.valorMensalidade / this.numParcelas) * (this.percentual/100);
    }
}
