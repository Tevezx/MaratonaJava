package academy.devdojo.maratonajava.FormatacaoDatas.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brazil' 'dia: ' dd ' de ' MMMM ' de ' yyyy G ' Horário: ' HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
