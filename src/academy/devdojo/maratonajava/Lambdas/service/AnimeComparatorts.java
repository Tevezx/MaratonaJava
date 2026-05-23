package academy.devdojo.maratonajava.Lambdas.service;

import academy.devdojo.maratonajava.Lambdas.dominio.Anime;

public class AnimeComparatorts {
    public static Integer compareByTittle(Anime a1, Anime a2){
        return a1.getNome().compareTo(a2.getNome());
    }

    public static Integer compareByEpisodios(Anime a1, Anime a2){
        return a1.getEpisodios().compareTo(a2.getEpisodios());
    }

     public Integer compareByEpisodiosNotStatic(Anime a1, Anime a2){
        return a1.getEpisodios().compareTo(a2.getEpisodios());
     }
}
