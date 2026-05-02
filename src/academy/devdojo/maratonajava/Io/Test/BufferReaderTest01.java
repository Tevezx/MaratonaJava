package academy.devdojo.maratonajava.Io.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String linha;
            while ((linha = bufferedReader.readLine()) != null){
                System.out.println(linha); // Lê uma linha inteira
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
