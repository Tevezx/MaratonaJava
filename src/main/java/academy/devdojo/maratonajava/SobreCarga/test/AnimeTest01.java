package academy.devdojo.maratonajava.SobreCarga.test;

import academy.devdojo.maratonajava.SobreCarga.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", "TV", 130);
        anime.init("Naruto", "TV", 130, "Ação");
        anime.imprime();

    }
}
