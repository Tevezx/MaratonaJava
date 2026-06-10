package academy.devdojo.maratonajava.Lambdas.dominio;

import java.util.StringJoiner;

public class Anime {
    private String nome;
    private Integer episodios;

    public Anime(String nome, Integer episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Anime.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("quantidade=" + episodios)
                .toString();
    }

    public String getNome() {
        return nome;
    }

    public Integer getEpisodios() {
        return episodios;
    }
}
