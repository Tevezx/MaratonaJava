package academy.devdojo.maratonajava.Lambdas.test;

import academy.devdojo.maratonajava.Lambdas.dominio.Anime;
import academy.devdojo.maratonajava.Lambdas.service.AnimeComparatorts;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesTest02 {
    // Method References not static
    public static void main(String[] args) {
        // Criando objeto para poder chamar metodo nao static
        AnimeComparatorts animeComparatorts = new AnimeComparatorts();
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Naruto", 500),
                new Anime("Bersek", 60),
                new Anime("One Piece", 900)));

        // Chamando metodo nao static
        anime.sort(animeComparatorts::compareByEpisodiosNotStatic);
        System.out.println(anime);
    }
}
