package atividade05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProdutoRoupaTest {

    @Test
    void deveCalcularPrecoProdutoRoupa() {
        Produto produto = new ProdutoRoupa("Regata G", 39.9f, 5);
        assertEquals(113.71f, produto.calcularPreco(3, 5), 0.01f);
        assertEquals(2, produto.quantidadeEstoque);
    }

    @Test
    void deveLancarExcecaoDescontoZerado() {
        try {
            Produto produto = new ProdutoRoupa("Regata G", 39.9f, 5);
            produto.calcularPreco(3, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Desconto invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDescontoNegativo() {
        try {
            Produto produto = new ProdutoRoupa("Regata G", 39.9f, 5);
            produto.calcularPreco(3, -0.1f);
        } catch (IllegalArgumentException e) {
            assertEquals("Desconto invalido", e.getMessage());
        }
    }
}