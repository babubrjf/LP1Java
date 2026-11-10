package com.example.imc.service;

import com.example.imc.domain.CalculadoraImc;
import com.example.imc.domain.Pessoa;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class ImcService {

	private final CalculadoraImc calculadoraImc;

	public ImcService(CalculadoraImc calculadoraImc) {
		this.calculadoraImc = calculadoraImc;
	}

	public ResultadoImc calcular(double peso, double altura, String sexo) {
		Pessoa pessoa = new Pessoa(peso, sexo, altura);
		double imc = calculadoraImc.calcular(pessoa);

		return new ResultadoImc(
				pessoa.getPeso(),
				pessoa.getAltura(),
				pessoa.getSexo(),
				BigDecimal.valueOf(imc).setScale(2, RoundingMode.HALF_UP),
				calculadoraImc.classificar(imc, pessoa.getSexo()));
	}
}
