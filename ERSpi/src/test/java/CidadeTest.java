import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CidadeTest {

    @Test
    public void testGetSetNome() {
        Cidade cidade = new Cidade();
        cidade.setNome("Belo Horizonte");
        assertEquals("Belo Horizonte", cidade.getNome());
    }

    @Test
    public void testGetSetEstado() {
        Cidade cidade = new Cidade();
        Estado estado = new Estado();
        estado.setNome("Minas Gerais");
        cidade.setEstado(estado);
        assertEquals("Minas Gerais", cidade.getEstado().getNome());
    }
}