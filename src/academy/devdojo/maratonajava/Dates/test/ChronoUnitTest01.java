package academy.devdojo.maratonajava.Dates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2006, Month.DECEMBER, 9, 12, 0, 0);

        // Quantidade de dias até o momento
        System.out.println("Quantidade de dias: " + ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
        System.out.println("Quantidade de semanas: " + ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()));
        System.out.println("Quantidade de meses: " + ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()));
        System.out.println("Quantidade de anos " + ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()));

    }
}
