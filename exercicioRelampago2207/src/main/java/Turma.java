import java.util.ArrayList;

public class Turma {

    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Professor getProfessor() {
        return this.professor;
    }

    public Turma() {
        this.alunos = new ArrayList<Aluno>();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNomeProfessorTurma() {
        return professor.getNome();
    }

    public ArrayList getNomeProfessoresTurmas() {
        return professor.getNome();
    }

    public ArrayList getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList alunos) {
        this.alunos = alunos;
    }

    public void addAlunoTurma(Aluno aluno) {
        this.alunos.add(aluno);
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

    public void remAlunoTurma(Aluno aluno) {
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

    public void alocarUnico(Aluno aluno)
    {
        if (!this.alunos.contains(aluno)) {
            this.alunos.add(aluno);
        }
    }
}
