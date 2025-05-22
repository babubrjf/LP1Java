package atividade03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveCalcularPrecoRoupa() {
        ProdutoRoupa produtoRoupa = new ProdutoRoupa("Camisa G", 35.0f, 30.0f);
        produtoRoupa.setPrecoEtiqueta(100.0f);
        assertEquals(95.0f, produtoRoupa.calcularPreco(), 0.1f);
    }

    @Test
    void deveLancarExcecaoPrecoRoupaZerado() {
        try {
            ProdutoRoupa produtoRoupa = new ProdutoRoupa("Camisa G", 10.0f, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco roupa invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoVarejoProdutoLivroNegativo() {
        try {
            ProdutoRoupa produtoRoupa = new ProdutoRoupa("Camisa G", 15.0f, -0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco roupa invalido", e.getMessage());
        }
    }
}