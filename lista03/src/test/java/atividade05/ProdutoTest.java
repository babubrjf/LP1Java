package atividade05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveRegistrarNome() {
        Produto produto = new ProdutoEletronico("Fone de Ouvido", 10.0f, 5, 50.0f, 1);
        assertEquals("Fone de Ouvido", produto.getNome());
    }

    @Test
    void deveRegistrarNomeTirandoEspacos() {
        Produto produto = new ProdutoEletronico(" Fone de Ouvido ", 10.0f, 5, 50.0f, 1);
        assertEquals("Fone de Ouvido", produto.getNome());
    }

    @Test
    void deveLancarExcecaoNomeNulo() {
        try {
            Produto produto = new ProdutoEletronico("Fone de Ouvido", 10.0f, 5, 50.0f, 1);
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
            Produto produto = new ProdutoEletronico("", 0, 0, 0, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        try {
            Produto produto = new ProdutoEletronico(" ", 0, 0, 0, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco() {
        Produto produto = new ProdutoEletronico("Fone de Ouvido", 10.0f, 5, 50.0f, 1);
        assertEquals(10.0f, produto.calcularPreco(), 0.1f);
    }

    @Test
    void deveLancarExcecaoPrecoUnitarioZerado() {
        try {
            Produto produto = new ProdutoEletronico("Fone de Ouvido", 0, 5, 50.0f, 1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoUnitarioNegativo() {
        try {
            Produto produto = new ProdutoEletronico("Fone de Ouvido", -0.1f, 5, 50.0f, 1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoTotalNegativo() {
        try {
            Produto produto = new ProdutoEletronico("Fone de Ouvido", 10.0f, 5, -0.01f, 1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoEstoqueNegativo() {
        try {
            Produto produto = new ProdutoEletronico("Fone de Ouvido", 10.0f, -1, 50.0f, 1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estoque insuficiente", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoCompraEstoqueAcimaMaximo() {
        try {
            Produto produto = new ProdutoEletronico("Fone de Ouvido", 10.0f, 5, 50.0f, 6);
            produto.calcularPreco();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estoque insuficiente", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoQuantidadeCompradaNegativa() {
        try {
            Produto produto = new ProdutoEletronico("Fone de Ouvido", 10.0f, 5, 50.0f, -1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Quantidade invalida", e.getMessage());
        }
    }
}