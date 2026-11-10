package com.example.imc.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public record ImcRequest(
		@NotNull(message = "Peso deve ser informado") @Positive(message = "Peso deve ser maior que zero") Double peso,

		@NotNull(message = "Altura deve ser informada") @Positive(message = "Altura deve ser maior que zero") Double altura,

		@NotBlank(message = "Sexo deve ser informado") @Pattern(regexp = "(?i)\\s*[FM]\\s*", message = "Sexo deve ser F ou M") String sexo) {
}
