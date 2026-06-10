package academy.devdojo.maratonajava.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("D:\\maratona\\pasta2\\arquivo.txt");
//        Path p2 = Paths.get("D:\\maratona\\pasta2\\", "arquivo.txt");
//        Path p3 = Paths.get("D:","\\maratona\\pasta2\\arquivo.txt");
//        Path p4 = Paths.get("D:","\\maratona\\pasta2\\", "arquivo.txt"); Funcionam da mesma forma
        System.out.println(p1.getFileName()); // Pegando o nome do arquivo
    }
}
