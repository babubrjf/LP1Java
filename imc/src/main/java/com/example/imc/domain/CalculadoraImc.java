package com.example.imc.domain;

public final class CalculadoraImc {

	private static final String SEXO_FEMININO = "F";

	public double calcular(DadosPessoa pessoa) {
		validarPessoa(pessoa);
		return pessoa.getPeso() / Math.pow(pessoa.getAltura(), 2);
	}

	public String classificar(DadosPessoa pessoa) {
		double imc = calcular(pessoa);
		return classificar(imc, pessoa.getSexo());
	}

	public String classificar(double imc, String sexo) {
		if (!Double.isFinite(imc) || imc <= 0) {
			throw new IllegalArgumentException("IMC deve ser maior que zero");
		}
		if (!"F".equals(sexo) && !"M".equals(sexo)) {
			throw new IllegalArgumentException("Sexo deve ser F ou M");
		}
		return SEXO_FEMININO.equals(sexo)
				? classificarImcFeminino(imc)
				: classificarImcMasculino(imc);
	}

	private void validarPessoa(DadosPessoa pessoa) {
		if (pessoa == null) {
			throw new IllegalArgumentException("Pessoa deve ser informada");
		}
		if (!Double.isFinite(pessoa.getPeso()) || pessoa.getPeso() <= 0
				|| !Double.isFinite(pessoa.getAltura()) || pessoa.getAltura() <= 0) {
			throw new IllegalArgumentException("Peso e altura devem ser maiores que zero");
		}
		if (!"F".equals(pessoa.getSexo()) && !"M".equals(pessoa.getSexo())) {
			throw new IllegalArgumentException("Sexo deve ser F ou M");
		}
	}

	private String classificarImcFeminino(double imc) {
		if (imc < 19.1)
			return "Abaixo do peso";
		if (imc < 25.8)
			return "No peso normal";
		if (imc < 27.3)
			return "Marginalmente acima do peso";
		if (imc < 32.3)
			return "Acima do peso ideal";
		return "Obeso";
	}

	private String classificarImcMasculino(double imc) {
		if (imc < 20.7)
			return "Abaixo do peso";
		if (imc < 26.4)
			return "No peso normal";
		if (imc < 27.8)
			return "Marginalmente acima do peso";
		if (imc < 31.1)
			return "Acima do peso ideal";
		return "Obeso";
	}
}
