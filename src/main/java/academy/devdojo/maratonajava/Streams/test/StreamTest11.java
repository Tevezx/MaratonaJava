package academy.devdojo.maratonajava.Streams.test;

import academy.devdojo.maratonajava.Streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightMovelList = new ArrayList<>(List.of(new LightNovel("Naruto", 1.0),
            new LightNovel("Boku No Hero", 1.0),
            new LightNovel("One Piece", 2.0),
            new LightNovel("One Piece", 2.0),
            new LightNovel("Attack On Titan", 3.0)));

    public static void main(String[] args) {
        // Colectors -> summarizing

        System.out.println(lightMovelList.stream().count());
        // Mesma coisa, só que com collect
        System.out.println(lightMovelList.stream().collect(Collectors.counting()));

        System.out.println("-".repeat(10));

        // Pegando o maior valor
        lightMovelList.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightMovelList.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println("-".repeat(10));

        // Transformando em double e somando tudo de precos
        System.out.println(lightMovelList.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightMovelList.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        System.out.println("-".repeat(10));

        // Pegando a media de precos
        lightMovelList.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightMovelList.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        System.out.println("-".repeat(10));

        // Tudo o que estavamos imprindo antes, esta disponivel dentro desse summarizingDouble
        DoubleSummaryStatistics collect = lightMovelList.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        System.out.println("-".repeat(10));

        // Separo os titulos por uma virgula e espaço
        String collect1 = lightMovelList.stream().map(LightNovel::getNome).collect(Collectors.joining(", "));
        System.out.println(collect1);
    }
}
