package academy.devdojo.maratonajava.Dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // Classe abstrata
        Date date = c.getTime();

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingão é o primeiro dia da semana");
        }

        System.out.println("-".repeat(10));
        // Pegar meses, dias e anos
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println("-".repeat(10));
        // Adicionar dois dias a mais do atual e duas horas a mais
        c.add(Calendar.DAY_OF_MONTH, 2);
        c.add(Calendar.HOUR, 2);
        System.out.println(c.getTime());

        System.out.println("-".repeat(10));
        // Adiciona as horas mas nao muda o dia
        c.roll(Calendar.HOUR, 12);
        System.out.println(c.getTime());

        System.out.println(date);
    }
}
