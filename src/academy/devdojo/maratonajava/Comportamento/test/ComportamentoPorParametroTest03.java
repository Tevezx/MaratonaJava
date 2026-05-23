package academy.devdojo.maratonajava.Comportamento.test;

import academy.devdojo.maratonajava.Comportamento.dominio.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    public static List<Carro> carroList = List.of(
            new Carro("Green", 2011),
            new Carro("Black", 1998),
            new Carro("Red", 2019)
    );

    public static void main(String[] args) {
        List<Carro> green = filter(carroList, carro -> carro.getColor().equals("Green"));
        List<Carro> year = filter(carroList, carro -> carro.getYear() < 2012);
        System.out.println(green);
        System.out.println(year);

        System.out.println("-".repeat(10));

        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> filter = filter(numeros, num -> num % 2 == 0);
        System.out.println(filter);
    }

//    Predicate<T>: Recebe um objeto e retorna um boolean.
//    O método abstrato dele chama-se test. Ele serve para responder uma pergunta (Sim/Não).
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filterList = new ArrayList<>();

        for (T t : list) {
            if (predicate.test(t)) {
                filterList.add(t);
            }
        }

        return filterList;
    }


}
