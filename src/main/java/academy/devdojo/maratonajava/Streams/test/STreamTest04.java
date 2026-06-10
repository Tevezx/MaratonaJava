package academy.devdojo.maratonajava.Streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class STreamTest04 {
    // FlatMap -> utilizado quando temos propriedas aninhadas (uma dentro da outra)
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Carlos Roberto", "Ana Vitória");
        List<String> developers = List.of("Carlos Tevez");
        List<String> students = List.of("Gustavo Lima", "Eric", "Gustavo Mendes", "Guilherme");

        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("-".repeat(10));

        // flatMap vai mais pra dentro da lista e retira aqueles argumentos
        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
