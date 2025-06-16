import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TipoEnsinoTest {

    @Test
    public void testGetSetNome() {
        TipoEnsino tipo = new TipoEnsino();
        tipo.setNome("Superior");
        assertEquals("Superior", tipo.getNome());
    }
}