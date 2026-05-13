package academy.devdojo.maratonajava.Colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // Transformando de lista para array
        // Posso passar numeros.size() no tamanho, mas perco performance
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("-".repeat(10));

        // Transformando de array para lista
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0, 12);
        // Nao posso fazer adições atraves do arraysToList
        // arrayToList.add(19);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("-".repeat(10));

        // Dessa forma eu consigo adicionar
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        System.out.println("-".repeat(10));

        List<String> listString = Arrays.asList("1", "2", "3");
        System.out.println(listString);
    }
}
