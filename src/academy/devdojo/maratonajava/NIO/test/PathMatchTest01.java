package academy.devdojo.maratonajava.NIO.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatchTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/subpasta/file.txt");
        Path path2 = Paths.get("pasta/subpasta/file.java");
        Path path3 = Paths.get("pasta/subpasta/file.php");

        // Verificando se o path termina com txt
        matches(path, "glob:*.txt");

        // Ele nao considera os diretorios (apenas se colocar **)
        matches(path, "glob:**.txt");

        // Verificando se o path esta entre esses tres tipos
        matches(path, "glob:**/*.{txt,java,php}");

        // Verificando se o path é com extensoes que contenham tres letras
        matches(path, "glob:**/*.???");

        // Verificando se o path é o que tenha file.tresletras
        matches(path, "glob:**/file.???");
    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println("glob: " + glob + matcher.matches(path));
    }
}
