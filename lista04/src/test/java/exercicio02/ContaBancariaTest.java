package exercicio02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void deveRetornarSaldoCorrenteEspecial() {
        CorrenteEspecial conta = new CorrenteEspecial();
        conta.setSaldo(1000.0f);
        conta.setLimite(500.0f);
        assertEquals(1500.0f, conta.informarSaldo());
    }

    @Test
    void deveRetornarSaldoCorrenteNormal() {
        CorrenteNormal conta = new CorrenteNormal();
        conta.setSaldo(1000.0f);
        assertEquals(1000.0f, conta.informarSaldo());
    }

    @Test
    void deveRetornarSaldoPoupanca() {
        Poupanca conta = new Poupanca();
        conta.setSaldo(1000.0f);
        assertEquals(1000.0f, conta.informarSaldo());
    }
}