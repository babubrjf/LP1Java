package atividade04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa("Pablo");
    }

    @Test
    public void deveEnvelhecerPessoa() {
        pessoa.setIdade(20);
        pessoa.setIdade(25);
        pessoa.envelhecer();
        assertEquals(26, pessoa.getIdade());
    }

    @Test
    public void naoDeveCrescerAlturaPessoa() {
        pessoa.setIdade(21);
        pessoa.setAltura(184.0f);
        pessoa.crescer(0.4f);
        assertEquals(184.4f, pessoa.getAltura());
    }

    @Test
    public void deveCrescerAlturaPessoa() {
        pessoa.setAltura(184.0f);
        pessoa.crescer(0.4f);
        assertEquals(184.4f, pessoa.getAltura());
    }

    @Test
    public void deveAumentarPesoPessoa() {
        pessoa.setPeso(93.0f);
        pessoa.ganharPeso(2.3f);
        assertEquals(95.3f, pessoa.getPeso());
    }

    @Test
    public void deveDiminuirPesoPessoa() {
        pessoa.setPeso(93.0f);
        pessoa.perderPeso(1.5f);
        assertEquals(91.5f, pessoa.getPeso());
    }

    @Test
    public void naoDeveZerarPesoPessoa() {
        try {
            pessoa.setPeso(93.0f);
            pessoa.perderPeso(93.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Peso Inválido", e.getMessage());
        }
    }
}