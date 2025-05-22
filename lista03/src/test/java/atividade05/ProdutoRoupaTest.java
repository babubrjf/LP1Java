package atividade05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveAplicarDescontoProdutoRoupa() {
        Produto produto = new ProdutoRoupa("Camisa", 50.0f, 6, 300.0f, 1, 10.0f, 45.0f);
        assertEquals(45.0f, produto.calcularPreco());
    }

    @Test
    void deveLancarExcecaoAplicarDescontoNegativo() {
        try {
            Produto produto = new ProdutoRoupa("Camisa", 50.0f, 6, 300.0f, 1, -0.1f, 45.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Desconto invalido", e.getMessage());
        }
    }
}