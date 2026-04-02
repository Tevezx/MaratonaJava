package academy.devdojo.maratonajava.Exeption.exeption.test;

import academy.devdojo.maratonajava.Exeption.dominio.Leitor1;
import academy.devdojo.maratonajava.Exeption.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readArquivo2();
    }

    public static void readArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    // Posso criar sem o catch, porem preciso do thwows com o nome da exception
    public static void readArquivo2() {
        // Só posso fazer o try with se o objeto implementa Closeable ou herda AutoCloseable
        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {
            // Vai fechar primeiro o leitor2 e depois o leitor1
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

