package aula1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    void deveTestarMasculino() {
        pessoa.setSexo("Masculino");
        assertEquals(pessoa.getSexo(), "Masculino");
    }

    @Test
    void deveTestarFeminino() {
        pessoa.setSexo("Feminino");
        assertEquals(pessoa.getSexo(), "Feminino");
    }

    @Test
    void deveTratarSexoInvalido() {
        try{
            pessoa.setSexo(null);
        }catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Sexo Invalido");
        }
    }

    @Test
    void deveTratarPesoZeradoNegativo(){
        Imc imc = new Imc();
        try{
            imc.setPeso(0.0);
        } catch (IllegalArgumentException e) {
            assertEquals("Peso invalido", e.getMessage());
        }
    }

    @Test
    void deveTratarPesoNulo(){
        Imc imc = new Imc();
        try{
            imc.setPeso(null);
        }catch (IllegalArgumentException e) {
            assertEquals("Peso não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveTestarPesoValido(){
        Imc imc = new Imc();
        imc.setPeso(0.01);
        assertEquals(imc.getPeso(), 0.01);
    }

    @Test
    void deveTratarAlturaNula(){
        Imc imc = new Imc();
        try{
            imc.setAltura(null);
        }catch (IllegalArgumentException e) {
            assertEquals("Altura não pode ser nula", e.getMessage());
        }
    }

    @Test
    void deveTratarAlturaInvalida(){
        Imc imc = new Imc();
        try{
            imc.setAltura(0.0);
        }catch (IllegalArgumentException e) {
            assertEquals("Altura invalida", e.getMessage());
        }
    }

    @Test
    void deveTestarAlturaValida(){
        Imc imc = new Imc();
        imc.setAltura(0.01);
        assertEquals(imc.getAltura(), 0.01);
    }

    @Test
    void FemininoAbaixoDoPeso() {
        Imc imc = new Imc();
        pessoa.setSexo("Feminino");
        imc.setPeso(19.09);
        imc.setAltura(1.0);
        assertEquals("Abaixo do peso", pessoa.verificarImc(imc));
    }
    
    @Test
    void FemininoNoPesoNormal() {
        Imc imc = new Imc();
        pessoa.setSexo("Feminino");
        imc.setPeso(25.79);
        imc.setAltura(1.0);
        assertEquals("No peso normal", pessoa.verificarImc(imc));
    }

    @Test
    void FemininoMarginalmenteAcima() {
        Imc imc = new Imc();
        pessoa.setSexo("Feminino");
        imc.setPeso(27.29);
        imc.setAltura(1.0);
        assertEquals("Marginalmente acima do peso", pessoa.verificarImc(imc));
    }

    @Test
    void FemininoAcimaDoPesoIdeal() {
        Imc imc = new Imc();
        pessoa.setSexo("Feminino");
        imc.setPeso(32.29);
        imc.setAltura(1.0);
        assertEquals("Acima do peso ideal", pessoa.verificarImc(imc));
    }

    @Test
    void FemininoObeso() {
        Imc imc = new Imc();
        pessoa.setSexo("Feminino");
        imc.setPeso(32.3);
        imc.setAltura(1.0);
        assertEquals("Obeso", pessoa.verificarImc(imc));
    }

    @Test
    void MasculinoAbaixoDoPeso() {
        Imc imc = new Imc();
        pessoa.setSexo("Masculino");
        imc.setPeso(20.69);
        imc.setAltura(1.0);
        assertEquals("Abaixo do peso", pessoa.verificarImc(imc));
    }

    @Test
    void MasculinoNoPesoNormal() {
        Imc imc = new Imc();
        pessoa.setSexo("Masculino");
        imc.setPeso(26.39);
        imc.setAltura(1.0);
        assertEquals("No peso normal", pessoa.verificarImc(imc));
    }

    @Test
    void MasculinoMarginalmenteAcima() {
        Imc imc = new Imc();
        pessoa.setSexo("Masculino");
        imc.setPeso(27.79);
        imc.setAltura(1.0);
        assertEquals("Marginalmente acima do peso", pessoa.verificarImc(imc));
    }

    @Test
    void MasculinoAcimaDoPesoIdeal() {
        Imc imc = new Imc();
        pessoa.setSexo("Masculino");
        imc.setPeso(31.09);
        imc.setAltura(1.0);
        assertEquals("Acima do peso ideal", pessoa.verificarImc(imc));
    }

    @Test
    void MasculinoObeso() {
        Imc imc = new Imc();
        pessoa.setSexo("Masculino");
        imc.setPeso(31.1);
        imc.setAltura(1.0);
        assertEquals("Obeso", pessoa.verificarImc(imc));
    }



    @Test
    void MockFemAbai(){
        IImc pessoaMock = createMock(IImc.class);
        expect(pessoaMock.calcularImc()).andReturn(19.0);
        replay(pessoaMock);
        pessoa.setSexo("Feminino");
        assertEquals("Abaixo do peso", pessoa.verificarImc(pessoaMock));
    }

    @Test
    void MockFemNorm(){
        IImc pessoaMock = createMock(IImc.class);
        expect(pessoaMock.calcularImc()).andReturn(25.7);
        replay(pessoaMock);
        pessoa.setSexo("Feminino");
        assertEquals("No peso normal",pessoa.verificarImc(pessoaMock));
    }

    @Test
    void MockFemMarAci(){
        IImc pessoaMock = createMock(IImc.class);
        expect(pessoaMock.calcularImc()).andReturn(27.2);
        replay(pessoaMock);
        pessoa.setSexo("Feminino");
        assertEquals("Marginalmente acima do peso",pessoa.verificarImc(pessoaMock));
    }

    @Test
    void MockFemAcima(){
        IImc pessoaMock = createMock(IImc.class);
        expect(pessoaMock.calcularImc()).andReturn(32.2);
        replay(pessoaMock);
        pessoa.setSexo("Feminino");
        assertEquals("Acima do peso ideal",pessoa.verificarImc(pessoaMock));
    }

    @Test
    void MockFemObe(){
        IImc pessoaMock = createMock(IImc.class);
        expect(pessoaMock.calcularImc()).andReturn(32.3);
        replay(pessoaMock);
        pessoa.setSexo("Feminino");
        assertEquals("Obeso",pessoa.verificarImc(pessoaMock));
    }

    @Test
    void MockMascAbaixo() {
        IImc pessoaMock = createMock(IImc.class);
        expect(pessoaMock.calcularImc()).andReturn(20.6);
        replay(pessoaMock);
        pessoa.setSexo("Masculino");
        assertEquals("Abaixo do peso",pessoa.verificarImc(pessoaMock));
    }

    @Test
    void MockMascNormal() {
        IImc pessoaMock = createMock(IImc.class);
        expect(pessoaMock.calcularImc()).andReturn(26.3);
        replay(pessoaMock);
        pessoa.setSexo("Masculino");
        assertEquals("No peso normal",pessoa.verificarImc(pessoaMock));
    }

    @Test
    void MockMascMarginalmente() {
        IImc pessoaMock = createMock(IImc.class);
        expect(pessoaMock.calcularImc()).andReturn(27.7);
        replay(pessoaMock);
        pessoa.setSexo("Masculino");
        assertEquals("Marginalmente acima do peso",pessoa.verificarImc(pessoaMock));
    }

    @Test
    void MockMascAcimaIdeal() {
        IImc pessoaMock = createMock(IImc.class);
        expect(pessoaMock.calcularImc()).andReturn(31.0);
        replay(pessoaMock);
        pessoa.setSexo("Masculino");
        assertEquals("Acima do peso ideal",pessoa.verificarImc(pessoaMock));
    }

    @Test
    void MockMascObeso() {
        IImc pessoaMock = createMock(IImc.class);
        expect(pessoaMock.calcularImc()).andReturn(31.1);
        replay(pessoaMock);
        pessoa.setSexo("Masculino");
        assertEquals("Obeso",pessoa.verificarImc(pessoaMock));
    }

}
