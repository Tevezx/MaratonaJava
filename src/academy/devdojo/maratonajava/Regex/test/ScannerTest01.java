package academy.devdojo.maratonajava.Regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        // token = os nomes; delimitador = as virgulas (nesse caso)
        String texto = "Carlos, Ana, Andrea, Beto, true, 200";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim()); // .trim() pega sem espacos
        }
    }
}
