package academy.devdojo.maratonajava.Streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> nome = List.of("Carlos", "Tevez", "Rosseto", "Soares");
        //metodo convencional para iterar letra a letra do primeiro item
        String[] split = nome.get(0).split("");
        System.out.println(Arrays.toString(split));

        List<String[]> collect = nome.stream().map(n -> n.split("")).toList();
        // separando apenas o primeiro item da lista
        System.out.println(collect);

        // separando toda a lista
        List<String> stringStream = nome.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(stringStream);
    }
}
