package academy.devdojo.maratonajava.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // Regex = expressao regular
        // Expressões regulares utilizam metacaracteres (simbolos)
        // (encontrar todos os links de um site ou encontrar determinado numeros em um site)

        String regex = "aba";
        // String texto = "abaaba";
        String texto = "abababa";

        // Precisam ser compiladas
        Pattern pattern = Pattern.compile(regex);
        // Depois é "comparada"
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");

        // Enquanto o meu matcher encontrar, pego a posição de começo dele (quando achar pela primeira vez, contabiliza e a partir dali procura novamente)
        while(matcher.find()){
            System.out.println(matcher.start() + "");
        }
    }
}
