package academy.devdojo.maratonajava.Junit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MangaTest {
    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUp() {
        manga1 = new Manga("Naruto", 700);
        manga2 = new Manga("Naruto", 700);
    }

    @Test
    public void acessors_ReturnData_WhenInitialized(){
        Assertions.assertEquals("Naruto", manga1.name());
        Assertions.assertEquals(700, manga1.episodies());
    }

    // Retorna true se os mangas forem iguais
    @Test
    public void acessors_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1, manga2);
    }

    @Test
    public void hascode_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1.hashCode(), manga2.hashCode());
    }

    // Retornando e exception se o name do manga for null
    @Test
    public void constructor_ReturnNullPointerException_WhenNameIsNull(){
        Assertions.assertThrows(NullPointerException.class, () -> new Manga(null, 100));
    }

    // Verificando se a classe é record
    @Test
    public void isRecord_ReturnTrue_WhenCalledFromManga(){
        Assertions.assertTrue(Manga.class.isRecord());
    }
}