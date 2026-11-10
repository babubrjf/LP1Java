package com.example.imc.web;

import com.example.imc.web.dto.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class ApiExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ApiError> tratarValidacao(MethodArgumentNotValidException exception) {
		String mensagem = exception.getBindingResult().getFieldErrors().stream()
				.findFirst()
				.map(error -> error.getDefaultMessage())
				.orElse("Dados inválidos");
		return respostaBadRequest(mensagem);
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ApiError> tratarRegraDeNegocio(IllegalArgumentException exception) {
		return respostaBadRequest(exception.getMessage());
	}

	private ResponseEntity<ApiError> respostaBadRequest(String mensagem) {
		ApiError erro = new ApiError(Instant.now(), HttpStatus.BAD_REQUEST.value(), mensagem);
		return ResponseEntity.badRequest().body(erro);
	}
}
