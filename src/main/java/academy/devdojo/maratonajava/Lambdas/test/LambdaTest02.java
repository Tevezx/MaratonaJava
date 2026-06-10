package academy.devdojo.maratonajava.Lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        // Function tem o tipo t e tipo r (os tipos podem ser qualquer coisa)

        List<String> nomes = List.of("Carlos", "Ana", "Andrea", "Carlos");

        // A lista é de string, porem o meu retorno dela é integer
        List<Integer> map = map(nomes, (String s) -> s.length());
        // O tipo pode ser o mesmo também
        List<String> map1 = map(nomes, s -> s.toUpperCase());
        System.out.println(map);
        System.out.println(map1);
    }

    //<T, R> -> Tipo e Retorno
    // Vou retornar o retorno -> R
    // Qualquer coisa que tem um certo tipo e retorna algo diferente é chamado de map
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> resultado = new ArrayList<>();

        for (T t : list) {
            R r = function.apply(t);
            resultado.add(r);
        }

        return resultado;
    }
}
