public final class CalculadoraImc {

	private static final String SEXO_FEMININO = "F";
	private static final String SEXO_MASCULINO = "M";

	public String classificar(DadosPessoa pessoa) {
		if (pessoa == null) {
			throw new IllegalArgumentException("Pessoa deve ser informada");
		}

		double peso = pessoa.getPeso();
		double altura = pessoa.getAltura();
		String sexo = pessoa.getSexo();
		validarDados(peso, altura, sexo);
		double imc = peso / (altura * altura);
		return SEXO_FEMININO.equals(sexo) ? classificarImcFeminino(imc) : classificarImcMasculino(imc);
	}

	private void validarDados(double peso, double altura, String sexo) {
		if (!Double.isFinite(peso) || !Double.isFinite(altura) || peso <= 0 || altura <= 0 || sexo == null) {
			throw new IllegalStateException("Peso, sexo e altura devem ser informados");
		}

		if (!SEXO_FEMININO.equals(sexo) && !SEXO_MASCULINO.equals(sexo)) {
			throw new IllegalStateException("Sexo deve ser F ou M");
		}
	}

	private String classificarImcFeminino(double imc) {
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

	private String classificarImcMasculino(double imc) {
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
