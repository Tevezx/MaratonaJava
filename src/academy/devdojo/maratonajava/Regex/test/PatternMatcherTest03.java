package academy.devdojo.maratonajava.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // Metacarcteres
        // \d = Todos os digitos
        // \D = Tudo o que nao for digito
        // \s = Espacos em branco
        // \S = Todos os caracteres excluindo os brancos
        // \w = Todos os caracteres de A-Z || a-z, digitos e _
        // \W = Tudo o que nao for incluso no \w
        // [] = O que tiver dentro, ele ira procurar

        // String regex = "[a-zA-Z]"; // String regex = "[afeA]";
        // String texto = "abaaba";
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + "\n");
        }

        // Integer numeroHex = 0x59F86A; // Pegando numero hexadecimal (comecam com 0x e depois coloca o numero em hexadecimal)
        // System.out.println(numeroHex);

    }
}
