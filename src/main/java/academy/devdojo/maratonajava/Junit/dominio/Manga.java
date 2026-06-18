package academy.devdojo.maratonajava.Junit.dominio;

import java.util.Objects;

// Record class -> classe imultavel, os atributos tem apenas getters, tem equals, hashcode e toString
// Os atributos ficam no ()
public record Manga(String name, int episodies) {

    // Consigo fazer um construtor para validar se o name é null
    public Manga {
        // Isso linka no test
        Objects.requireNonNull(name);
    }
}
