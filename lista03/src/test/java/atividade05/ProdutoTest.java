package atividade05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveRegistrarDadosProduto() {
        Produto produto = new ProdutoEletronico("Celular", 1500, 10);
        assertEquals("Celular", produto.getNome());
        assertEquals(1500, produto.getPrecoUnitario());
        assertEquals(10, produto.getQuantidadeEstoque());
    }

    @Test
    void deveRegistrarDadosTirandoEspacos() {
        Produto produto = new ProdutoEletronico(" Celular  ", 1500, 10);
        assertEquals("Celular", produto.getNome());
        assertEquals(1500, produto.getPrecoUnitario());
        assertEquals(10, produto.getQuantidadeEstoque());
    }

    @Test
    void deveLancarExcecaoNomeNulo() {
        try {
            Produto produto = new ProdutoEletronico("", 1500, 10);
            produto.setNome("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeNuloConstrutor() {
        try {
            Produto produto = new ProdutoEletronico("", 1500, 10);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        try {
            Produto produto = new ProdutoEletronico(" ", 1500, 10);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoZerado() {
        try {
            Produto produto = new ProdutoEletronico("Celular", 0, 10);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoNegativo() {
        try {
            Produto produto = new ProdutoEletronico("Celular", -0.01f, 10);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoEstoqueNegativo() {
        try {
            Produto produto = new ProdutoEletronico("Celular", 1500, -1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estoque invalido", e.getMessage());
        }
    }
}