package academy.devdojo.maratonajava.Streams.dominio;

import java.util.Objects;
import java.util.StringJoiner;

public class LightNovel {
    private String nome;
    private Double price;
    private Category category;

    public LightNovel(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }

    public LightNovel(String nome, Double price, Category category) {
        this.nome = nome;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", LightNovel.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("price=" + price)
                .add("category=" + category)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public String getNome() {
        return nome;
    }

    public Double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}
