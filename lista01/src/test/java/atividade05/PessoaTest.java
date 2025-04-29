package atividade05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa() ;
    }

    @Test
    public void deveCalcularImcMulherAbaixoDoPeso() {
        pessoa.setPeso(48.6f);
        pessoa.setAltura(1.60f);

        assertEquals(19.0, pessoa.calculoImc(), 0.1f);
        assertEquals("Condição: Abaixo do Peso", pessoa.calcularImcMulher());
    }

    @Test
    public void deveCalcularImcMulherPesoNormal() {
        pessoa.setPeso(74.3f);
        pessoa.setAltura(1.70f);
        assertEquals(25.7, pessoa.calculoImc(), 0.1f);

        assertEquals("Condição: Peso Normal", pessoa.calcularImcMulher());
    }

    @Test
    public void deveCalcularImcMulherAcimaDoPeso() {
        pessoa.setPeso(74.8f);
        pessoa.setAltura(1.66f);
        assertEquals(27.2, pessoa.calculoImc(), 0.1f);
        assertEquals("Condição: Marginalmente Acima do Peso", pessoa.calcularImcMulher());
    }

    @Test
    public void deveCalcularImcMulherAcimaPesoIdeal() {
        pessoa.setPeso(93);
        pessoa.setAltura(1.70f);
        assertEquals(32.2, pessoa.calculoImc(), 0.1f);
        assertEquals("Condição: Acima do Peso Ideal", pessoa.calcularImcMulher());
    }

    @Test
    public void deveCalcularImcMulherObesa() {
        pessoa.setPeso(93.5f);
        pessoa.setAltura(1.70f);
        assertEquals(32.4, pessoa.calculoImc(), 0.1f);
        assertEquals("Condição: Obeso", pessoa.calcularImcMulher());
    }

    @Test
    public void deveCalcularImcHomemAbaixoDoPeso() {
        pessoa.setPeso(67);
        pessoa.setAltura(1.80f);
        assertEquals(20.6, pessoa.calculoImc(), 0.1f);
        assertEquals("Condição: Abaixo do Peso", pessoa.calcularImcHomem());
    }

    @Test
    public void deveCalcularImcHomemPesoNormal() {
        pessoa.setPeso(85.3f);
        pessoa.setAltura(1.80f);
        assertEquals(26.3, pessoa.calculoImc(), 0.1f);
        assertEquals("Condição: Peso Normal", pessoa.calcularImcHomem());
    }

    @Test
    public void deveCalcularImcHomemAcimaDoPeso() {
        pessoa.setPeso(90);
        pessoa.setAltura(1.80f);
        assertEquals(27.7, pessoa.calculoImc(), 0.1f);
        assertEquals("Condição: Marginalmente Acima do Peso", pessoa.calcularImcHomem());
    }

    @Test
    public void deveCalcularImcHomemAcimaPesoIdeal() {
        pessoa.setPeso(100.5f);
        pessoa.setAltura(1.80f);
        assertEquals(31.0, pessoa.calculoImc(), 0.1f);
        assertEquals("Condição: Acima do Peso Ideal", pessoa.calcularImcHomem());
    }

    @Test
    public void deveCalcularImcHomemObeso() {
        pessoa.setPeso(101);
        pessoa.setAltura(1.80f);
        assertEquals(31.2, pessoa.calculoImc(), 0.1f);
        assertEquals("Condição: Obeso", pessoa.calcularImcHomem());
    }
}