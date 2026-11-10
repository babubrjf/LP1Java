package com.example.imc.domain;

import java.util.Locale;

public final class Pessoa implements DadosPessoa {

	private static final String SEXO_FEM = "F";
	private static final String SEXO_MASC = "M";

	private final double peso;
	private final String sexo;
	private final double altura;

	public Pessoa(double peso, String sexo, double altura) {
		this.peso = validarMedida(peso, "Peso");
		this.altura = validarMedida(altura, "Altura");
		this.sexo = validarSexo(sexo);
	}

	@Override
	public double getPeso() {
		return peso;
	}

	@Override
	public String getSexo() {
		return sexo;
	}

	@Override
	public double getAltura() {
		return altura;
	}

	private static double validarMedida(double valor, String campo) {
		if (!Double.isFinite(valor) || valor <= 0) {
			throw new IllegalArgumentException(campo + " deve ser maior que zero");
		}
		return valor;
	}

	private static String validarSexo(String sexo) {
		if (sexo == null) {
			throw new IllegalArgumentException("Sexo deve ser F ou M");
		}

		String sexoNormalizado = sexo.trim().toUpperCase(Locale.ROOT);
		if (!SEXO_FEM.equals(sexoNormalizado) && !SEXO_MASC.equals(sexoNormalizado)) {
			throw new IllegalArgumentException("Sexo deve ser F ou M");
		}
		return sexoNormalizado;
	}
}
