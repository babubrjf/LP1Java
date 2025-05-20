package atividade03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveCalcularPrecoRoupa() {
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        produtoRoupa.setPrecoEtiqueta(100.0f);
        assertEquals(95.0f, produtoRoupa.calcularPreco(), 0.1f);
    }
}