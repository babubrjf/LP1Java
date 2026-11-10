package com.example.imc.web;

import com.example.imc.domain.CalculadoraImc;
import com.example.imc.config.WebConfig;
import com.example.imc.service.ImcService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.http.HttpHeaders;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ImcController.class)
@Import({ ImcService.class, CalculadoraImc.class, ApiExceptionHandler.class, WebConfig.class })
class ImcControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void deveCalcularImc() throws Exception {
		mockMvc.perform(post("/api/imc")
				.contentType(MediaType.APPLICATION_JSON)
				.content("""
						{"peso": 80, "altura": 1.75, "sexo": "M"}
						"""))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.imc").value(26.12))
				.andExpect(jsonPath("$.classificacao").value("No peso normal"));
	}

	@Test
	void deveRetornarBadRequestParaDadosInvalidos() throws Exception {
		mockMvc.perform(post("/api/imc")
				.contentType(MediaType.APPLICATION_JSON)
				.content("""
						{"peso": 0, "altura": 1.75, "sexo": "M"}
						"""))
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.erro").value("Peso deve ser maior que zero"));
	}

	@Test
	void devePermitirRequisicaoDoFrontendLocal() throws Exception {
		mockMvc.perform(post("/api/imc")
				.header(HttpHeaders.ORIGIN, "http://localhost:3000")
				.contentType(MediaType.APPLICATION_JSON)
				.content("""
						{"peso": 70, "altura": 1.75, "sexo": "M"}
						"""))
				.andExpect(status().isOk())
				.andExpect(header().string(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN,
						"http://localhost:3000"));
	}
}
