package academy.devdojo.maratonajava.Colecoes.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Filme;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingTest01 {
    public static void main(String[] args) {
        List<String> filmes = new ArrayList<>(6);
        filmes.add("Interestelar");
        filmes.add("Carros");
        filmes.add("Como eu era antes de voce");
        filmes.add("Esposa de Mentirinha");

        // Organizando a lista de ordem alfabetica
        Collections.sort(filmes);

        for (String filme : filmes) {
            System.out.println("Filmes: " + filme);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(110.21);
        dinheiros.add(101.21);
        dinheiros.add(102.21);

        // numeros ordenados do menor ao maior
        Collections.sort(dinheiros);

        for (Double dinheiro : dinheiros) {
            System.out.println("Dinheiros: " + dinheiro);
        }
    }
}
