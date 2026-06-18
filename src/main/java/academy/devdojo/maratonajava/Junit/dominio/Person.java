package academy.devdojo.maratonajava.Junit.dominio;

import lombok.Builder;
import lombok.Data;

// Nao tem muito motivo para testar essa classe por so possuir get e set
@Data
@Builder
public class Person {
    private int age;
}
