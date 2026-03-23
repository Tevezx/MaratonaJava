package academy.devdojo.maratonajava.Heranca.Test;

import academy.devdojo.maratonajava.Heranca.Dominio.Endereco;
import academy.devdojo.maratonajava.Heranca.Dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Laranjeiras");
        endereco.setCep("1230-987");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos");
        pessoa.setCpf("1939870-98");
        pessoa.setEndereco(endereco);

        pessoa.imprimir();
    }
}
