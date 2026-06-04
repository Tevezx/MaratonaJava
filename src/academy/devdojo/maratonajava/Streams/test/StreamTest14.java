package academy.devdojo.maratonajava.Streams.test;

import academy.devdojo.maratonajava.Streams.dominio.Category;
import academy.devdojo.maratonajava.Streams.dominio.LightNovel;
import academy.devdojo.maratonajava.Streams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightMovelList = new ArrayList<>(List.of(new LightNovel("Naruto", 1.0, Category.TRAMA),
            new LightNovel("Boku No Hero", 1.0, Category.FANTASY),
            new LightNovel("One Piece", 2.0, Category.FANTASY),
            new LightNovel("One Piece", 2.0, Category.FANTASY),
            new LightNovel("Attack On Titan", 10.0, Category.ROMANCE)));

    public static void main(String[] args) {
        // Contando quanto de cada categoria existe
        Map<Category, Long> collect = lightMovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        // Coleto os dados, porem vem com optional
        Map<Category, Optional<LightNovel>> collect1 = lightMovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        // Tirando o optional com "Coletando e entao" (collectingAndThen)
        Map<Category, LightNovel> collect2 = lightMovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);
    }
}
