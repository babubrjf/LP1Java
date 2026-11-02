import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ValidadorTest {

    @Test
    void deveCalcularNotaMaxima() {
        List<Character> gabaritoOficial = Arrays.asList('A', 'B', 'C', 'D', 'E');
        IGabarito gabaritoMock = createMock(IGabarito.class);
        expect(gabaritoMock.getRespostasCorretas()).andReturn(gabaritoOficial);
        replay(gabaritoMock);

        Validador validador = new Validador();
        Prova prova = new Prova(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        assertEquals(10.0, validador.calcularNota(prova, gabaritoMock, 10.0), 0.0);
        verify(gabaritoMock);
    }

    @Test
    void deveCalcularNotaMedia() {
        List<Character> gabaritoOficial = Arrays.asList('A', 'B', 'C', 'D', 'E');
        IGabarito gabaritoMock = createMock(IGabarito.class);
        expect(gabaritoMock.getRespostasCorretas()).andReturn(gabaritoOficial);
        replay(gabaritoMock);

        Validador validador = new Validador();
        Prova prova = new Prova(Arrays.asList('A', 'B', 'B', 'D', 'A'));

        assertEquals(6.0, validador.calcularNota(prova, gabaritoMock, 10.0), 0.0);
        verify(gabaritoMock);
    }

    @Test
    void deveVerificarProvaInvalida() {
        try {
            Validador validador = new Validador();
            validador.calcularNota(null, createMock(IGabarito.class), 10.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Prova inválida", e.getMessage());
        }
    }

    @Test
    void deveVerificarGabaritoInvalida() {
        try {
            Validador validador = new Validador();
            Prova prova = new Prova(Arrays.asList('A', 'B', 'C', 'D', 'E'));
            validador.calcularNota(prova, null, 10.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Gabarito inválido", e.getMessage());
        }
    }
}