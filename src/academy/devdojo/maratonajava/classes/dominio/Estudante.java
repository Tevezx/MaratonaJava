package academy.devdojo.maratonajava.classes.dominio;

public class Estudante {
    public String nome;
    public Integer idade;
    public char sexo;

    public void Imprime(){
        System.out.println("-".repeat(10));
        String mensagem = """
                Nome: %s
                Idade: %d
                Sexo: %c
                """;
        System.out.println(mensagem.formatted(nome, idade, sexo));
    }
}
