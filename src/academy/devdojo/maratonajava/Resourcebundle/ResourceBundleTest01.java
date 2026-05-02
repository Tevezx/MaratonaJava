package academy.devdojo.maratonajava.Resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        // Pego o arquivo criado denominado como messages
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));

        ResourceBundle bundle1 = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        // Se chamar errado, lanca uma execption
        System.out.println(bundle1.getString("ola"));
        System.out.println(bundle1.getString("bom.dia"));
    }
}
