package academy.devdojo.maratonajava.ClassesInternas.test;

import academy.devdojo.maratonajava.Generics.dominio.Barco;

import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcos = new java.util.ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        // Classe anônima referenciando uma interface
        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(barcos);
    }
}
