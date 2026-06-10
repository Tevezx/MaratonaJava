package academy.devdojo.maratonajava.Streams.test;

import academy.devdojo.maratonajava.Streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightMovelList = new ArrayList<>(List.of(new LightNovel("Naruto", 1.0),
            new LightNovel("Boku No Hero", 1.0),
            new LightNovel("One Piece", 2.0),
            new LightNovel("Attack On Titan", 3.0)));


    public static void main(String[] args) {
        // Stream é uma sequencia de elementos no tempo
        // Collection é um elemento no espaco

        // Ação Intermediaria = retorna um proprio stream
        // Operacao final = fecha a stream, retornando algo final

        // Sorted () -> ordena
        List<String> titulos = lightMovelList.stream()
                .sorted(Comparator.comparing(LightNovel::getNome))
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getNome)
                .collect(Collectors.toList());

        System.out.println(titulos);
    }
}
