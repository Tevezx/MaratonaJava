package academy.devdojo.maratonajava.Dates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        // Trabalha apenas com time
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timenow = LocalTime.now();

        System.out.println(time);
        System.out.println(timenow);

        System.out.println(time.getHour()); // Pegando apenas as horas
        System.out.println(time.getMinute()); // Apenas os minutos
        System.out.println(time.getSecond()); // Apenas os secundos
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM)); // Pegando o horario
        System.out.println(LocalTime.MIN); // Pegando meia noite
        System.out.println(LocalTime.MAX); // Pegando 23:59
    }
}
