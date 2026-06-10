package academy.devdojo.maratonajava.NIO.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        // Colocando o local onde eu quero salvar meu arquivo.zip
        Path arquivoZip = Paths.get("pasta/arquivo.zip");

        // Colocando o local onde eu quero pegar o arquivo para salvar
        Path arquivosParaZipar = Paths.get("pasta/subpasta/susubpasta1");

        zip(arquivoZip, arquivosParaZipar);
    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar){
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(arquivoZip)); DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)){
            for(Path file: directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);
                Files.copy(file, zipOutputStream);
                zipOutputStream.closeEntry();
            }

            System.out.println("Arquivo criado com sucesso!");
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
