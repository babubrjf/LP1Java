package atividade05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraIMCTest {

    CalculadoraIMC calculadoraimc;

    @BeforeEach
    public void setUp() {
        calculadoraimc = new CalculadoraIMC() ;
    }

    @Test
    public void deveCalcularImcMulherAbaixoDoPeso() {
        calculadoraimc.setPeso(48.6f);
        calculadoraimc.setAltura(1.60f);

        assertEquals(Double.parseDouble("19.0"), calculadoraimc.calculoImc(), 0.1);
        assertEquals("Condição: Abaixo do Peso", calculadoraimc.calcularImcMulher());
    }

    @Test
    public void deveCalcularImcMulherPesoNormal() {
        // Imc 19.1
//        calculadoraimc.setPeso(49f);
//        calculadoraimc.setAltura(1.60f);
//        assertEquals(Double.parseDouble("19.1"), calculadoraimc.calculoImc(), 0.1);

        // Imc 25.7
        calculadoraimc.setPeso(74.3f);
        calculadoraimc.setAltura(1.70f);
        assertEquals(Double.parseDouble("25.7"), calculadoraimc.calculoImc(), 0.1);

        assertEquals("Condição: Peso Normal", calculadoraimc.calcularImcMulher());
    }

    @Test
    public void deveCalcularImcMulherAcimaDoPeso() {
        // Imc 25.8
//        calculadoraimc.setPeso(55.5f);
//        calculadoraimc.setAltura(1.70f);
//        assertEquals(Double.parseDouble("25.8"), calculadoraimc.calculoImc(), 0.1);

        // Imc 27.2
        calculadoraimc.setPeso(74.8f);
        calculadoraimc.setAltura(1.66f);
        assertEquals(Double.parseDouble("27.2"), calculadoraimc.calculoImc(), 0.1);
        assertEquals("Condição: Marginalmente Acima do Peso", calculadoraimc.calcularImcMulher());
    }

    @Test
    public void deveCalcularImcMulherAcimaPesoIdeal() {
        // Imc 27.3
//        calculadoraimc.setPeso(74.5f);
//        calculadoraimc.setAltura(1.65f);
//        assertEquals(Double.parseDouble("27.3"), calculadoraimc.calculoImc(), 0.1);

        // Imc 32.2
        calculadoraimc.setPeso(93);
        calculadoraimc.setAltura(1.70f);
        assertEquals(Double.parseDouble("32.2"), calculadoraimc.calculoImc(), 0.1);
        assertEquals("Condição: Acima do Peso Ideal", calculadoraimc.calcularImcMulher());
    }

    @Test
    public void deveCalcularImcMulherObesa() {
        calculadoraimc.setPeso(93.5f);
        calculadoraimc.setAltura(1.70f);
        assertEquals(Double.parseDouble("32.3"), calculadoraimc.calculoImc(), 0.1);
        assertEquals("Condição: Obeso", calculadoraimc.calcularImcMulher());
    }

    @Test
    public void deveCalcularImcHomemAbaixoDoPeso() {
        calculadoraimc.setPeso(67);
        calculadoraimc.setAltura(1.80f);
        assertEquals(Double.parseDouble("20.6"), calculadoraimc.calculoImc(), 0.1);
        assertEquals("Condição: Abaixo do Peso", calculadoraimc.calcularImcHomem());
    }

    @Test
    public void deveCalcularImcHomemPesoNormal() {
        // Imc 20.7
//        calculadoraimc.setPeso(67.3f);
//        calculadoraimc.setAltura(1.80f);
//        assertEquals(Double.parseDouble("20.7"), calculadoraimc.calculoImc(), 0.1);

        // Imc 26.3
        calculadoraimc.setPeso(85.3f);
        calculadoraimc.setAltura(1.80f);
        assertEquals(Double.parseDouble("26.3"), calculadoraimc.calculoImc(), 0.1);
        assertEquals("Condição: Peso Normal", calculadoraimc.calcularImcHomem());
    }

    @Test
    public void deveCalcularImcHomemAcimaDoPeso() {
        // Imc 26.4
//        calculadoraimc.setPeso(85.6f);
//        calculadoraimc.setAltura(1.80f);
//        assertEquals(Double.parseDouble("26.4"), calculadoraimc.calculoImc(), 0.1);

        // Imc 27.7
        calculadoraimc.setPeso(90);
        calculadoraimc.setAltura(1.80f);
        assertEquals(Double.parseDouble("27.7"), calculadoraimc.calculoImc(), 0.1);
        assertEquals("Condição: Marginalmente Acima do Peso", calculadoraimc.calcularImcHomem());
    }

    @Test
    public void deveCalcularImcHomemAcimaPesoIdeal() {
        // Imc 27.8
//        calculadoraimc.setPeso(90.1f);
//        calculadoraimc.setAltura(1.80f);
//        assertEquals(Double.parseDouble("27.8"), calculadoraimc.calculoImc(), 0.1);

        // Imc 31.0
        calculadoraimc.setPeso(100.5f);
        calculadoraimc.setAltura(1.80f);
        assertEquals(Double.parseDouble("31.0"), calculadoraimc.calculoImc(), 0.1);
        assertEquals("Condição: Acima do Peso Ideal", calculadoraimc.calcularImcHomem());
    }

    @Test
    public void deveCalcularImcHomemObeso() {
        // Imc 31.1
        calculadoraimc.setPeso(101);
        calculadoraimc.setAltura(1.80f);
        assertEquals(Double.parseDouble("31.1"), calculadoraimc.calculoImc(), 0.1);
        assertEquals("Condição: Obeso", calculadoraimc.calcularImcHomem());
    }
}