package atividade05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveCalcularPrecoProdutoEletronico() {
        Produto produto = new ProdutoEletronico("Celular", 1500, 10);
        assertEquals(3000, produto.calcularPreco(2, 3000));
        assertEquals(8, produto.quantidadeEstoque);
    }

    @Test
    void deveLancarExcecaoComprarAcimaEstoque() {
        try {
            Produto produto = new ProdutoEletronico("Celular", 1500, 10);
            produto.calcularPreco(11, 16500);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estoque insuficiente", e.getMessage());
        }
    }
}