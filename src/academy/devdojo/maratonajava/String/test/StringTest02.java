package academy.devdojo.maratonajava.String.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Carlos";
        String numerosString = "01234";

        // charat
        System.out.println(nome.charAt(2)); // Retorna a letra do nome passada como posicao no index

        // length
        Integer[] numeros = {1,2,3};
        System.out.println(numeros.length);
        System.out.println(nome.length()); // Retorna o tamanho do nome

        // replace
        System.out.println(nome.replace("C", "A")); // Troca as letras

        // lowercase e uppercase
        System.out.println(nome.toLowerCase()); // Retorna minusculas
        System.out.println(nome.toUpperCase()); // Retorna Maiusculas

        // substring
        System.out.println(numerosString.substring(0, 5));// Retorna a String comecando do indice 0, terminando no indice 4

        // trim
        System.out.println(numerosString.trim()); // Remover valores em brancos do comeco e fim da string
    }
}
