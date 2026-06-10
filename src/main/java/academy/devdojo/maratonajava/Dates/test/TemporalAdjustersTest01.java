package academy.devdojo.maratonajava.Dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        // Trocando dia do mes
        now = now.withDayOfMonth(4);
        // ou
        now = now.with(ChronoField.DAY_OF_MONTH, 24);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());



        // Retorna o proximo dia da semana que será segunda
        System.out.println("-".repeat(10));
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // Retorna o primeiro dia do mes
        System.out.println("-".repeat(10));
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);

        // Ultima quinta feira que passou
        System.out.println("-".repeat(10));
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(now);

        // Ultimo dia do mes
        System.out.println("-".repeat(10));
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);

        // Primeiro dia do proximo mes
        System.out.println("-".repeat(10));
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);

        // Primeiro dia do proximo ano
        System.out.println("-".repeat(10));
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);

    }
}
