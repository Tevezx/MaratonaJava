package academy.devdojo.maratonajava.Serialization.dominio;

import java.io.Serializable;
import java.util.StringJoiner;

public class Turma {
    private String nome;

    @Override
    public String toString() {
        return new StringJoiner(", ", Turma.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .toString();
    }

    public Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
