package com.example.imc.web;

import com.example.imc.service.ImcService;
import com.example.imc.web.dto.ImcRequest;
import com.example.imc.web.dto.ImcResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/imc")
public class ImcController {

	private final ImcService imcService;

	public ImcController(ImcService imcService) {
		this.imcService = imcService;
	}

	@PostMapping
	public ResponseEntity<ImcResponse> calcular(@Valid @RequestBody ImcRequest request) {
		var resultado = imcService.calcular(request.peso(), request.altura(), request.sexo());
		return ResponseEntity.ok(ImcResponse.from(resultado));
	}
}
