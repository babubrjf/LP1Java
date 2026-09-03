import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaturaTest {

	// residencial
	@Test
	void deveRetornarTarifaSocialAbaixoDe100() {
		Fatura fatura = new Fatura();
		fatura.setConsumoKwh(99.9);
		fatura.setTipoCliente("residencial");
		assertEquals(99.9, fatura.getConsumoKwh(), 0.001);
		assertEquals("RESIDENCIAL", fatura.getTipoCliente());
		assertEquals("tarifa social", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaNormalEm100() {
		Fatura fatura = new Fatura(100, "residencial");
		assertEquals("tarifa normal", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaAltaEm300() {
		Fatura fatura = new Fatura(300, "residencial");
		assertEquals("tarifa alta", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaMuitoAltaEm500() {
		Fatura fatura = new Fatura(500, "residencial");
		assertEquals("tarifa muito alta", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaDeExcedenteEm800() {
		Fatura fatura = new Fatura(800, "residencial");
		assertEquals("tarifa de excedente", fatura.calcularTarifa());
	}

	// comercial
	@Test
	void deveRetornarTarifaBasicaAbaixoDe500() {
		Fatura fatura = new Fatura(499.9, "comercial");
		assertEquals("tarifa básica", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaIntermediariaEm500() {
		Fatura fatura = new Fatura(500, "comercial");
		assertEquals("tarifa intermediária", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaAvancadaEm1500() {
		Fatura fatura = new Fatura(1500, "comercial");
		assertEquals("tarifa avançada", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaIndustrialEm3000() {
		Fatura fatura = new Fatura(3000, "comercial");
		assertEquals("tarifa industrial", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaDeGrandeConsumoEm6000() {
		Fatura fatura = new Fatura(6000, "comercial");
		assertEquals("tarifa de grande consumo", fatura.calcularTarifa());
	}
}
