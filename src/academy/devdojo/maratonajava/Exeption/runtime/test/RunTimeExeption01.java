package academy.devdojo.maratonajava.Exeption.runtime.test;

public class RunTimeExeption01 {
    public static void main(String[] args) {
        // Checked e Unchecked
        // Checked são checadas pela exeption = O problema é o arquivo
        // Unchecked não são checadas (RuntimeExeption) = O problema é você (Não precisam ser tratadas)
        // Podemos criar execoes

        Integer[] numeros = {1,2};
        Object object = null;
        System.out.println(object.toString());
        System.out.println(numeros[2]);

    }
}
