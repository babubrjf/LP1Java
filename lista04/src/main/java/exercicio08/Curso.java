package exercicio08;

import java.util.ArrayList;

public class Curso {

    private int codigo;
    private String descricao;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;

    public Curso() {
        this.alunos = new ArrayList<Aluno>();
    }

    public ArrayList getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList alunos) {
        this.alunos = alunos;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void alocar(Aluno aluno) {
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

    public void alocarUnico(Aluno aluno)
    {
        if (!this.alunos.contains(aluno)) {
            this.alunos.add(aluno);
        }
    }
}