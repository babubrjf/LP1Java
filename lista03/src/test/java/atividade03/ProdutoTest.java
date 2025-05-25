package atividade03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveRegistrarNome() {
        Produto produto = new ProdutoEletronico("Ipod", 1500.0f);
        assertEquals("Ipod", produto.getNome());
    }

    @Test
    void deveRegistrarNomeTirandoEspacos() {
        Produto produto = new ProdutoEletronico(" Ipod ", 1500.0f);
        assertEquals("Ipod", produto.getNome());
    }

    @Test
    void deveLancarExcecaoNomeNulo() {
        try {
            Produto produto = new ProdutoEletronico("Ipod", 1500.0f);
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
            Produto produto = new ProdutoEletronico("", 100.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        try {
            Produto produto = new ProdutoEletronico(" ", 100.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveRegistrarPrecoBaseProduto() {
        Produto produto = new ProdutoEletronico("Carrinho de Brinquedo", 10.0f);
        assertEquals(10.0f, produto.getPrecoBase(), 0.1f);
    }

    @Test
    void deveLancarExcecaoPrecoBaseProdutoZerado() {
        try {
            Produto produto = new ProdutoEletronico("Carrinho de Brinquedo", 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco base invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoBaseProdutoNegativo() {
        try {
            Produto produto = new ProdutoEletronico("Carrinho de Brinquedo", -0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco base invalido", e.getMessage());
        }
    }
}