package academy.devdojo.maratonajava.Colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        // Retorna o indice que estamos procurando
        // Se nao encontrar, retorna (-(ponto de insercao) - 1)

        // A lista precisa ser ordenada
        // index 0, 1, 2, 3
        // value 0, 2, 3, 4

        // Tem que ordenar a lista para saber a ordem correta dos numeros
        Collections.sort(numeros);

        // Busca a posicao onde o indice esta ou deveria estar
        System.out.println(Collections.binarySearch(numeros, 0));
        System.out.println(Collections.binarySearch(numeros, -1));
    }
}
