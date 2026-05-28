package academy.devdojo.maratonajava.Streams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        // Somando todos os numeros da lista

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        // Faz a mesma coisa, porem com method reference Integer::sum
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println("-".repeat(10));

        // Multiplicando todos os valores
        integers.stream()
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);

        // retornando o valor maximo da lista
        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::max).ifPresent(System.out::println);
    }
}
