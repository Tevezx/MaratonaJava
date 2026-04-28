package academy.devdojo.maratonajava.String.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        // Tudo isso funciona para StringBuffer também

        String nome = "Carlos Tevez";

        System.out.println(nome.substring(0,2));

        nome = nome.concat(" Rosseto");
        System.out.println(nome);

        // StringBuilder sb = new StringBuilder(16); // Capacidade padrão de 16 caracteres
        StringBuilder sb = new StringBuilder("Carlos Tevez");
        sb.append(" Rosseto").append(" Soares");

        System.out.println(sb.substring(0,2));

        sb.reverse();
        sb.delete(0,2);
        System.out.println(sb);
    }
}
