package academy.devdojo.maratonajava.NIO.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        // Classe para trabalhar com diretorio
        Path path = Paths.get("D:\\maratona\\MaratonaJava");

        // Trabalhando com generics (Em tempo de execucao, o java decide com qual classe ira trabalhar)
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
            for(Path path1 : stream){
                // Retorna todos os arquivos que temos desde o MaratonaJava
                System.out.println(path1.getFileName());
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
