package academy.devdojo.maratonajava.Colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//        List nomes = new ArrayList(); // versao 1.4 java
//        nomes.add("Carlos");
//        nomes.add(123);
//
//        for (Object nome : nomes) {
//            System.out.println("Nomes: " + nome);
//        }

        List<String> nomes = new ArrayList<>(16); // Agora ele limita com Strings atraves do generics, da para colocar a capacidade inicial da lista, por padrao é 16
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Carlos");
        nomes.add("Paulo");
        nomes.remove("Paulo"); // ou nomes.remove(1);

        nomes2.add("William");
        nomes2.add("Jadson");
        // Adicionando todos os nomes2 nos nomes
        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println("Nomes: " + nome);
        }

        // Adicionando nome após a primeira exibicao
        nomes.add("Ana");

        System.out.println("-".repeat(10));

        // For tradicional
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nomes: " + nomes.get(i));
        }

        System.out.println("-".repeat(10));

        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            nomes.add("Junior");
            System.out.println("Nomes: " + nomes.get(i));
        }

        System.out.println(nomes);
    }
}
