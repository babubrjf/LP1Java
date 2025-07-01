package exercicio01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContribuinteTest {

    @Test
    void deveAdicionarImovel() {
        Contribuinte contribuinte = new Contribuinte();
        Casa casa = new Casa();
        casa.setTipo("casa");
        contribuinte.adicionarImovel(casa);
        assertEquals(1, contribuinte.getQuantidadeImoveis());
    }

    @Test
    void deveAdicionarImoveis() {
        Contribuinte contribuinte = new Contribuinte();
        Casa casa = new Casa();
        Apartamento apartamento = new Apartamento();
        casa.setTipo("casa");
        casa.setTipo("casa");
        apartamento.setTipo("apartamento");
        contribuinte.adicionarImovel(casa);
        contribuinte.adicionarImovel(casa);
        contribuinte.adicionarImovel(apartamento);
        assertEquals(3, contribuinte.getQuantidadeImoveis());
    }

}