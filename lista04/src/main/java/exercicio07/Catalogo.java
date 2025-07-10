package exercicio07;

public class Catalogo extends Fita {

    public float emprestimo(){
        if (getDias() > 0) {
            return getDias() * 5.0f;
        }
        throw new IllegalArgumentException("Numero de Dias invalido");
    }
}
