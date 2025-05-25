package atividade03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void deveCalcularPrecoCapaProduto() {
        Produto produto = new ProdutoLivro("Carrinho de Brinquedo", 10.0f);
        assertEquals(9.5f, produto.calcularPreco(9.5f), 0.1f);
    }

    @Test
    void deveLancarExcecaoPrecoCapaProdutoLivroZerado() {
        try {
            ProdutoLivro produtoLivro = new ProdutoLivro("Carrinho de Brinquedo", 10.0f);
            produtoLivro.calcularPreco(0.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco capa invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoCapaProdutoLivroNegativo() {
        try {
            ProdutoLivro produtoLivro = new ProdutoLivro("Carrinho de Brinquedo", 10.0f);
            produtoLivro.calcularPreco(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco capa invalido", e.getMessage());
        }
    }
}