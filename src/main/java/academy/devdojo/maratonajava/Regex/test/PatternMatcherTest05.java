package academy.devdojo.maratonajava.Regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // Metacarcteres
        // \d = Todos os digitos
        // \D = Tudo o que nao for digito
        // \s = Espacos em branco
        // \S = Todos os caracteres excluindo os brancos
        // \w = Todos os caracteres de A-Z || a-z, digitos e _
        // \W = Tudo o que nao for incluso no \w
        // [] = O que tiver dentro, ele ira procurar
        // ? = A expressao se repete Zero ou uma vez
        // * = A expressao se repete zero ou mais vezes
        // + = A expressao se repete uma ou mais vezes
        // {n,m} = de n ate m (de 5 ate 10, por exemplo)
        // ()
        // | o(v|c)o = ovo ou oco (encontre o v ou c)
        // $ = fim da linha
        // . = se colocarmos 1.3 ele vai procurar e achar (123, 33, 1@3, 1A3)

        // String regex = "[a-zA-Z]"; // String regex = "[afeA]";
        // String texto = "abaaba";
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "fulano@hotmail.com, tevez123@gmail.com, #@!oioi@mail.br, test@gmail.com.br, opa@mail";
        // Verificando se um email é valido
        System.out.println("Email válido: " + "#@!oioi@mail.br".matches(regex));
        // Pegando os emails, separando por virgula e eliminando espacos em branco
        System.out.println(Arrays.toString(texto.split(",")).trim());

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
