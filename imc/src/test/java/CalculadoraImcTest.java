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
		DadosPessoa pessoaMock = createMock(DadosPessoa.class);
		expect(pessoaMock.getPeso()).andReturn(58.5);
		expect(pessoaMock.getAltura()).andReturn(1.75);
		expect(pessoaMock.getSexo()).andReturn("F");
		replay(pessoaMock);
		String classificacao = calculadora.classificar(pessoaMock);
		assertEquals("no peso normal", classificacao);
		verify(pessoaMock);
	}

	@Test
	void deveClassificarHomemObesoUsandoDadosMockados() {
		DadosPessoa pessoaMock = createMock(DadosPessoa.class);
		expect(pessoaMock.getPeso()).andReturn(95.3);
		expect(pessoaMock.getAltura()).andReturn(1.75);
		expect(pessoaMock.getSexo()).andReturn("M");
		replay(pessoaMock);
		String classificacao = calculadora.classificar(pessoaMock);
		assertEquals("Obeso", classificacao);
		verify(pessoaMock);
	}
}
