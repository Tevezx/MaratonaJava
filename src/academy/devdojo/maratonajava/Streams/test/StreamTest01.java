package academy.devdojo.maratonajava.Streams.test;


import academy.devdojo.maratonajava.Streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 1 - Ordene todos os lightMovel por titulo
// 2 - Traga os tres primeiros lightMovel que sejam menor do que 4
public class StreamTest01 {
    private static List<LightNovel> lightMovelList = new ArrayList<>(List.of(new LightNovel("Naruto", 1.0),
            new LightNovel("Boku No Hero", 1.0),
            new LightNovel("One Piece", 2.0),
            new LightNovel("Attack On Titan", 3.0)));

    public static void main(String[] args) {
        // Comparator.comparing -> passo a classe e o que eu quero ordenar nela
        lightMovelList.sort(Comparator.comparing(LightNovel::getNome));

        // Pegando os tres primeiros titulos que custam menos que 4 reais
        List<String> titulos = new ArrayList<>();
        for (LightNovel lightNovel : lightMovelList) {
            if (lightNovel.getPrice() <= 4) {
                titulos.add(lightNovel.getNome());
            }

            if (titulos.size() >= 3) {
                break;
            }
        }

        System.out.println(lightMovelList);
        System.out.println(titulos);
    }
}
