package exercicio01;

import exemplo.Departamento;
import exemplo.Funcionario;
import exemplo.FuncionarioMensalista;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContribuinteTest {

    @Test
    void deveAdicionarNomeContribuinte() {
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.setNome("Pablo");
        assertEquals("Pablo", contribuinte.getNome());
    }

    @Test
    void deveAdicionarCodigoContribuinte() {
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.setCodigo(3);
        assertEquals(3, contribuinte.getCodigo());
    }

    @Test
    void deveAdicionarImovel() {
        Contribuinte contribuinte = new Contribuinte();
        Casa casa = new Casa();
        contribuinte.adicionarImovel(casa);
        assertEquals(1, contribuinte.getQuantidadeImoveis());
    }

    @Test
    void deveAdicionarImoveis() {
        Contribuinte contribuinte = new Contribuinte();
        Casa casa = new Casa();
        Apartamento apartamento = new Apartamento();
        contribuinte.adicionarImovel(casa);
        contribuinte.adicionarImovel(casa);
        contribuinte.adicionarImovel(apartamento);
        assertEquals(3, contribuinte.getQuantidadeImoveis());
    }

    @Test
    void deveRetornarZeroImoveis() {
        Contribuinte contribuinte = new Contribuinte();
        assertEquals(0, contribuinte.getQuantidadeImoveis());
    }

    @Test
    void deveCalcularTotalIPTU() {
        Contribuinte contribuinte = new Contribuinte();
        Casa casa = new Casa();
        Apartamento apartamento = new Apartamento();
        casa.setMetragemTerreno(35.0f);
        casa.setMetragemConstrucao(20.0f);
        apartamento.setMetragemConstrucao(80.0f);
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
    void deveEncontrarImovel() {
        Casa casa = new Casa();
        Apartamento apartamento = new Apartamento();
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.adicionarImovel(casa);
        contribuinte.adicionarImovel(apartamento);
        assertTrue(contribuinte.verificarImovel(apartamento));
    }

    @Test
    void naoDeveEncontrarImovel() {
        Casa casa = new Casa();
        Apartamento apartamento = new Apartamento();
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.adicionarImovel(casa);
        assertFalse(contribuinte.verificarImovel(apartamento));
    }

    @Test
    void deveRemoverImovel() {
        Casa casa = new Casa();
        Apartamento apartamento = new Apartamento();
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.adicionarImovel(casa);
        contribuinte.adicionarImovel(apartamento);
        contribuinte.removerImovel(casa);
        assertFalse(contribuinte.verificarImovel(casa));
    }

    @Test
    void deveRetornarListaImoveis() {
        Casa casa = new Casa();
        Apartamento apartamento = new Apartamento();
        Lote lote = new Lote();
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.adicionarImovel(casa);
        contribuinte.adicionarImovel(apartamento);
        contribuinte.adicionarImovel(lote);
        ArrayList<Imovel> lista = new ArrayList<Imovel>();
        lista.add(casa);
        lista.add(apartamento);
        lista.add(lote);
        assertEquals(lista, contribuinte.getImoveis());
    }
}