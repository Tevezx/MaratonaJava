package academy.devdojo.maratonajava.Wrapper.test;

public class WrapperTest {
    public static void main(String[] args) {
        byte byteP = 127;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 1.5F;
        double doubleP = 1.5;
        char charP = 'P';
        boolean isP = true;

        // Transformando as variaveis em objetos = tipos wrapper
        // Posso passar parametros por referencia, nao somente por valor como no tipo primitivo
        // Collections nao trabalha com tipos primitivos
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 1.5F;
        Double doubleW = 1.5;
        Character charW = 'P';
        Boolean isW = true;

        int i = intW; // unboxing pego o wrapper e transformo ele em int (cast)
        Integer intW2 = Integer.parseInt("1"); // Transformando uma string em 1

        // Transformo TrUe para true
        boolean verdadeiro = Boolean.parseBoolean("TrUe");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isLetterOrDigit('!')); // é letra ou digito?
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }
}
