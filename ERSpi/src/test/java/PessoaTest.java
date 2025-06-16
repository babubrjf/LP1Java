import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void deveRetornarPessoaSemEscolaridade() {
        Professor professor = new Professor();
        assertEquals("Pessoa sem escolaridade", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarPessoaSemNaturalidade() {
        Aluno aluno = new Aluno();
        assertEquals("Pessoa sem naturalidade", aluno.getNomeCidade());
    }

//    @Test
//    public void testGetSetNaturalidade() {
//        Pessoa pessoa = new Pessoa();
//        pessoa.setNaturalidade("Minas Gerais");
//        assertEquals("Minas Gerais", pessoa.getNaturalidade());
//    }
//
//    @Test
//    public void testGetSetCidadeNascimento() {
//        Pessoa pessoa = new Pessoa();
//        Cidade cidade = new Cidade();
//        cidade.setNome("Juiz de Fora");
//        pessoa.setCidadeNascimento(cidade);
//        assertEquals("Juiz de Fora", pessoa.getCidadeNascimento().getNome());
//    }
//
//    @Test
//    public void testGetSetEscolaridade() {
//        Pessoa pessoa = new Pessoa();
//        Escolaridade escolaridade = new Escolaridade();
//        escolaridade.setNivel("Superior");
//        pessoa.setEscolaridade(escolaridade);
//        assertEquals("Superior", pessoa.getEscolaridade().getNivel());
//    }
}