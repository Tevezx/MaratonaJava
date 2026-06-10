package academy.devdojo.maratonajava.FormatacaoDatas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CurrencyFormatTest01 {
    public static void main(String[] args) {

        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeCN = Locale.CANADA;
        NumberFormat[] numberFormats = new NumberFormat[3];

        numberFormats[0] = NumberFormat.getCurrencyInstance(localePT);
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeCN);

        Double valor = 10_000.20;
        for (NumberFormat numberFormat : numberFormats) {
            // Quantas casa decimais
            System.out.println(numberFormat.getMaximumFractionDigits());

            // Numero formatado em cada um desses tres paises
            System.out.println(numberFormat.format(valor));
        }

        String valorDois = "1000.2130";

        try {
            System.out.println(numberFormats[0].parse(valorDois));
        }catch (ParseException exception){
            exception.printStackTrace();
        }

    }
}
