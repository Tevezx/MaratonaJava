package academy.devdojo.maratonajava.Dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class obterProximoDiaUtil implements TemporalAdjuster{
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        Integer addDays = switch (dayOfWeek) {
            case FRIDAY -> 3; // Adicionando os dias na semana
            case SATURDAY -> 2;
            default -> 1;
        };

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // Pegando o proximo dia util
        LocalDate nowProximoUtil = LocalDate.now().with(new obterProximoDiaUtil());
        System.out.println(nowProximoUtil);
        System.out.println(nowProximoUtil.getDayOfWeek());


        // Pegando o proximo dia util
        now = LocalDate.now().withDayOfMonth(30).with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
