import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EscolaridadeTest {

    @Test
    public void deveRetornarNomeEscolaridade() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Pós-graduação");
        assertEquals("Pós-graduação", escolaridade.getNome());
    }
}