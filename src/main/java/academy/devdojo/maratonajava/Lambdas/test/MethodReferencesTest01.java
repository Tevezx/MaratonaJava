package academy.devdojo.maratonajava.Lambdas.test;

import academy.devdojo.maratonajava.Lambdas.dominio.Anime;
import academy.devdojo.maratonajava.Lambdas.service.AnimeComparatorts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReferencesTest01 {
    // Method references static
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Naruto", 500),
                new Anime("Bersek", 60),
                new Anime("One Piece", 900)));

        // Estou usando o comparable onde ele pede como parametro dois tipos diferentes para poder comparar
        // anime.sort(anime, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
        // System.out.println(anime);

        // Funcionando da mesma forma, utilizando esse service de compareByTittle da minha classe AnimeCompartors
        // anime.sort(anime, (a1, a2) -> AnimeComparatorts.compareByTittle(a1, a2));

        // Dessa forma eu utilizo o methodReferences, onde passo a classe e depois o metodo que desejo nela
        anime.sort(AnimeComparatorts::compareByTittle);
        System.out.println(anime);

        // Exibindo do menor episodios ao maior
        anime.sort(AnimeComparatorts::compareByEpisodios);
        System.out.println(anime);
    }
}
