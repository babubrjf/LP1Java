package exemplo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarZeroFuncionarios() {
        Departamento departamento = new Departamento();
        assertEquals(0, departamento.getNumeroFuncionarios());
    }

    @Test
    void deveRetornarUmFuncionario() {
        Departamento departamento = new Departamento();
        Funcionario funcionario = new FuncionarioMensalista();
        departamento.alocar(funcionario);
        assertEquals(1, departamento.getNumeroFuncionarios());
    }

    @Test
    void deveRetornarMaisDeUmFuncionario() {
        Departamento departamento = new Departamento();
        Funcionario funcionario = new FuncionarioMensalista();
        departamento.alocar(funcionario);
        departamento.alocar(funcionario);
        assertEquals(2, departamento.getNumeroFuncionarios());
    }


    @Test
    void deveCalcularFolhaPagamento() {
        Departamento departamento = new Departamento();

        FuncionarioMensalista func1 = new FuncionarioMensalista();
        FuncionarioDiarista func2 = new FuncionarioDiarista();
        FuncionarioHorista func3 = new FuncionarioHorista();

        departamento.alocar(func1);
        departamento.alocar(func2);
        departamento.alocar(func3);

        func1.setSalario(1000.0f);
        func2.setNumDias(20);
        func2.setSalarioDia(100.0f);
        func3.setNumDias(30);
        func3.setNumHorasDia(10);
        func3.setSalarioHora(10.0f);

        assertEquals(6000.0f, departamento.calcularFolhaPagamento());
    }

    @Test
    void deveEncontrarNomeFuncionario() {
        FuncionarioMensalista func1 = new FuncionarioMensalista();
        func1.setNome("Joao");
        FuncionarioMensalista func2 = new FuncionarioMensalista();
        func2.setNome("Pedro");
        Departamento departamento = new Departamento();
        departamento.alocar(func1);
        departamento.alocar(func2);
        assertTrue(departamento.verificarFuncionarioPeloNome("Pedro"));
    }

    @Test
    void naoDeveEncontrarNomeFuncionario() {
        FuncionarioMensalista func1 = new FuncionarioMensalista();
        func1.setNome("Joao");
        FuncionarioMensalista func2 = new FuncionarioMensalista();
        func2.setNome("Pedro");
        Departamento departamento = new Departamento();
        departamento.alocar(func1);
        departamento.alocar(func2);
        assertFalse(departamento.verificarFuncionarioPeloNome("Ana"));
    }

    @Test
    void deveEncontrarFuncionario() {
        FuncionarioMensalista func1 = new FuncionarioMensalista();
        FuncionarioMensalista func2 = new FuncionarioMensalista();
        Departamento departamento = new Departamento();
        departamento.alocar(func1);
        departamento.alocar(func2);
        assertTrue(departamento.verificarFuncionario(func2));
    }

    @Test
    void naoDeveEncontrarFuncionario() {
        FuncionarioMensalista func1 = new FuncionarioMensalista();
        FuncionarioMensalista func2 = new FuncionarioMensalista();
        Departamento departamento = new Departamento();
        departamento.alocar(func1);
        assertFalse(departamento.verificarFuncionario(func2));
    }

    @Test
    void deveDesalocarFuncionario() {
        FuncionarioMensalista func1 = new FuncionarioMensalista();
        FuncionarioMensalista func2 = new FuncionarioMensalista();
        Departamento departamento = new Departamento();
        departamento.alocar(func1);
        departamento.alocar(func2);
        departamento.desalocar(func2);
        assertFalse(departamento.verificarFuncionario(func2));
    }

    @Test
    void deveRetornarListaFuncionarios() {
        FuncionarioMensalista func1 = new FuncionarioMensalista();
        FuncionarioMensalista func2 = new FuncionarioMensalista();
        Departamento departamento = new Departamento();
        departamento.alocar(func1);
        departamento.alocar(func2);
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        lista.add(func1);
        lista.add(func2);
        assertEquals(lista, departamento.getFuncionarios());
    }

    @Test
    void deveRetornarListaNomesFuncionarios() {
        FuncionarioMensalista func1 = new FuncionarioMensalista();
        func1.setNome("Joao");
        FuncionarioMensalista func2 = new FuncionarioMensalista();
        func2.setNome("Pedro");
        Departamento departamento = new Departamento();
        departamento.alocar(func1);
        departamento.alocar(func2);
        ArrayList<String> resposta = new ArrayList<String>();
        resposta.add("Joao");
        resposta.add("Pedro");
        assertEquals(resposta, departamento.obterNomesFuncionarios());
    }

    @Test
    void deveRetornarListaNomesFuncionariosOrdenados() {
        FuncionarioMensalista func1 = new FuncionarioMensalista();
        func1.setNome("Joao");
        FuncionarioMensalista func2 = new FuncionarioMensalista();
        func2.setNome("Pedro");
        Departamento departamento = new Departamento();
        departamento.alocar(func1);
        departamento.alocar(func2);
        ArrayList<String> resposta = new ArrayList<String>();
        resposta.add("Pedro");
        resposta.add("Joao");
        assertTrue(departamento.verificarListaFuncionarios(resposta));
    }

    @Test
    void deveRetornarListaNomesFuncionariosRepetidos() {
        FuncionarioMensalista func1 = new FuncionarioMensalista();
        func1.setNome("Joao");
        FuncionarioMensalista func2 = new FuncionarioMensalista();
        func2.setNome("Pedro");
        FuncionarioMensalista func3 = new FuncionarioMensalista();
        func3.setNome("Joao");
        Departamento departamento = new Departamento();
        departamento.alocar(func1);
        departamento.alocar(func2);
        departamento.alocar(func3);
        ArrayList<String> resposta = new ArrayList<String>();
        resposta.add("Pedro");
        resposta.add("Joao");
        assertFalse(departamento.verificarListaFuncionarios(resposta));
    }

    @Test
    void naoDeveAlocarFuncionarioRepetido() {
        FuncionarioMensalista func = new FuncionarioMensalista();
        Departamento departamento = new Departamento();
        departamento.alocarUnico(func);
        departamento.alocarUnico(func);
        assertEquals(1, departamento.getNumeroFuncionarios());
    }
}