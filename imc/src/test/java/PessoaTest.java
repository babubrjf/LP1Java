import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

	@Test
	void deveRetornarAbaixoDoPesoMulherImc1909() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(19.09);
		pessoa.setSexo("F");
		pessoa.setAltura(1.0);
		assertEquals("abaixo do peso", pessoa.calcularImc());
	}

	@Test
	void deveRetornarPesoNormalMulherImc1910() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(19.10);
		pessoa.setSexo("F");
		pessoa.setAltura(1.0);
		assertEquals("no peso normal", pessoa.calcularImc());
	}

	@Test
	void deveRetornarPesoNormalMulherImc1911() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(19.11);
		pessoa.setSexo("F");
		pessoa.setAltura(1.0);
		assertEquals("no peso normal", pessoa.calcularImc());
	}

	@Test
	void deveRetornarPesoNormalMulherImc2579() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(25.79);
		pessoa.setSexo("F");
		pessoa.setAltura(1.0);
		assertEquals("no peso normal", pessoa.calcularImc());
	}

	@Test
	void deveRetornarMarginalmenteAcimaDoPesoMulherImc2580() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(25.80);
		pessoa.setSexo("F");
		pessoa.setAltura(1.0);
		assertEquals("marginalmente acima do peso", pessoa.calcularImc());
	}

	@Test
	void deveRetornarMarginalmenteAcimaDoPesoMulherImc2581() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(25.81);
		pessoa.setSexo("F");
		pessoa.setAltura(1.0);
		assertEquals("marginalmente acima do peso", pessoa.calcularImc());
	}

	@Test
	void deveRetornarMarginalmenteAcimaDoPesoMulherImc2729() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(27.29);
		pessoa.setSexo("F");
		pessoa.setAltura(1.0);
		assertEquals("marginalmente acima do peso", pessoa.calcularImc());
	}

	@Test
	void deveRetornarAcimaDoPesoIdealMulherImc2730() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(27.30);
		pessoa.setSexo("F");
		pessoa.setAltura(1.0);
		assertEquals("acima do peso ideal", pessoa.calcularImc());
	}

	@Test
	void deveRetornarAcimaDoPesoIdealMulherImc2731() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(27.31);
		pessoa.setSexo("F");
		pessoa.setAltura(1.0);
		assertEquals("acima do peso ideal", pessoa.calcularImc());
	}

	@Test
	void deveRetornarAcimaDoPesoIdealMulherImc3229() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(32.29);
		pessoa.setSexo("F");
		pessoa.setAltura(1.0);
		assertEquals("acima do peso ideal", pessoa.calcularImc());
	}

	@Test
	void deveRetornarObesoMulherImc3230() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(32.30);
		pessoa.setSexo("F");
		pessoa.setAltura(1.0);
		assertEquals("Obeso", pessoa.calcularImc());
	}

	@Test
	void deveRetornarObesoMulherImc3231() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(32.31);
		pessoa.setSexo("F");
		pessoa.setAltura(1.0);
		assertEquals("Obeso", pessoa.calcularImc());
	}

	@Test
	void deveRetornarAbaixoDoPesoHomemImc2069() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(20.69);
		pessoa.setSexo("M");
		pessoa.setAltura(1.0);
		assertEquals("abaixo do peso", pessoa.calcularImc());
	}

	@Test
	void deveRetornarPesoNormalHomemImc2070() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(20.70);
		pessoa.setSexo("M");
		pessoa.setAltura(1.0);
		assertEquals("no peso normal", pessoa.calcularImc());
	}

	@Test
	void deveRetornarPesoNormalHomemImc2071() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(20.71);
		pessoa.setSexo("M");
		pessoa.setAltura(1.0);
		assertEquals("no peso normal", pessoa.calcularImc());
	}

	@Test
	void deveRetornarPesoNormalHomemImc2639() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(26.39);
		pessoa.setSexo("M");
		pessoa.setAltura(1.0);
		assertEquals("no peso normal", pessoa.calcularImc());
	}

	@Test
	void deveRetornarMarginalmenteAcimaDoPesoHomemImc2640() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(26.40);
		pessoa.setSexo("M");
		pessoa.setAltura(1.0);
		assertEquals("marginalmente acima do peso", pessoa.calcularImc());
	}

	@Test
	void deveRetornarMarginalmenteAcimaDoPesoHomemImc2641() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(26.41);
		pessoa.setSexo("M");
		pessoa.setAltura(1.0);
		assertEquals("marginalmente acima do peso", pessoa.calcularImc());
	}

	@Test
	void deveRetornarMarginalmenteAcimaDoPesoHomemImc2779() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(27.79);
		pessoa.setSexo("M");
		pessoa.setAltura(1.0);
		assertEquals("marginalmente acima do peso", pessoa.calcularImc());
	}

	@Test
	void deveRetornarAcimaDoPesoIdealHomemImc2780() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(27.80);
		pessoa.setSexo("M");
		pessoa.setAltura(1.0);
		assertEquals("acima do peso ideal", pessoa.calcularImc());
	}

	@Test
	void deveRetornarAcimaDoPesoIdealHomemImc2781() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(27.81);
		pessoa.setSexo("M");
		pessoa.setAltura(1.0);
		assertEquals("acima do peso ideal", pessoa.calcularImc());
	}

	@Test
	void deveRetornarAcimaDoPesoIdealHomemImc3109() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(31.09);
		pessoa.setSexo("M");
		pessoa.setAltura(1.0);
		assertEquals("acima do peso ideal", pessoa.calcularImc());
	}

	@Test
	void deveRetornarObesoHomemImc3110() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(31.10);
		pessoa.setSexo("M");
		pessoa.setAltura(1.0);
		assertEquals("Obeso", pessoa.calcularImc());
	}

	@Test
	void deveRetornarObesoHomemImc3111() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPeso(31.11);
		pessoa.setSexo("M");
		pessoa.setAltura(1.0);
		assertEquals("Obeso", pessoa.calcularImc());
	}
}
