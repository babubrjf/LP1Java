package atividade05;

import atividade04.Pessoa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ProdutoTest {
    Produto produto;

    @BeforeEach
    public void setUp() {
        produto = new Produto("Boneco de Ação", "Brinquedos");
    }

    @Test
    public void deveAdicionarEstoque() {
        produto.setQuantidadeEstoque(31);
        produto.adicionarEstoque(8);
        assertEquals(39, produto.getQuantidadeEstoque());
    }

    @Test
    public void deveRemoverEstoque() {
        produto.setQuantidadeEstoque(11);
        produto.removerEstoque(1);
        assertEquals(10, produto.getQuantidadeEstoque());
    }

    @Test
    public void deveAplicarDesconto() {
        produto.setPreco(139.9f);
        produto.aplicarDesconto(15.0f);
        assertEquals(118.9f, produto.getPreco(), 0.1f);
    }

    @Test
    public void deveTestarEstoqueNegativo() {
        try {
            produto.setQuantidadeEstoque(10);
            produto.removerEstoque(11);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estoque Inválido", e.getMessage());
        }
    }

    @Test
    public void deveTestarDescontoNegativo() {
        try {
            produto.setPreco(139.9f);
            produto.aplicarDesconto(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Porcentagem Inválida", e.getMessage());
        }
    }
}