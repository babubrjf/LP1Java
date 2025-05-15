package IF_OO_20251.ERS35;

public class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(String nome) {
        super(nome);
    }

    public float obterLimiteAprovacao() {
        return 7.0f;
    }
}
