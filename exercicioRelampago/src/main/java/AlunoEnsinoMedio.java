package IF_OO_20251.ERS35;

public class AlunoEnsinoMedio extends Aluno {

    public AlunoEnsinoMedio(String nome) {
        super(nome);
    }

    public float obterLimiteAprovacao() {
        return 6.0f;
    }
}
