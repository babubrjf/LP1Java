package com.example.imc.service;

import java.math.BigDecimal;

public record ResultadoImc(double peso, double altura, String sexo, BigDecimal imc, String classificacao) {

}