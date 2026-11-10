package com.example.imc.web.dto;

import com.example.imc.service.ResultadoImc;

import java.math.BigDecimal;

public record ImcResponse(
		double peso,
		double altura,
		String sexo,
		BigDecimal imc,
		String classificacao) {
	public static ImcResponse from(ResultadoImc resultado) {
		return new ImcResponse(
				resultado.peso(),
				resultado.altura(),
				resultado.sexo(),
				resultado.imc(),
				resultado.classificacao());
	}
}
