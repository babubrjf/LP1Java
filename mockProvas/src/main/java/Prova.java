import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prova {
    private static final List<Character> ALTERNATIVAS = List.of('A', 'B', 'C', 'D', 'E');

    private final List<Character> respostas;

    public Prova(List<Character> respostas) {
        this.respostas = Collections.unmodifiableList(new ArrayList<>(respostas));
        validarProva(respostas);
    }

    public List<Character> getRespostas() {
        return respostas;
    }

    private void validarProva(List<Character> respostas) {
        if (respostas.size() < 5) {
            throw new IllegalArgumentException("Respostas abaixo do mínimo");
        }
        if (respostas.size() > 5) {
            throw new IllegalArgumentException("Respostas acima do máximo");
        }
        for (Character resp : respostas) {
            if (!ALTERNATIVAS.contains(Character.toUpperCase(resp))) {
                throw new IllegalArgumentException("Alternativa inválida");
            }
        }
    }
}