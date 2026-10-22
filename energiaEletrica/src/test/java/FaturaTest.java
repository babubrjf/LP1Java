import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaturaTest {

	// residencial
	@Test
	void deveRetornarTarifaSocial() {
		Fatura fatura = new Fatura();
		fatura.setConsumoKwh(99.9);
		fatura.setTipoCliente("residencial");
		assertEquals(99.9, fatura.getConsumoKwh(), 0.001);
		assertEquals("RESIDENCIAL", fatura.getTipoCliente());
		assertEquals("tarifa social", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaNormalMinima() {
		Fatura fatura = new Fatura(100, "residencial");
		assertEquals("tarifa normal", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaNormalMaxima() {
		Fatura fatura = new Fatura(299.9, "residencial");
		assertEquals("tarifa normal", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaAltaMinima() {
		Fatura fatura = new Fatura(300, "residencial");
		assertEquals("tarifa alta", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaAltaMaxima() {
		Fatura fatura = new Fatura(499.9, "residencial");
		assertEquals("tarifa alta", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaMuitoAltaMinima() {
		Fatura fatura = new Fatura(500, "residencial");
		assertEquals("tarifa muito alta", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaMuitoAltaMaxima() {
		Fatura fatura = new Fatura(799.9, "residencial");
		assertEquals("tarifa muito alta", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaDeExcedente() {
		Fatura fatura = new Fatura(800, "residencial");
		assertEquals("tarifa de excedente", fatura.calcularTarifa());
	}

	// comercial
	@Test
	void deveRetornarTarifaBasica() {
		Fatura fatura = new Fatura(499.9, "comercial");
		assertEquals("tarifa básica", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaIntermediariaMinima() {
		Fatura fatura = new Fatura(500, "comercial");
		assertEquals("tarifa intermediária", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaIntermediariaMaxima() {
		Fatura fatura = new Fatura(1499.9, "comercial");
		assertEquals("tarifa intermediária", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaAvancadaMinima() {
		Fatura fatura = new Fatura(1500, "comercial");
		assertEquals("tarifa avançada", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaAvancadaMaxima() {
		Fatura fatura = new Fatura(2999.9, "comercial");
		assertEquals("tarifa avançada", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaIndustrialMinima() {
		Fatura fatura = new Fatura(3000, "comercial");
		assertEquals("tarifa industrial", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaIndustrialMaxima() {
		Fatura fatura = new Fatura(5999.9, "comercial");
		assertEquals("tarifa industrial", fatura.calcularTarifa());
	}

	@Test
	void deveRetornarTarifaDeGrandeConsumoEm6000() {
		Fatura fatura = new Fatura(6000, "comercial");
		assertEquals("tarifa de grande consumo", fatura.calcularTarifa());
	}
}
