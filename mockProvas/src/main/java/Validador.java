import java.util.List;

public class Validador {

    public double calcularNota(Prova prova, IGabarito gabarito, double notaMaxima) {
        if (prova == null) {
            throw new IllegalArgumentException("Prova inválida");
        }
        if (gabarito == null) {
            throw new IllegalArgumentException("Gabarito inválido");
        }

        List<Character> respostasProva = prova.getRespostas();
        List<Character> respostasGabarito = gabarito.getRespostasCorretas();

        if (respostasProva.size() != respostasGabarito.size()) {
            throw new IllegalArgumentException("Tamanho do gabarito incompativel");
        }

        int acertos = 0;
        for (int i = 0; i < respostasProva.size(); i++) {
            if (Character.toUpperCase(respostasProva.get(i)) == Character.toUpperCase(respostasGabarito.get(i))) {
                acertos++;
            }
        }

        return (notaMaxima / respostasGabarito.size()) * acertos;
    }
}