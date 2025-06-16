import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstadoTest {

    @Test
    public void testGetSetNome() {
        Estado estado = new Estado();
        estado.setNome("Rio de Janeiro");
        assertEquals("Rio de Janeiro", estado.getNome());
    }
}