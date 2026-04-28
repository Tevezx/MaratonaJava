package academy.devdojo.maratonajava.Dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        // Trabalhar com periodos (datas)
        // Aceita apenas LocalDate
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(190);

        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10); // Quantos dias sao 10 dias
        Period p3 = Period.ofWeeks(9); // Quantos dias tem em 9 semanas
        Period p4 = Period.ofYears(6); // Quantos anos sao 6 anos
        Period p5 = Period.ofMonths(3); // Quantos meses sao 3 meses

        System.out.println(p1); // P = periodo, Y = anos, M = meses, D = dias
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(Period.between(now, now.plusDays(p3.getDays()))); // Quanto meses equivale 9 semanas
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS)); // Quantos meses exatos


    }
}
