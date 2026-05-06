package academy.devdojo.maratonajava.NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) {
        // Criando pasta
        Path pasatPath = Paths.get("pasta");
        try {
            if (Files.notExists(pasatPath)) {
                Path pastaDirectory = Files.createDirectory(pasatPath);
                System.out.println("Diretório criado!");
            }

            // Criando subPasta
            Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
            Path pastaDirectories = Files.createDirectories(subPastaPath);

            // Criando arquivo
            Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
            if(Files.notExists(filePath)){
                Path createFiles = Files.createFile(filePath);
            }

            // Copiar um arquivo
            Path source = filePath;
            Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
            Files.copy(source, target);

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
