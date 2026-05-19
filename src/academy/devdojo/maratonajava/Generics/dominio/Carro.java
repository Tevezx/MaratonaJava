package academy.devdojo.maratonajava.Generics.dominio;

import java.util.StringJoiner;

public class Carro {
    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Carro.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .toString();
    }
}
