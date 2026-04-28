package academy.devdojo.maratonajava.FormatacaoDatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // pt-BR
        Locale locale = new Locale("pt", "BR");
        Locale localeItalia = new Locale("it", "IT");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Calendar calendar = Calendar.getInstance();

        // Formatar as datas de acordo com um pais
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat dateFormatItalia = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
        DateFormat dateFormatindia = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormatJapao = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);

        System.out.println("-".repeat(10));
        // Saber o horario e data de um determinado pais
        System.out.println("Brasil: " + dateFormat.format(calendar.getTime()));
        System.out.println("Italia: " + dateFormatItalia.format(calendar.getTime()));
        System.out.println("India: " + dateFormatindia.format(calendar.getTime()));
        System.out.println("Japao: " + dateFormatJapao.format(calendar.getTime()));

        System.out.println("-".repeat(10));
        // Para saber qual o pais
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayCountry(localeJapao)); // Saber como ficaria "Brasil" em japones
        System.out.println(localeItalia.getDisplayCountry());
        System.out.println(localeItalia.getDisplayLanguage()); // Qual a lingua que a italia fala
    }
}
