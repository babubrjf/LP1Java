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

    @Test
    void deveCalcularTotalIPTU() {
        Contribuinte contribuinte = new Contribuinte();
        Casa casa = new Casa();
        Apartamento apartamento = new Apartamento();
        casa.setmQuadradoTerreno(35.0f);
        casa.setmQuadradoConstrucao(20.0f);
        apartamento.setmQuadradoConstrucao(80.0f);
        apartamento.setAndar(2);
        contribuinte.adicionarImovel(casa);
        contribuinte.adicionarImovel(apartamento);
        assertEquals(4610.0f, contribuinte.calcularTotalIPTU(), 0.01f);
    }

    @Test
    void deveRetornarIPTUZeradoContribuinteSemImoveis() {
        Contribuinte contribuinte = new Contribuinte();
        assertEquals(0.0f, contribuinte.calcularTotalIPTU(), 0.01f);
    }

    @Test
    void deveRetornarZeroImoveisContribuinteSemImoveis() {
        Contribuinte contribuinte = new Contribuinte();
        assertEquals(0, contribuinte.getQuantidadeImoveis());
    }
}