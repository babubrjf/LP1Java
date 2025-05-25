package atividade03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveCalcularPrecoVarejoProduto() {
        Produto produto = new ProdutoEletronico("Carrinho de Brinquedo", 10.0f);
        assertEquals(9.0f, produto.calcularPreco(9.0f), 0.1f);
    }

    @Test
    void deveLancarExcecaoPrecoVarejoProdutoEletronicoZerado() {
        try {
            ProdutoEletronico produtoEletronico = new ProdutoEletronico("Carrinho de Brinquedo", 10.0f);
            produtoEletronico.calcularPreco(0.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco varejo invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoVarejoProdutoEletronicoNegativo() {
        try {
            ProdutoEletronico produtoEletronico = new ProdutoEletronico("Carrinho de Brinquedo", 10.0f);
            produtoEletronico.calcularPreco(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco varejo invalido", e.getMessage());
        }
    }
}