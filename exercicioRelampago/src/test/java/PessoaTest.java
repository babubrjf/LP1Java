import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    public void devePossuirNomeValido() {
        pessoa.setNome("Pessoa");
        assertEquals("Pessoa", pessoa.getNome());
    }

    @Test
    public void deveTestarNomeVazio() {
        try {
            pessoa.setNome("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }
}