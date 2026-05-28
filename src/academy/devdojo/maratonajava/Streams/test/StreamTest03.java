package academy.devdojo.maratonajava.Streams.test;

import academy.devdojo.maratonajava.Streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightMovelList = new ArrayList<>(List.of(new LightNovel("Naruto", 1.0),
            new LightNovel("Boku No Hero", 1.0),
            new LightNovel("One Piece", 2.0),
            new LightNovel("One Piece", 2.0),
            new LightNovel("Attack On Titan", 3.0)));


    public static void main(String[] args) {
        // Fazem a mesma coisa, porem com stream voce esta desperdicando armazenamento
        // lightMovelList.forEach(System.out::println);

        Stream<LightNovel> lightNovelStream = lightMovelList.stream();
        lightMovelList.forEach(System.out::println);

        // Exibindo quantos elementos tem na lista, aqui estou utilizando o lighmovelStream que nao pode ser utilizado mais de uma vez
        long count = lightNovelStream
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count();
        System.out.println(count);

        // Não posso trabalhar duas vezes com a mesma stream, por isso aqui eu utilizo a list
        // distinct pega quantos elementos tem na lista sendo diferentes, nao conta elementos iguais
        long count1 = lightMovelList.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(count1);
    }
}
