public class Pessoa {

	private static final String SEXO_FEMININO = "F";
	private static final String SEXO_MASCULINO = "M";

	private double peso;
	private String sexo;
	private double altura;

	public Pessoa() {
	}

	public Pessoa(double peso, String sexo, double altura) {
		setPeso(peso);
		setSexo(sexo);
		setAltura(altura);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (!Double.isFinite(peso) || peso <= 0) {
			throw new IllegalArgumentException("Peso deve ser maior que zero");
		}
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if (sexo == null) {
			throw new IllegalArgumentException("Sexo deve ser F ou M");
		}

		String sexoNormalizado = sexo.trim().toUpperCase();
		if (!SEXO_FEMININO.equals(sexoNormalizado)
				&& !SEXO_MASCULINO.equals(sexoNormalizado)) {
			throw new IllegalArgumentException("Sexo deve ser F ou M");
		}
		this.sexo = sexoNormalizado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (!Double.isFinite(altura) || altura <= 0) {
			throw new IllegalArgumentException("Altura deve ser maior que zero");
		}
		this.altura = altura;
	}

	public String calcularImc() {
		if (peso <= 0 || altura <= 0 || sexo == null) {
			throw new IllegalStateException("Peso, sexo e altura devem ser informados");
		}

		double imc = peso / (altura * altura);

		if (SEXO_FEMININO.equals(sexo)) {
			if (imc < 19.1) {
				return "abaixo do peso";
			}
			if (imc < 25.8) {
				return "no peso normal";
			}
			if (imc < 27.3) {
				return "marginalmente acima do peso";
			}
			if (imc < 32.3) {
				return "acima do peso ideal";
			}
			return "Obeso";
		}

		if (imc < 20.7) {
			return "abaixo do peso";
		}
		if (imc < 26.4) {
			return "no peso normal";
		}
		if (imc < 27.8) {
			return "marginalmente acima do peso";
		}
		if (imc < 31.1) {
			return "acima do peso ideal";
		}
		return "Obeso";
	}
}
