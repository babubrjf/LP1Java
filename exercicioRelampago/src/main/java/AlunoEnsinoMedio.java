public class AlunoEnsinoMedio extends Aluno {
    private boolean aprovado;

    public AlunoEnsinoMedio(String nome, float nota1, float nota2, float media, int matricula) {
        super(nome, nota1, nota2, media, matricula);
    }

    public AlunoEnsinoMedio(){

    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void alunoAprovado(){
        if (getMedia()>=6){
            this.aprovado = true;
        }
    }

    public void alunoReprovado(){
        if (getMedia()<6){
            this.aprovado = false;
        }
    }

    public String retornaNomeMatriculaAprovacao() {
        return "Aluno: " + getNome() + ", Matricula: " + getMatricula() + "Aprovado: ";
    }
}
