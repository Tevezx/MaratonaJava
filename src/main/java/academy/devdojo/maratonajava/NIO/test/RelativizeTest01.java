package academy.devdojo.maratonajava.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        // Relativize = Como eu faço para chegar até aquele determinado arquivo

        Path dir = Paths.get("/home/carlos");
        Path classe = Paths.get("/home/carlos/dev/olaMundo.java");
        Path pathToCLass = dir.relativize(classe);
        System.out.println(pathToCLass);

        Path absoluto1 = Paths.get("/home/carlos");
        Path absoluto2 = Paths.get("/user/local");
        Path absoluto3 = Paths.get("/home/carlos/dev/olaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.20210911");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        // COmo eu faço para chegar do diretorio absoluto3 para o absoluto1
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 " + relativo1.relativize(relativo2));
        // O java nao vai conseguir encontrar
//        System.out.println("5 " + absoluto1.relativize(relativo1));
    }
}
