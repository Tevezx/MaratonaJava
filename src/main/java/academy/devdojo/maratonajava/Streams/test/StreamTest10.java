package academy.devdojo.maratonajava.Streams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        // gerando stream infinitas

        // comeca pelo 1, acrescenta 2 em 2 até 10
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("-".repeat(10));

        // Em fribonacci
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);

        System.out.println("-");

        // Gerando numeros aleatorios com generate
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Stream.generate(() -> current.nextInt(1, 500))
                .limit(90)
                .forEach(System.out::println);

    }
}
