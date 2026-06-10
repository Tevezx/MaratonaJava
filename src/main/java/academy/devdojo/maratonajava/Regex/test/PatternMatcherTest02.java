package academy.devdojo.maratonajava.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // Metacarcteres
        // \d = Todos os digitos
        // \D = Tudo o que nao for digito
        // \s = Espacos em branco
        // \S = Todos os caracteres excluindo os brancos
        // \w = Todos os caracteres de A-Z || a-z, digitos e _
        // \W = Tudo o que nao for incluso no \w

        String regex = "\\W";
        String texto = "@#abab#aba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
