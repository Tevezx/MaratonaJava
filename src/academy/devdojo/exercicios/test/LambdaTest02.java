package academy.devdojo.exercicios.test;

import academy.devdojo.exercicios.domain.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LambdaTest02 {
    public static void main(String[] args) {
        // exercicio 1
        List<String> nomes = List.of("ana", "bruno", "carla", "daniel");
        nomes.forEach(nome -> System.out.println(nome.toUpperCase()));
        System.out.println("-".repeat(10));
        nomes.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("-".repeat(10));

        //exercicio 2
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list = numeros.stream()
                .filter(n -> n % 2 == 0) // filtra pares
                .map(n -> n * 2) // multiplica por 2 os filtrados
                .toList(); // transforma em lista
        System.out.println(list);

        System.out.println("-".repeat(10));

        // exercicio 3
        List<String> palavras = List.of("Carlos", "Tevez", "Rosseto", "Soares");
        long count = palavras.stream()
                .filter(palavra -> palavra.length() > 5)
                .count();
        System.out.println(count);

        System.out.println("-".repeat(10));

        List<String> nomes2 = List.of("joao", "maria", "pedro");
        nomes2.forEach(System.out::println);

        System.out.println("-".repeat(10));

        Pessoa pessoa = new Pessoa("Carlos");
        Pessoa pessoa2 = new Pessoa("Andrea");
        Pessoa pessoa3 = new Pessoa("Ana");
        Pessoa pessoa4 = new Pessoa("Roberto");
        List<Pessoa> pessoas = List.of(pessoa, pessoa2, pessoa3, pessoa4);

        List<Pessoa> ordenada = pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getNome)) // .sorted ordena a lista sem modificar a original
                .toList();
        ordenada.forEach(System.out::println);

        System.out.println("-".repeat(10));

        Optional<String> optional = buscarNomePorId(10);
        System.out.println(optional);
    }

    public static Optional<String> buscarNomePorId(int id) {
        if (id == 1) return Optional.of("Carlos");
        if (id == 2) return Optional.of("Ana");

        return Optional.empty();
    }
}
