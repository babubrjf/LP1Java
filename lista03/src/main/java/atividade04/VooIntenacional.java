package atividade04;

import java.time.LocalDate;

public class VooIntenacional extends Voo {

    public VooIntenacional(String origem, String destino, float distancia, LocalDate data){
        super(origem, destino, distancia, data);
    }

    public float calcularPreco(float fatorPreco, float taxaConversao) {
        if (fatorPreco <= 0) {
            throw new IllegalArgumentException("Fator de preco invalido");
        } else if (taxaConversao <= 0) {
            throw new IllegalArgumentException("Taxa de Conversao invalida");
        }
        return distancia * fatorPreco * taxaConversao;
    }
}