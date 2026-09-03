public class Fatura {

	private static final String clienteRes = "RESIDENCIAL";
	private static final String clienteCom = "COMERCIAL";

	private double consumoKwh;
	private String tipoCliente;

	public Fatura() {
	}

	public Fatura(double consumoKwh, String tipoCliente) {
		setConsumoKwh(consumoKwh);
		setTipoCliente(tipoCliente);
	}

	public double getConsumoKwh() {
		return consumoKwh;
	}

	public void setConsumoKwh(double consumoKwh) {
		this.consumoKwh = consumoKwh;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente.trim().toUpperCase();
	}

	public String calcularTarifa() {
		// cliente residencial
		if (clienteRes.equals(tipoCliente)) {
			if (consumoKwh < 100) {
				return "tarifa social";
			}
			if (consumoKwh < 300) {
				return "tarifa normal";
			}
			if (consumoKwh < 500) {
				return "tarifa alta";
			}
			if (consumoKwh < 800) {
				return "tarifa muito alta";
			}
			return "tarifa de excedente";
		}

		// cliente comercial
		if (consumoKwh < 500) {
			return "tarifa básica";
		}
		if (consumoKwh < 1500) {
			return "tarifa intermediária";
		}
		if (consumoKwh < 3000) {
			return "tarifa avançada";
		}
		if (consumoKwh < 6000) {
			return "tarifa industrial";
		}
		return "tarifa de grande consumo";
	}
}
