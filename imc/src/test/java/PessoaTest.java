import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

	private void mostrarImc(Pessoa pessoa) {
		double imc = pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
		System.out.printf("IMC: %.2f%n", imc);
	}

	// mulher
	@Test
	void deveRetornarAbaixoDoPesoMulher() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(58.4);
		pessoa.setSexo("F");
		pessoa.setAltura(1.75);
		assertEquals("abaixo do peso", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarPesoNormalMulherMin() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(58.5);
		pessoa.setSexo("F");
		pessoa.setAltura(1.75);
		assertEquals("no peso normal", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarPesoNormalMulherMax() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(78.9);
		pessoa.setSexo("F");
		pessoa.setAltura(1.75);
		assertEquals("no peso normal", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarAcimaDoPesoMarginalMulherMin() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(79.1);
		pessoa.setSexo("F");
		pessoa.setAltura(1.75);
		assertEquals("marginalmente acima do peso", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarAcimaDoPesoMarginalMulherMax() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(79.7);
		pessoa.setSexo("F");
		pessoa.setAltura(1.71);
		assertEquals("marginalmente acima do peso", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarAcimaDoPesoIdealMulherMin() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(80.9);
		pessoa.setSexo("F");
		pessoa.setAltura(1.72);
		assertEquals("acima do peso ideal", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarAcimaDoPesoIdealMulherMax() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(95.5);
		pessoa.setSexo("F");
		pessoa.setAltura(1.72);
		assertEquals("acima do peso ideal", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarObesoMulher() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(95.6);
		pessoa.setSexo("F");
		pessoa.setAltura(1.72);
		assertEquals("Obeso", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	// homem
	@Test
	void deveRetornarAbaixoDoPesoHomem() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(63.3);
		pessoa.setSexo("M");
		pessoa.setAltura(1.75);
		assertEquals("abaixo do peso", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarPesoNormalHomemMin() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(63.5);
		pessoa.setSexo("M");
		pessoa.setAltura(1.75);
		assertEquals("no peso normal", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarPesoNormalHomemMax() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(80.8);
		pessoa.setSexo("M");
		pessoa.setAltura(1.75);
		assertEquals("no peso normal", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarAcimaDoPesoMarginalHomemMin() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(80.9);
		pessoa.setSexo("M");
		pessoa.setAltura(1.75);
		assertEquals("marginalmente acima do peso", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarAcimaDoPesoMarginalHomemMax() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(85.1);
		pessoa.setSexo("M");
		pessoa.setAltura(1.75);
		assertEquals("marginalmente acima do peso", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarAcimaDoPesoIdealHomemMin() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(85.2);
		pessoa.setSexo("M");
		pessoa.setAltura(1.75);
		assertEquals("acima do peso ideal", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarAcimaDoPesoIdealHomemMax() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(95.2);
		pessoa.setSexo("M");
		pessoa.setAltura(1.75);
		assertEquals("acima do peso ideal", pessoa.calcularImc());
		mostrarImc(pessoa);
	}

	@Test
	void deveRetornarObesoHomem() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(95.3);
		pessoa.setSexo("M");
		pessoa.setAltura(1.75);
		assertEquals("Obeso", pessoa.calcularImc());
		mostrarImc(pessoa);
	}
}
