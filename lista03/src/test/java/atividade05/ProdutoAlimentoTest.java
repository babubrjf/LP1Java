package atividade05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {

    @Test
    void deveCalcularPrecoProdutoAlimento() {
        Produto produto = new ProdutoAlimento("Peito de Frango", 16.5f, 10);
        assertEquals(33, produto.calcularPreco(2, 33));
        assertEquals(8, produto.quantidadeEstoque);
    }
}