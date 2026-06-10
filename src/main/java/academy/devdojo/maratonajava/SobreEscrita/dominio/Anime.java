package academy.devdojo.maratonajava.SobreEscrita.dominio;

public class Anime {
    private String nome;

    // Assinatura
    // SobreEscrita do metodo toString
    // alt + insert = toString
    // Funciona como o metodo imprime
    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
