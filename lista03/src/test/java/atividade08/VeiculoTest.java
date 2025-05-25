package atividade08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveRegistrarNomeModeloPrecoBase() {
        Veiculo veiculo = new Bicicleta("Caloi", "BMX", 1050.0f);
        assertEquals("Caloi", veiculo.getMarca());
        assertEquals("BMX", veiculo.getModelo());
        assertEquals(1050.0f, veiculo.getPrecoBase());
    }

    @Test
    void deveRegistrarMarcaTirandoEspacos() {
        Veiculo veiculo = new Bicicleta(" Caloi ", "BMX", 1050.0f);
        assertEquals("Caloi", veiculo.getMarca());
    }

    @Test
    void deveRegistrarModeloTirandoEspacos() {
        Veiculo veiculo = new Bicicleta("Caloi", "  BMX", 1050.0f);
        assertEquals("BMX", veiculo.getModelo());
    }

    @Test
    void deveLancarExcecaoMarcaNula() {
        try {
            Veiculo veiculo = new Bicicleta("Caloi", "BMX", 1050.0f);
            veiculo.setMarca("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Marca invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoModeloNulo() {
        try {
            Veiculo veiculo = new Bicicleta("Caloi", "BMX", 1050.0f);
            veiculo.setModelo("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Modelo invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoMarcaNulaConstrutor() {
        try {
            Veiculo veiculo = new Bicicleta("", "BMX", 1050.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Marca invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoModeloNuloConstrutor() {
        try {
            Veiculo veiculo = new Bicicleta("Caloi", "", 1050.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Modelo invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoMarcaVazia() {
        try {
            Veiculo veiculo = new Bicicleta(" ", "BMX", 1050.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Marca invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoModeloVazio() {
        try {
            Veiculo veiculo = new Bicicleta("Caloi", " ", 1050.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Modelo invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoBaseZerado() {
        try {
            Veiculo veiculo = new Bicicleta("Caloi", "BMX", 0.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco base invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoBaseNegativo() {
        try {
            Veiculo veiculo = new Bicicleta("Caloi", "BMX", -0.01f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco base invalido", e.getMessage());
        }
    }
}