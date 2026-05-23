package academy.devdojo.exercicios.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortEquals2 {
    public static void main(String[] args) {
        inteiros.add(10);
        inteiros.add(9);
        inteiros.add(8);
        inteiros.add(2);
        inteiros.add(1);
        inteiros.add(3);
        inteiros.add(101);

        System.out.println(maiorNumero());
        System.out.println(menorNumero());
        System.out.println(exibirMedia());

        // Listando por ordem crescente
        Collections.sort(inteiros);
        // inteiros.sort(Integer::compareTo);
        exibirLista();

        System.out.println("-".repeat(10));

        inteiros.sort(Collections.reverseOrder());
        // inteiros.sort((x1,x2) -> x2.compareTo(x1));
        exibirLista();
    }

    private static List<Integer> inteiros = new ArrayList<>();

    public static void exibirLista(){
        for (Integer inteiro : inteiros) {
            System.out.println(inteiro);
        }
    }

    public static Integer maiorNumero(){
        Integer maiorNumero = 0;

        for (Integer inteiro : inteiros) {
            if(inteiro >= maiorNumero){
                maiorNumero = inteiro;
            }
        }

        return maiorNumero;
    }

    public static Integer menorNumero(){
        Integer menorNumero = inteiros.getFirst();

        for (Integer inteiro : inteiros) {
            if(inteiro < menorNumero){
                menorNumero = inteiro;
            }
        }

        return menorNumero;
    }

    public static Double exibirMedia(){
        Integer soma = 0;

        for (Integer inteiro : inteiros) {
            soma += inteiro;
        }

        return (double) ((int) soma / inteiros.size());
    }

}
