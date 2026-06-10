package academy.devdojo.maratonajava.Construtores.test;

import academy.devdojo.maratonajava.Construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 200, "Ação", "OiOI");
        Anime anime02 = new Anime();

        anime.imprime();
        anime02.imprime();
    }
}
