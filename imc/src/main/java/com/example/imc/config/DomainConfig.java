package com.example.imc.config;

import com.example.imc.domain.CalculadoraImc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfig {

	@Bean
	CalculadoraImc calculadoraImc() {
		return new CalculadoraImc();
	}
}
