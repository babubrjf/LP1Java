package atividade07;

import java.time.LocalDate;

public class Livro extends MaterialBiblioteca {

    public Livro(String titulo, LocalDate dataPublicacao) {
        super(titulo, dataPublicacao);
    }

    public LocalDate calcularDataDevolucao(LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        if (dataDevolucao.isBefore(dataEmprestimo)) {
            throw new IllegalArgumentException("Data invalida");
        }
        return dataEmprestimo.plusDays(15);
    }
}