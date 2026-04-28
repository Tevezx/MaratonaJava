package academy.devdojo.maratonajava.Dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        // Data e horario atual do sistema operacional
        // Junção do LocalDate com LocalTime
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2027, Month.DECEMBER, 9);
        LocalTime localTime = LocalTime.of(9, 45, 0);

        System.out.println(localDateTime);
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        LocalDateTime localDateTime1 = localDate.atTime(localTime);
        LocalDateTime localDateTime2 = localTime.atDate(localDate);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
