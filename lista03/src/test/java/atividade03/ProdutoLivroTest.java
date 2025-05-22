package atividade03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void deveCalcularPrecoCapa() {
        ProdutoLivro produtoLivro = new ProdutoLivro("Livro A", 35.0f, 30.0f);
        produtoLivro.setPrecoCapa(10.0f);
        assertEquals(28.0f, produtoLivro.calcularPreco(), 0.1f);
    }

    @Test
    void deveLancarExcecaoPrecoCapaZerado() {
        try {
            ProdutoLivro produtoLivro = new ProdutoLivro("Livro A", 10.0f, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco capa invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoCapaNegativo() {
        try {
            ProdutoLivro produtoLivro = new ProdutoLivro("Livro A", 15.0f, -0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco capa invalido", e.getMessage());
        }
    }
}