package academy.devdojo.maratonajava.Interfaces.test;

import academy.devdojo.maratonajava.Interfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.Interfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
