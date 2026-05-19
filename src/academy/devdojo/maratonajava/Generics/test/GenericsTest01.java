package academy.devdojo.maratonajava.Generics.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Ate a versao 1.4 era dessa forma
//        List lista = new ArrayList<>();
//        lista.add(123);
//        lista.add("Carlos");
//        lista.add(new Filme(1234L, "Carlos", 120.9));
//
//        // Nao da para saber qual parametro passar, devido a falta de tipo da lista
//        for (Object object : lista) {
//            System.out.println(object);
//        }

        // Generics = em tempo de compilação
        // Type erasure, ele apaga o tipo depois que o codigo é compilado
        List<String> lista = new ArrayList<>();
        lista.add("Carlos");
        lista.add("Ana");

        for (String s : lista) {
            System.out.println(s);
        }

        add(lista, new Filme(123L, "Carlos", 120.0));

        // Nao consigo imprimir, pois estou passando string no <>
        for (String s : lista) {
            System.out.println(s);
        }
    }

    // Sem o tipo, ira dar ruim
    private static void add(List lista, Filme filme) {
        lista.add(filme);
    }
}
