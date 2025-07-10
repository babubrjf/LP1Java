package exercicio07;

public class Especial extends Fita {

    private float aluguelDiario;

    public float getAluguelDiario() {
        return this.aluguelDiario;
    }

    public void setAluguelDiario(float aluguelDiario) {
        this.aluguelDiario = aluguelDiario;
    }

    public float emprestimo(){
        if (getDias() > 0) {
            return getDias() * this.aluguelDiario;
        }
        throw new IllegalArgumentException("Numero de Dias invalido");
    }
}
