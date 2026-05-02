package academy.devdojo.maratonajava.Io.Test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        // Criando diretorio
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir(); // Criando diretorio
        System.out.println("Diretório criado?: " + isDiretorioCriado);

        // Criando arquivo dentro do diretorio
        File fileArquivoDiretorio = new File("D:\\maratona\\pasta\\arquivo.txt"); // Criando arquivo dentro do diretorio
//        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt"); Dessa forma tambem funciona
        try {
            Boolean isFileCreated = fileArquivoDiretorio.createNewFile();
            System.out.println("Arquivo criado?: " + isFileCreated);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        // Renomeando arquivo
        File fileRenamed = new File(fileDiretorio, "arquivo-renamed.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado?: " + isRenamed);


        // Renomeando diretorio
        File diretorioRenamed = new File("pasta2");
        boolean isRenamedDiretorio = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio renomeado?: " + isRenamedDiretorio);
    }
}
