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
    public void deveCalcularIMC() {
        calculadoraimc.setSexo("M");
        calculadoraimc.setAltura(1.85f);
        calculadoraimc.setPeso(95);
        DecimalFormat df = new DecimalFormat("#.##");
        assertEquals("Acima do Peso", calculadoraimc.condicao());
    }
}