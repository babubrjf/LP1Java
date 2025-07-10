package exercicio07;

import exercicio06.Diario;
import exercicio06.Mensal;
import exercicio06.Semanal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitaTest {

    @Test
    void deveRetornarValorEmprestimoFitaCatalogo() {
        Catalogo catalogo = new Catalogo();
        catalogo.setDias(2);
        assertEquals(10.0f, catalogo.emprestimo());
    }

    @Test
    void deveRetornarValorEmprestimoFitaLancamento() {
        Lancamento lancamento = new Lancamento();
        lancamento.setDias(2);
        lancamento.setAluguelDiario(10.0f);
        assertEquals(20.0f, lancamento.emprestimo());
    }

    @Test
    void deveRetornarValorEmprestimoFitaEspecial() {
        Especial especial = new Especial();
        especial.setDias(3);
        especial.setAluguelDiario(15.0f);
        assertEquals(45.0f, especial.emprestimo());
    }
}