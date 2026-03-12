package academy.devdojo.maratonajava.classes.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public Integer ano;

    public void Imprime() {
        String mensagem = """
                Nome: %s
                Modelo: %s
                Ano: %d
                """;
        System.out.println(mensagem.formatted(nome, modelo, ano));
    }

}
