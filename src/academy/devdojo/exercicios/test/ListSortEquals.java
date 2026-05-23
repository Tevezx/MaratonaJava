package academy.devdojo.exercicios.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortEquals {
    public static void main(String[] args) {
        cadastrarNomes("Carlos");
        cadastrarNomes("Ana");
        cadastrarNomes("Felipe");
        cadastrarNomes("Andrea");
        cadastrarNomes("Carlos Roberto");
        cadastrarNomes("Carlos Roberto");

        System.out.println("-".repeat(10));

        imprimirLista();

        System.out.println("-".repeat(10));

        // Ordenando em ordem alfabetica
        Collections.sort(nomes);
        imprimirLista();

        System.out.println("-".repeat(10));

        if (nomes.contains("Ana")) {
            System.out.println("Ana existe na lista!");
        } else {
            throw new IllegalArgumentException("Ana não existe na lista!");
        }

    }

    public static List<String> nomes = new ArrayList<>();

    public static void cadastrarNomes(String nome) {
        if (!nomes.contains(nome)) {
            nomes.add(nome);
            System.out.println(nome + ", adicionado com sucesso!");
        }
    }

    public static void imprimirLista() {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
