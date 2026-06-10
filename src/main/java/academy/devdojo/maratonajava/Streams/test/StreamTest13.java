package academy.devdojo.maratonajava.Streams.test;

import academy.devdojo.maratonajava.Streams.dominio.Category;
import academy.devdojo.maratonajava.Streams.dominio.LightNovel;
import academy.devdojo.maratonajava.Streams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightMovelList = new ArrayList<>(List.of(new LightNovel("Naruto", 1.0, Category.TRAMA),
            new LightNovel("Boku No Hero", 1.0, Category.FANTASY),
            new LightNovel("One Piece", 2.0, Category.FANTASY),
            new LightNovel("One Piece", 2.0, Category.FANTASY),
            new LightNovel("Attack On Titan", 10.0, Category.ROMANCE)));

    public static void main(String[] args) {
        // GROUPING BY por promocoes
        Map<Promotion, List<LightNovel>> collect = lightMovelList.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                ));
        System.out.println(collect);

        System.out.println("-".repeat(10));

        // Agrupando dentro de agrupamentos
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightMovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                )));
        System.out.println(collect1);
    }
}
