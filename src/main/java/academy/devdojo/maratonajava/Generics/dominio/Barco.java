package academy.devdojo.maratonajava.Generics.dominio;

import java.util.StringJoiner;

public class Barco {
    private String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Barco.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
