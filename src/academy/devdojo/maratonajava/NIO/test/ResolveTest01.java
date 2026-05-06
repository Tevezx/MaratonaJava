package academy.devdojo.maratonajava.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        // Caminho relativo
        Path path = Paths.get("home/carlos");
        // Caminho Absoluto
        // Paths.get("d/home/carlos/dev")

        // Retornando corretamente todo o caminho ate chegar nesse momento
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = path.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/carlos");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("files.txt");

        // Adicionando o relativo ao absoluto
        System.out.println("1 " + absoluto.resolve(relativo));
        // Adicionando file ao absoluto
        System.out.println("2 " + absoluto.resolve(file));
        // Quando tento adicionando no relativo o absoluto, ele ignora e retorna apenas o caminho absoluto
        System.out.println("3 " + relativo.resolve(absoluto));
        // Quando adiciono no relativo o file, ele retorna corretamente o caminho
        System.out.println("4 " + relativo.resolve(file));
        // A mesma coisa acontece com o file, o absoluto retorna apenas o caminho absoluto
        System.out.println("5 " + file.resolve(absoluto));
        // Quando adiciono o relativo no file, ele retorna corretamente
        System.out.println("6 " + file.resolve(relativo));

    }
}
