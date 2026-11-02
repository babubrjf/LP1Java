import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ProvaTest {

    @Test
    public void testeProvaValida() {
        Prova prova = new Prova(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        assertEquals(Arrays.asList('A', 'B', 'C', 'D', 'E'), prova.getRespostas());
    }

    @Test
    public void testeProvaPoucasAlternativas() {
        try {
            new Prova(Arrays.asList('A', 'B', 'C', 'D'));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Respostas abaixo do mínimo", e.getMessage());
        }
    }

    @Test
    public void testeProvaPoucasAlternativasMock() {
        try {
            Prova prova = createMock(Prova.class);
            expect(prova.getRespostas()).andThrow(new IllegalArgumentException("Respostas abaixo do mínimo"));
            replay(prova);

            prova.getRespostas();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Respostas abaixo do mínimo", e.getMessage());
        }
    }

    @Test
    public void testeProvaExcessoDeAlternativas() {
        try {
            new Prova(Arrays.asList('A', 'B', 'C', 'D', 'E', 'A'));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Respostas acima do máximo", e.getMessage());
        }
    }

    @Test
    public void testeProvaExcessoAlternativasMock() {
        try {
            List<Character> respostas = createMock(ArrayList.class);
            expect(respostas.toArray()).andThrow(new IllegalArgumentException("Respostas acima do máximo"));
            replay(respostas);

            new Prova(respostas);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Respostas acima do máximo", e.getMessage());
        }
    }

    @Test
    public void testeProvaAlternativaInvalida() {
        try {
            new Prova(Arrays.asList('A', 'B', 'C', 'D', 'X'));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Alternativa inválida", e.getMessage());
        }
    }
}