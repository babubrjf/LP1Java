package atividade07;

import java.time.LocalDate;

public class Revista extends MaterialBiblioteca {

    public Revista(String titulo, LocalDate dataPublicacao) {
        super(titulo, dataPublicacao);
    }

    public LocalDate calcularDataDevolucao(LocalDate dataEmprestimo) {
        return dataEmprestimo.plusDays(7);
    }
}
