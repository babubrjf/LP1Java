package com.example.imc.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PessoaTest {

	private final CalculadoraImc calculadora = new CalculadoraImc();

	@Test
	void deveNormalizarSexo() {
		Pessoa pessoa = new Pessoa(58.5, " f ", 1.75);

		assertEquals("F", pessoa.getSexo());
		assertEquals("No peso normal", calculadora.classificar(pessoa));
	}

	@Test
	void deveRejeitarPesoInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Pessoa(0, "M", 1.75));
	}

	@Test
	void deveRejeitarSexoInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Pessoa(80, "X", 1.75));
	}

	@ParameterizedTest
	@CsvSource({
			"58.4, F, 1.75, Abaixo do peso",
			"58.5, F, 1.75, No peso normal",
			"78.9, F, 1.75, No peso normal",
			"79.1, F, 1.75, Marginalmente acima do peso",
			"79.7, F, 1.71, Marginalmente acima do peso",
			"80.9, F, 1.72, Acima do peso ideal",
			"95.5, F, 1.72, Acima do peso ideal",
			"95.6, F, 1.72, Obeso",
			"63.3, M, 1.75, Abaixo do peso",
			"63.5, M, 1.75, No peso normal",
			"80.8, M, 1.75, No peso normal",
			"80.9, M, 1.75, Marginalmente acima do peso",
			"85.1, M, 1.75, Marginalmente acima do peso",
			"85.2, M, 1.75, Acima do peso ideal",
			"95.2, M, 1.75, Acima do peso ideal",
			"95.3, M, 1.75, Obeso"
	})
	void devePreservarLimitesDaTabela(double peso, String sexo, double altura, String classificacao) {
		Pessoa pessoa = new Pessoa(peso, sexo, altura);

		assertEquals(classificacao, calculadora.classificar(pessoa));
	}
}
