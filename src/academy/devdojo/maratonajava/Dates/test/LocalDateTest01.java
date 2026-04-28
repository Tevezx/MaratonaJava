package academy.devdojo.maratonajava.Dates.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        System.out.println(Month.DECEMBER.getValue()); // Retorna qual mes dezembro é

        // Só trabalha com a data
        // Imutavel
        LocalDate date = LocalDate.of(1981, Month.DECEMBER, 9);

        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(date.getYear()); // Retorna o ano da data em especifico
        System.out.println(date.getMonth()); // Retorna o mês (DECEMBER)
        System.out.println(date.getMonthValue()); // retorna o numero do mes
        System.out.println(date.getDayOfWeek()); // retorna o dia da semana
        System.out.println(date.getDayOfMonth()); // retorna o dia do mes
        System.out.println(date.lengthOfMonth()); // saber quantos dias tem o mes
        System.out.println(date.isLeapYear()); // saber se o ano é bisexto
        System.out.println(date); // retorna igual ao banco de dados
        System.out.println(LocalDate.MAX); // Data maxima que pode utilizar
        System.out.println(LocalDate.MIN); // Data minima que pode utilizar
    }
}
