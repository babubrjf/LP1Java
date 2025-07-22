import java.util.ArrayList;

public class Curso {

    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;

    public Curso() {
        this.turmas = new ArrayList<Turma>();
        this.alunos = new ArrayList<Aluno>();
    }

    public ArrayList<Turma> getTurmas() {
        return this.turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public void remTurma(Turma turma) {
        this.turmas.remove(turma);
    }

    public boolean verificarTurma(Turma turma) {
        return this.turmas.contains(turma);
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void remAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public boolean verificarAluno(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public ArrayList<String> retornarNomesAlunosTurmasCurso() {
        ArrayList<String> nomes = new ArrayList<>();
        for (Turma turma : turmas) {
            for (Aluno aluno : turma.getAlunos()) {
                nomes.add(aluno.getNome());
            }
        }
        return nomes;
    }

    public ArrayList<String> retornarNomesProfessoresTurmasCurso() {
        ArrayList<String> nomes = new ArrayList<String>();
        for (Turma turma : this.getTurmas()) {
            nomes.add(turma.getProfessor().getNome());
        }
        return nomes;
    }

    public ArrayList<String> retornarNomesAlunosRegistradosCurso() {
        ArrayList<String> nomes = new ArrayList<String>();
        for (Aluno aluno : alunos) {
            nomes.add(aluno.getNome());
        }
        return nomes;
    }

    public ArrayList<String> retornarNomesDisciplinasTurmasCurso() {
        ArrayList<String> disciplinas = new ArrayList<String>();
        for (Turma turma : turmas) {
            disciplinas.add(turma.getDisciplina().getNome());
        }
        return disciplinas;
    }

}