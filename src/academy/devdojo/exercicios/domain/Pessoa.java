package academy.devdojo.exercicios.domain;

import java.util.StringJoiner;

public class Pessoa {
    private final String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pessoa.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .toString();
    }

    public String getNome() {
        return nome;
    }
}
