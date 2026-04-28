package academy.devdojo.maratonajava.Dates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        // Zonas são fuso horario (zona de brasil)

        // Map é uma coleção de chave e valor
        // Exibindo todas as zonas que existem
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        System.out.println("-".repeat(10));

        // Minha Zona atual
        System.out.println(ZoneId.systemDefault());

        System.out.println("-".repeat(10));

        // Zona de tokyo
        ZoneId tokyioZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyioZone);

        System.out.println("-".repeat(10));

        // Definindo horario atual
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println("-".repeat(10));

        // Pegando a data e horario de uma zona
        // Aparece + 9 horas, que é a quantidade de horas que eu preciso adicionar para estar certo ao fuso horario
        ZonedDateTime zonedDateTime = now.atZone(tokyioZone);
        System.out.println(zonedDateTime);

        System.out.println("-".repeat(10));

        // Pegando o instant atual
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        System.out.println("-".repeat(10));

        // Exatamente qual é o horario de tokyo atual
        ZonedDateTime zonedDateTimeInstant = nowInstant.atZone(tokyioZone);
        System.out.println(zonedDateTimeInstant);

        System.out.println("-".repeat(10));

        // Pegando as zonas maximas e minimas
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        System.out.println("-".repeat(10));

        // Pegando a zona de Manaus
        // Manaus é 1 hora mais cedo de Brasilia
        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-01:00");
        OffsetDateTime offsetDateTime = now.atOffset(zoneOffsetManaus);
        // Mesma coisa, porem com sintaxe diferente
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, zoneOffsetManaus);
        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime2);

        System.out.println("-".repeat(10));

        ZoneOffset zoneOffsetJerusalem = ZoneOffset.of("+03:00");
        OffsetDateTime offsetDateTime1 = nowInstant.atOffset(zoneOffsetJerusalem);
        System.out.println(offsetDateTime1);

        System.out.println("-".repeat(10));

        // Calendario Japones
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
    }
}
