package academy.devdojo.maratonajava.Optional.test;

import academy.devdojo.maratonajava.Optional.dominio.Manga;

import java.util.Optional;

import static academy.devdojo.maratonajava.Optional.repositorio.MangaRepository.findById;
import static academy.devdojo.maratonajava.Optional.repositorio.MangaRepository.findByTitulo;

public class OptionalTest02 {
    public static void main(String[] args) {
        // 1 -
        Optional<Manga> findByTitulo = findByTitulo("Naruto");
        findByTitulo.ifPresent(m -> m.setTitulo("Naruto 2"));
        System.out.println(findByTitulo);

        // 2 -
        Manga findById = findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(findById);

        // 3 -
        Manga manga = findByTitulo("Boku No Hero").orElse(new Manga(4, "Boku No Hero", 400));
        System.out.println(manga);
    }
}
