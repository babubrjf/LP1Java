package exercicio08;

public class Mensalista extends Aluno {

    private float valorMensalidade;
    private int numParcelas;

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

    public float calcularMensalidade() {
        return this.valorMensalidade / this.numParcelas;
    }
}
