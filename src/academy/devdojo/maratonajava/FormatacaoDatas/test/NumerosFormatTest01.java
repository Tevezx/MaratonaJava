package academy.devdojo.maratonajava.FormatacaoDatas.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumerosFormatTest01 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeCN = Locale.CANADA;
        NumberFormat[] numberFormats = new NumberFormat[3];

        numberFormats[0] = NumberFormat.getInstance(localePT);
        numberFormats[1] = NumberFormat.getInstance(localeJP);
        numberFormats[2] = NumberFormat.getInstance(localeCN);

        Double valor = 10_000.000;
        for (NumberFormat numberFormat : numberFormats) {
            // Numero formatado em cada um desses tres paises
            System.out.println(numberFormat.format(valor));
        }
    }
}
