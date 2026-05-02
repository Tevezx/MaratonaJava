package academy.devdojo.maratonajava.Io.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        // esta dentro do try para poder dar filewriter.close() automaticamente, o true permite que os dados vao sobreescrevendo
        try (FileWriter fileWriter = new FileWriter(file, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, 2048)) {
            bufferedWriter.write("O Carlos é bonitão! A ana é lindona!");
            bufferedWriter.newLine(); // Uma nova linha, como se pulasse linhas, mesma coisa do \n
            bufferedWriter.write("Oi");
            bufferedWriter.write("Olá");
            bufferedWriter.flush(); // Cuspindo dados
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
