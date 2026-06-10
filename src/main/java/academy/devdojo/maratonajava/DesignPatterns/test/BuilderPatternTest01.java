package academy.devdojo.maratonajava.DesignPatterns.test;

import academy.devdojo.maratonajava.DesignPatterns.dominio.Pessoa;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        //Muitos argumentos em um construtor acaba confundindo o desenvolvedor
        // Por isso utilizamos o builder, que seria uma classe interna onde dentro dela fazemos metodos para pegar os atributos
        // Assim, ao chamar ela, conseguimos colocar "." e setar os atributos em especifico
        Pessoa build = Pessoa.PessoaBuilder
                .builder()
                .firstName("Carlos")
                .lastName("Soares")
                .userName("Tevez")
                .email("carlos@gmail.com")
                .build();// .build cria uma nova pessoa
        System.out.println(build);
    }
}
