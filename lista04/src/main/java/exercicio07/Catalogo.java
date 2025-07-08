package exercicio07;

public class Catalogo extends Fita {

    private int dias;

    public int getDias() {
        return this.dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float emprestimo(){
        if (dias > 0) {
            return this.dias * 5.0f;
        }
        throw new IllegalArgumentException("Numero de Dias invalido");
    }
}
