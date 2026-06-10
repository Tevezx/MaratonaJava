package academy.devdojo.maratonajava.Regex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        // token = os nomes; delimitador = as virgulas (nesse caso)
        String texto = "Carlos, Ana, Andrea, Beto, true, 200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                Integer i = scanner.nextInt();
                System.out.println("Integer: " + i);
            }else if(scanner.hasNextBoolean()){
                Boolean b = scanner.nextBoolean();
                System.out.println("Boolean: " + b);
            }else{
                System.out.println(scanner.next());
            }
        }
    }
}
