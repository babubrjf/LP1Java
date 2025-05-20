package atividade03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveCalcularPrecoEletronico() {
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        produtoEletronico.setPrecoVarejo(50.0f);
        assertEquals(45.0f, produtoEletronico.calcularPreco(), 0.1f);
    }
}