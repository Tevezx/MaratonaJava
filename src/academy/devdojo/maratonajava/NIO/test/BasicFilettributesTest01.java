package academy.devdojo.maratonajava.NIO.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilettributesTest01 {
    public static void main(String[] args) throws IOException {
//        BasicFileAttributes
//        DosFIleAttributes = tipo windowns
//        PosixFileAttributes = tipo Unix

        // Forma antiga
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        // Forma nova
        Path path = Paths.get("pasta/novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);

        // Verifica as permissões do arquivo
        // Pode escrever?
        System.out.println(Files.isWritable(path));
        // Pode ler?
        System.out.println(Files.isReadable(path));
        // Pode executar?
        System.out.println(Files.isExecutable(path));
    }
}
