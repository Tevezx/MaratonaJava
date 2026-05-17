package academy.devdojo.maratonajava.Colecoes.dominio;

import java.util.Objects;
import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private Long id;
    private String nome;

    public Consumidor(String nome) {
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Consumidor.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nome='" + nome + "'")
                .toString();
    }

    // Dois consumidores são iguais quando o id deles forem
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
