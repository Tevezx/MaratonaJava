package academy.devdojo.maratonajava.Io.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        // esta dentro do try para poder dar filewriter.close() automaticamente, o true permite que os dados vao sobreescrevendo
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("O Carlos é bonitão!\nA ana é lindona!\n");
            fileWriter.flush(); // Cuspindo dados
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
