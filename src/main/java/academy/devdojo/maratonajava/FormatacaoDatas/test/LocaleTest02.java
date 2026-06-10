package academy.devdojo.maratonajava.FormatacaoDatas.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        // Qual linguagem meu sistema operacional esta rodando
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        // Saber quais são as linguagens e paises

        for (String isoCountry : isoCountries) {
            System.out.println("Paises: " + isoCountry);
        }

        for (String isoLanguage : isoLanguages) {
            System.out.println("Linguagens: " + isoLanguage);
        }
    }
}
