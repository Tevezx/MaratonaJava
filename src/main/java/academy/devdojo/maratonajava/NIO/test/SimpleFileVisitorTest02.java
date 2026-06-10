package academy.devdojo.maratonajava.NIO.test;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        // Se referindo apenas aos arquivos .java
        if (file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }


    // Quando entrar no diretorio ele vai imprimir
    // Ele entra na pasta e exibe tudo o que tem dentro dela (ate as subpastas)
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Pre visita: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
//        return FileVisitResult.SKIP_SUBTREE;
    }

    // Se tiver qualquer tipo de problema ao encontrar o arquivo, ele exibe um problema
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    // Quando voce estiver saindo do diretorio
    // Exibe os arquivos em ordem ao contraria do preVisitDirectory
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Pre visita: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        // Listando tudo o que há dentro do diretorio
        Path path = Paths.get("D:\\maratona\\pasta");
        Files.walkFileTree(path, new ListAllFiles());
    }
}
