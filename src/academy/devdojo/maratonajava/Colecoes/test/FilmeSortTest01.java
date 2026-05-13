package academy.devdojo.maratonajava.Colecoes.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FilmeByIdComparator implements Comparator<Filme>{
    @Override
    public int compare(Filme filme1, Filme filme2) {
        return filme1.getId().compareTo(filme2.getId());
    }
}

public class FilmeSortTest01 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>(6);
        filmes.add(new Filme(2L, "Interestelar", 200.000));
        filmes.add(new Filme(1L, "Carros", 100.000));
        filmes.add(new Filme(4L, "Como eu era antes de voce", 60.000));
        filmes.add(new Filme(3L, "Esposa de Mentirinha", 50.000));

        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        System.out.println("-".repeat(10));

        // Ordenando pelo nome
        // Modificamos o compareTo na classe filme
        Collections.sort(filmes);
        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        System.out.println("-".repeat(10));

        // Ordenando pelo id
        // Collections.sort(filmes, new FilmeByIdComparator());
        filmes.sort(new FilmeByIdComparator());
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }
}
