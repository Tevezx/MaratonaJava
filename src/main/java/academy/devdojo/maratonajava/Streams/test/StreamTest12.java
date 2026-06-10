package academy.devdojo.maratonajava.Streams.test;

import academy.devdojo.maratonajava.Streams.dominio.Category;
import academy.devdojo.maratonajava.Streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightMovelList = new ArrayList<>(List.of(new LightNovel("Naruto", 1.0, Category.TRAMA),
            new LightNovel("Boku No Hero", 1.0, Category.FANTASY),
            new LightNovel("One Piece", 2.0, Category.FANTASY),
            new LightNovel("One Piece", 2.0, Category.FANTASY),
            new LightNovel("Attack On Titan", 3.0, Category.ROMANCE)));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        // retorna apenas true or false para categoria fantasy
        lightMovelList.stream().map(lightNovel -> lightNovel.getCategory().equals(Category.FANTASY)).forEach(System.out::println);

        // Agrupa por diferentes grupos de categorias
        Map<Category, List<LightNovel>> collect = lightMovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    } 
}
