package atividade07;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaterialBibliotecaTest {

    @Test
    public void deveCalcularDataDevolucaoParaLivro() {
        Livro livro = new Livro("Livro", LocalDate.of(1949, 6, 8));
        LocalDate dataEmprestimo = LocalDate.of(2025, 5, 22);
        LocalDate dataDevolucao = dataEmprestimo.plusDays(15);
        assertEquals(dataDevolucao, livro.calcularDataDevolucao());
    }
}
