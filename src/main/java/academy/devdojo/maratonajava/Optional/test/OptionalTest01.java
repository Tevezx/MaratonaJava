package academy.devdojo.maratonajava.Optional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    // Tentar evitar o null pointer execption
    // Ao inves de retornar null, eu retorno um optional
    public static void main(String[] args) {
        // O tipo é o que eu estou retornando do metodo
        Optional<String> optional1 = Optional.of("Carlos Tevez");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();

        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);

        // Se eu tiver ele traz o optional
        // Utilizo o metodo para buscar na minha classe optional
        Optional<String> nameOptional = findName("Carlos");

        // Se eu nao tiver eu posso criar uma mensagem
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);

        // Se ele estiver presente
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("Carlos", "Andrea", "Ana", "Carlos Roberto");
        int i = list.indexOf(name);

        if(i > -1){
            return Optional.of(list.get(i));
        }

        return Optional.empty();
    }
}
