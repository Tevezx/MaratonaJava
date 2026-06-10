package academy.devdojo.maratonajava.Metodos.test;

import academy.devdojo.maratonajava.Metodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Carlos");
        pessoa.setIdade(19);

        // pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
