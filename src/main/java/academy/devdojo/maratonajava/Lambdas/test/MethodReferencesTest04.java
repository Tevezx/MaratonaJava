package academy.devdojo.maratonajava.Lambdas.test;

import academy.devdojo.maratonajava.Lambdas.dominio.Anime;
import academy.devdojo.maratonajava.Lambdas.service.AnimeComparatorts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferencesTest04 {
    // Referencia a um construtor
    public static void main(String[] args) {
        // Criando o supplier
        // Preciso de um construtor sem parametros na classe que faz referencia <>
        Supplier<AnimeComparatorts> animeComparatortsSupplier = AnimeComparatorts::new;

        // Somente aqui eu crio o objeto, pq aqui estou pegando ele
        AnimeComparatorts animeComparatorts = animeComparatortsSupplier.get();
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Naruto", 500),
                new Anime("Bersek", 60),
                new Anime("One Piece", 900)));


        anime.sort(animeComparatorts::compareByEpisodiosNotStatic);
        System.out.println(anime);

        // Passo String (nome), Integer (episodios) e o que eu quero retornar
        // BiFunction<String, Integer, Anime> animeBiFunction = (s,i) -> new Anime(s, i);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Attack On Tittan", 120));
    }
}
