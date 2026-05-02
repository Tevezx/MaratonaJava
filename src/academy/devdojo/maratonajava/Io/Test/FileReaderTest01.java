package academy.devdojo.maratonajava.Io.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fileReader = new FileReader(file)) {
//            System.out.println(fileReader.read()); Retorna o primeiro caractere em ascII
//            char[] in = new char[30];
//            fileReader.read(in); // Retorna a quantidade de caracteres lidos
//            for (Character c : in) {
//                System.out.println(c);
//            } Dessa forma eu vou pegando cada caractere do arquivo

//            int i = 0;
//            while((i = fileReader.read()) != -1){
//                System.out.println((char) i); // casting para transformar int em char
//            } Dessa forma eu pego todos os caracteres de um arquivo
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
