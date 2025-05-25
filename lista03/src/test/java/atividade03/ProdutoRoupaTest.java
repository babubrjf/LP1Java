package atividade03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveCalcularPrecoRoupaProduto() {
        Produto produto = new ProdutoRoupa("Carrinho de Brinquedo", 10.0f);
        assertEquals(8.0f, produto.calcularPreco(8.0f), 0.1f);
    }

    @Test
    void deveLancarExcecaoPrecoRoupaProdutoRoupaZerado() {
        try {
            ProdutoRoupa produtoRoupa = new ProdutoRoupa("Carrinho de Brinquedo", 10.0f);
            produtoRoupa.calcularPreco(0.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco etiqueta invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoRoupaProdutoRoupaNegativo() {
        try {
            ProdutoRoupa produtoRoupa = new ProdutoRoupa("Carrinho de Brinquedo", 10.0f);
            produtoRoupa.calcularPreco(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco etiqueta invalido", e.getMessage());
        }
    }
}