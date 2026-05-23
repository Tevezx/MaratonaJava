package academy.devdojo.maratonajava.Lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferencesTest03 {
    // Method References -> utiliza o metodo nao static mas passo
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Carlos", "Ana", "Andrea", "Carlos Roberto"));
        // O metodo compareTo nao é static, mas conseguimos chamar ele apartir da classe String
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        // Transformando uma string em um integer
        // Function vai esperar uma String para retornar um integer
        // Integer::parseInt -> pega o valor da String e transforma em Int
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        // Verificar se o meu nome esta dentro da lista
        // ele espera receber uma lista de strings e um nome
        // ele retorna um contains
        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(nomes, "Carlos"));

    }
}
