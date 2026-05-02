package academy.devdojo.maratonajava.Io.Test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        // Criando arquivo
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);

            System.out.println("Patch " + file.getPath());
            System.out.println("Patch Absoluto " + file.getAbsolutePath());

            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            boolean isExists = file.exists();
            if (isExists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
