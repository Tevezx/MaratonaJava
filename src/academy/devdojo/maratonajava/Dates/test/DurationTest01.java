package academy.devdojo.maratonajava.Dates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timenow = LocalTime.now();
        LocalTime timeMinusServerHours = LocalTime.now().plusHours(7);

        // Quanto tempo passou, de agora até tanto
        // Não aceita LocalDate
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timenow, timeMinusServerHours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().minusSeconds(2000));

        //Representacao de 20 dias em horas
        Duration d4 = Duration.ofDays(20);

        System.out.println(d1); // P = Periodo, T = Tempo, H = horas, S = Segundos
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }
}
