package academy.devdojo.maratonajava.Streams.test;

import academy.devdojo.maratonajava.Streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static final List<LightNovel> lightMovelList = new ArrayList<>(List.of(new LightNovel("Naruto", 1.0),
            new LightNovel("Boku No Hero", 1.0),
            new LightNovel("One Piece", 2.0),
            new LightNovel("One Piece", 2.0),
            new LightNovel("Attack On Titan", 3.0)));

    public static void main(String[] args) {

        // Soma de todos os lightmovel acima de 1
        lightMovelList.stream()
                // .map extraio os atributos de uma classe e retorno algo em stream
                .map(LightNovel::getPrice)
                .filter(price -> price > 1)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        // stream percorre a lista
        // mpToDouble transforma cada item em um Double
        // filter mantem apenas itens daquela lista > 2
        // sum soma tudo
        double sum = lightMovelList.stream()
                // mapToDouble serve para retornar um double
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 2)
                .sum();

        System.out.println(sum);
    }
}
