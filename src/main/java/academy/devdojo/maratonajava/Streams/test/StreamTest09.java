package academy.devdojo.maratonajava.Streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        // Gerando Streams apartir do atributo
        // Filtrando de 1 a 50 somente numeros pares
        IntStream.rangeClosed(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n +" "));

        Stream.of("Carlos", " Tevez", " Rosseto", " Soares")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        int[] num = {1,2,3,4,5};
        // Retorna um int Stream
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
                lines.filter(ln -> ln.contains("Java")).forEach(System.out::println);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
