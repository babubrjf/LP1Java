package com.example.imc.domain;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraImcTest {

	private final CalculadoraImc calculadora = new CalculadoraImc();

	@Test
	void deveClassificarMulherComPesoNormalUsandoDadosMockados() {
		DadosPessoa pessoaMock = criarPessoaMock(58.5, 1.75, "F");

		assertEquals("No peso normal", calculadora.classificar(pessoaMock));
		verify(pessoaMock);
	}

	@Test
	void deveClassificarHomemObesoUsandoDadosMockados() {
		DadosPessoa pessoaMock = criarPessoaMock(95.3, 1.75, "M");

		assertEquals("Obeso", calculadora.classificar(pessoaMock));
		verify(pessoaMock);
	}

	private DadosPessoa criarPessoaMock(double peso, double altura, String sexo) {
		DadosPessoa pessoaMock = createMock(DadosPessoa.class);
		expect(pessoaMock.getPeso()).andStubReturn(peso);
		expect(pessoaMock.getAltura()).andStubReturn(altura);
		expect(pessoaMock.getSexo()).andStubReturn(sexo);
		replay(pessoaMock);
		return pessoaMock;
	}
}
