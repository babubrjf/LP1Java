package atividade03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void deveCalcularPrecoLivro() {
        ProdutoLivro produtoLivro = new ProdutoLivro();
        produtoLivro.setPrecoCapa(10.0f);
        assertEquals(8.0f, produtoLivro.calcularPreco(), 0.1f);
    }
}