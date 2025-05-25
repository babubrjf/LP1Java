package atividade07;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MaterialBibliotecaTest {

    @Test
    public void deveCalcularDataDevolucao() {
        Livro livro = new Livro("Livro", LocalDate.of(1949, 6, 8));
        LocalDate dataEmprestimo = LocalDate.of(2025, 5, 10);
        LocalDate dataDevolucao = dataEmprestimo.plusDays(15);
        assertEquals(LocalDate.of(2025, 5, 25), livro.calcularDataDevolucao(dataEmprestimo, dataDevolucao));
    }

    @Test
    public void deveLancarExcecaoDataDevolucaoAntesDataEmprestimo() {
        try {
            Livro livro = new Livro("O Pequeno Príncipe", LocalDate.of(1943, 4, 6));
            LocalDate dataEmprestimo = LocalDate.of(2025, 5, 10);
            LocalDate dataDevolucao = LocalDate.of(2025, 5, 9);
            livro.calcularDataDevolucao(dataEmprestimo, dataDevolucao);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Data invalida", e.getMessage());
        }
    }
}