package exercicio05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoTest {

    @Test
    void deveRetornarValorManutencaoMonitor() {
        Monitor monitor = new Monitor();
        monitor.setMaoDeObra(100.0f);
        assertEquals(100.0f, monitor.calcularManutencao());
    }

    @Test
    void deveRetornarValorManutencaoCPU() {
        CPU cpu = new CPU();
        cpu.setMaoDeObra(200.0f);
        cpu.setValorPecas(40.0f);
        assertEquals(240.0f, cpu.calcularManutencao());
    }

    @Test
    void deveRetornarValorManutencaoImpressora() {
        Impressora impressora = new Impressora();
        impressora.setMaoDeObra(350.0f);
        impressora.setValorPecas(89.0f);
        assertEquals(439.0f, impressora.calcularManutencao());
    }
}