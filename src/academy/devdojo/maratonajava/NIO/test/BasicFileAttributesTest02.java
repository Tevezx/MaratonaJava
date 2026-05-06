package academy.devdojo.maratonajava.NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("file.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        // Exibindo data de criacao, ultima modificacao e ultimo acesso
        System.out.println("Creation Time: " + creationTime);
        System.out.println("Last Modified: " + lastModifiedTime);
        System.out.println("Last acess time: " + lastAccessTime);
        System.out.println("-".repeat(10));

        // Alterar a data de criacao, modificacao e ultimo acesso (Precisa terminar com view)
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        // Exibindo data de criacao, ultima modificacao e ultimo acesso
        System.out.println("Creation Time: " + creationTime);
        System.out.println("Last Modified: " + lastModifiedTime);
        System.out.println("Last acess time: " + lastAccessTime);
    }
}
