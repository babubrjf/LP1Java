package atividade07;

import java.time.LocalDate;

public abstract class MaterialBiblioteca {

    protected String titulo;
    protected LocalDate dataPublicacao;

    public MaterialBiblioteca(String titulo, LocalDate dataPublicacao) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataPublicacao() {
        return this.dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public abstract LocalDate calcularDataDevolucao(LocalDate dataEmprestimo, LocalDate dataDevolucao);
}
