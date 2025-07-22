import java.util.ArrayList;

public class Curso {

    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private ArrayList<Turma> turmas;

    public Curso() {
        this.professores = new ArrayList<Professor>();
        this.alunos = new ArrayList<Aluno>();
        this.turmas = new ArrayList<Turma>();
    }

    public ArrayList getProfessores() {
        return this.professores;
    }

    public void setProfessores(ArrayList professores) {
        this.professores = professores;
    }

    public ArrayList getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList alunos) {
        this.alunos = alunos;
    }

    public ArrayList getTurmas() {
        return this.turmas;
    }

    public void setTurmas(ArrayList turmas) {
        this.turmas = turmas;
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public int getQuantidadeAlunos() {
        return this.alunos.size();
    }

    public boolean verificarAlunoPeloNome(String nome) {
        boolean achou = false;
        for (Aluno aluno : this.alunos) {
            if (aluno.getNome().equals(nome)) {
                achou = true;
            }
        }
        return achou;
    }

    public boolean verificarAluno(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public void desalocar(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public ArrayList<String> obterNomesAlunos() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Aluno aluno : this.alunos) {
            resultado.add(aluno.getNome());
        }
        return resultado;
    }

    public boolean verificarListaAlunos(ArrayList<String> lista) {
        int contador = 0;
        for (String nome : lista) {
            if (this.verificarAlunoPeloNome(nome)) {
                contador += 1;
            }
        }
        return (contador == this.alunos.size());
    }

    public void alocarUmAluno(Aluno aluno)
    {
        if (!this.alunos.contains(aluno)) {
            this.alunos.add(aluno);
        }
    }

    public String obterNomesProfessoresTurmaCurso() {
        return getTurmas().getProfessores().getNome();
    }
}
