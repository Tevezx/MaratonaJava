package academy.devdojo.maratonajava.Exeption.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExeptionTest01 {
    public static void main(String[] args) {
        // Tipo check
        // throw siginifica lançar

        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            //Precisa ter um código aqui para lançar a execao
            Boolean isCreate = file.createNewFile();
            System.out.println("Arquivo Criado: " + isCreate);
        }
        // Estou especificando qual excesao capturar
        catch (IOException e) {
            // Não posso deixar esse bloco em branco
            // Imprimi no console
            // Nao se coloca regra de negocio no catch
            e.printStackTrace();
        }
    }
}
