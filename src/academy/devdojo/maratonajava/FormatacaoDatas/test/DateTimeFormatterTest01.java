package academy.devdojo.maratonajava.FormatacaoDatas.test;

import academy.devdojo.maratonajava.Seminario.Dominio.Local;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        // Formatter = Transformando um objeto para String
        // Parse = Tranformando String para um objeto

        LocalDate localDate = LocalDate.now();
        // Definindo objeto para String
        String s1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = localDate.format(DateTimeFormatter.ISO_DATE);
        String s3 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("-".repeat(10));

        // Formatando a string para objeto
        LocalDate parse1 = LocalDate.parse(s1, DateTimeFormatter.BASIC_ISO_DATE);
        // LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse(s2, DateTimeFormatter.ISO_DATE);
        // LocalDate parse2 = LocalDate.parse("2021-02-19+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse(s3, DateTimeFormatter.ISO_LOCAL_DATE);
        // LocalDate parse3 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        System.out.println("-".repeat(10));

        // Com LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse(s4, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        System.out.println("-".repeat(10));

        // Utilizando formatado brasileiro nas datas
        DateTimeFormatter formatterBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(formatterBrasil);
        System.out.println(formatBr);

        LocalDate parse5 = LocalDate.parse(formatBr, formatterBrasil);
        System.out.println(parse5);

        System.out.println("-".repeat(10));

        // Objeto em String
        DateTimeFormatter formatterGerman = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.GERMAN);
        String formatGr = LocalDate.now().format(formatterGerman);
        System.out.println(formatGr);

        // String em objeto
        LocalDate parse6 = LocalDate.parse(formatGr, formatterGerman);
        System.out.println(parse6);
    }
}
