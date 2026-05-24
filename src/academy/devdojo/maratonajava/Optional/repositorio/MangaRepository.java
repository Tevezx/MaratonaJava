package academy.devdojo.maratonajava.Optional.repositorio;

import academy.devdojo.maratonajava.Optional.dominio.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {

    // 1 - Dado um repositorio: procure manga por titulo e se o titulo existir apenas atualize o titulo do manga
    // 2 - procure o manga pelo id, caso o manga nao exista lance um ilegalArgumenteExecption
    // 3 - procure por titulo, caso nao exista crie um novo manga

    private static List<Manga> mangas = List.of(new Manga(1, "Naruto", 500),
            new Manga(2, "Bersek", 200),
            new Manga(3, "One Piece", 1000));

    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;

        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }

        return Optional.ofNullable(found);
    }

    public static Optional<Manga> findByTitulo(String titulo) {
        return findBy(m -> m.getTitulo().equals(titulo));
    }

    public static Optional<Manga> findById(Integer id) {
        return findBy(m -> m.getId().equals(id));
    }
}
