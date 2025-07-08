package exercicio07;

public class Especial extends Fita {

    private int dias;
    private float aluguelDiario;

    public int getDias() {
        return this.dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float getAluguelDiario() {
        return this.aluguelDiario;
    }

    public void setAluguelDiario(float aluguelDiario) {
        this.aluguelDiario = aluguelDiario;
    }

    public float emprestimo(){
        if (dias > 0) {
            return this.dias * this.aluguelDiario;
        }
        throw new IllegalArgumentException("Numero de Dias invalido");
    }
}
