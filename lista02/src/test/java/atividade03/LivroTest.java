package atividade03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    Livro livro;

    @BeforeEach
    public void setUp() {
        livro = new Livro("Harry Potter e o Prisioneiro de Azkaban", "J.K. Rowling", 1999, 288, "Fantasia");
    }

    @Test
    public void deveAbrirLivro() {
        livro.abrir();
        assertTrue(livro.isLivroAberto());
    }

    @Test
    public void deveFecharLivro() {
        livro.fechar();
        assertFalse(livro.isLivroAberto());
    }

    @Test
    public void deveMarcarPaginaValida() {
        livro.marcarPagina(150);
        assertEquals(150, livro.getPaginaAtual());
    }

    @Test
    public void naoDeveMarcarPaginaInvalida() {
        livro.marcarPagina(289);
        assertEquals(1, livro.getPaginaAtual());
    }

    @Test
    public void deveAvancarPagina() {
        livro.marcarPagina(287);
        livro.avancarPagina(1);
        assertEquals(288, livro.getPaginaAtual());
    }

    @Test
    public void deveRetrocederPagina() {
        livro.marcarPagina(288);
        livro.retrocederPagina(1);
        assertEquals(287, livro.getPaginaAtual());
    }

    @Test
    public void naoDeveRetrocederSeEstiverNaPrimeiraPagina() {
        livro.marcarPagina(1);
        livro.retrocederPagina(1);
        assertEquals(1, livro.getPaginaAtual());
    }
}
