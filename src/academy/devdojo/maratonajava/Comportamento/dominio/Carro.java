package academy.devdojo.maratonajava.Comportamento.dominio;

import java.util.StringJoiner;

public class Carro {
    private String nome = "Audi";
    private String color;
    private Integer year;

    public Carro(String color, Integer year) {
        this.nome = getNome();
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Carro.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("color='" + color + "'")
                .add("year=" + year)
                .toString();
    }

    public String getNome() {
        return nome;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }
}
