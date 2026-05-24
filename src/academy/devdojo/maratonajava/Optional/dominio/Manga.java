package academy.devdojo.maratonajava.Optional.dominio;

import java.util.Objects;
import java.util.StringJoiner;

public class Manga {
    private Integer id;
    private String titulo;
    private Integer capitulos;

    public Manga(Integer id, String titulo, Integer capitulos) {
        this.id = id;
        this.titulo = titulo;
        this.capitulos = capitulos;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Manga.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("titulo='" + titulo + "'")
                .add("capitulos=" + capitulos)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Integer capitulos) {
        this.capitulos = capitulos;
    }
}
