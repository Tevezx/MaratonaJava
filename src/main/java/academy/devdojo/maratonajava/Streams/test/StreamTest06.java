package academy.devdojo.maratonajava.Streams.test;

import academy.devdojo.maratonajava.Streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest06 {
    private static final List<LightNovel> lightMovelList = new ArrayList<>(List.of(new LightNovel("Naruto", 1.0),
            new LightNovel("Boku No Hero", 1.0),
            new LightNovel("One Piece", 2.0),
            new LightNovel("One Piece", 2.0),
            new LightNovel("Attack On Titan", 3.0)));

    public static void main(String[] args) {
        // existe algum lightMovel com o preco maior que 3?
        // anymatch = faz uma busca e retorna um boolean
        System.out.println(lightMovelList.stream().anyMatch(ln -> ln.getPrice() > 2));

        // todos os lightmovel sao maiores do que zero?
        System.out.println(lightMovelList.stream().allMatch(ln -> ln.getPrice() > 0));

        // retorna true se nenhum dado for maior que zero
        System.out.println(lightMovelList.stream().noneMatch(ln -> ln.getPrice() > 0));

        // Pega o qualquer elemento da lista que tenha o preco maior que 1
        lightMovelList.stream()
                .filter(ln -> ln.getPrice() > 1)
                .findAny()
                .ifPresent(System.out::println);

        // Pega o primeiro elemento da lista que tenha o preco maior que 2
        lightMovelList.stream()
                .filter(ln -> ln.getPrice() > 2).
                min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
