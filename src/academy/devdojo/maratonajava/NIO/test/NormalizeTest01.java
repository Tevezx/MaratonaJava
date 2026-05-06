package academy.devdojo.maratonajava.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorio = "home/carlos/dev";
        String arquivoTxt = "../../arquivo.txt";
        // Ele da o comando para pegar onde o arquivo esta
        Path path1 = Paths.get(diretorio, arquivoTxt);
        System.out.println(path1);
        // Ele normaliza o caminho do arquivo (pega exatamente onde ele esta)
        System.out.println(path1.normalize());
    }
}
