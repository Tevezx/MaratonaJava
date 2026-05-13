package academy.devdojo.maratonajava.Colecoes.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Filme;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Filme> filmes = new HashSet<>();
        filmes.add(new Filme(2L, "Interestelar", 200.000, 0));
        filmes.add(new Filme(1L, "Carros", 100.000, 5));
        filmes.add(new Filme(4L, "Como eu era antes de voce", 60.000, 0));
        filmes.add(new Filme(3L, "Esposa de Mentirinha", 50.000, 2));
        filmes.add(new Filme(3L, "Esposa de Mentirinha", 50.000, 2));

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }
}
