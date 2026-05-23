package academy.devdojo.maratonajava.Lambdas.test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest01 {
    // Lambda Consumer
    // Interface Funcional
    public static void main(String[] args) {
        List<String> nomes = List.of("Carlos", "Ana", "Andrea", "Carlos");
        imprimirLista(nomes, (String s) -> System.out.println(s));

        System.out.println("-".repeat(10));

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        imprimirLista(numeros, num -> System.out.println(num));
    }

    // <T> -> Tipo
//    Consumer<T>: Recebe um objeto e retorna void (nada).
//    O metodo abstrato dele chama-se accept. Ele serve para executar uma ação (imprimir, salvar, enviar)
    private static <T> void imprimirLista(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
