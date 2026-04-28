package academy.devdojo.maratonajava.Dates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        // Trabalha com nanosegundos (pega desde 1970)
        Instant instant = Instant.now();
        System.out.println(instant); // T (tempo) Z(zulu time (lugar neutro no mundo, pego esse horario - horario da onde estou e irei saber qual o meu fuso horario))

        System.out.println(LocalDateTime.now()); // com fuso horario

        System.out.println(instant.getEpochSecond()); // retorna um long
        System.out.println(instant.getNano()); // retorna o nanosegundo de um segundo

        System.out.println(Instant.ofEpochSecond(3, 0)); // 3 segundos exatos
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000)); // avancou um segundo
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000)); // voltou um segundo
    }
}
