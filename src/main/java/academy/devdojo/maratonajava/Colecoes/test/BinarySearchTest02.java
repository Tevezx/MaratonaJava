package academy.devdojo.maratonajava.Colecoes.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        FilmeByIdComparator filmeByIdComparator = new FilmeByIdComparator();
        List<Filme> filmes = new ArrayList<>(6);
        filmes.add(new Filme(2L, "Interestelar", 200.000));
        filmes.add(new Filme(1L, "Carros", 100.000));
        filmes.add(new Filme(4L, "Como eu era antes de voce", 60.000));
        filmes.add(new Filme(3L, "Esposa de Mentirinha", 50.000));

        // Collections.sort(filmes);
        // Ordenando pelo id
        filmes.sort(new FilmeByIdComparator());
        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        Filme search = new Filme(3L, "Esposa de Mentirinha", 50.000);
        // Esta na posicao 2 da minha lista ordenando pelo nome
        // Esta na posicao 2 da minha lista ordenando pelo id
        System.out.println(Collections.binarySearch(filmes, search, filmeByIdComparator));
    }
}
