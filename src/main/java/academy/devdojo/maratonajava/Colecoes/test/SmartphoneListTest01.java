package academy.devdojo.maratonajava.Colecoes.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1ABC1", "Iphone");
        Smartphone smartphone2 = new Smartphone("2222", "Samsung");
        Smartphone smartphone3 = new Smartphone("3333", "Pixel");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

        // Deleta todo mundo do arraylist
        // smartphones.clear();

        for (Smartphone smartphone : smartphones) {
            System.out.println("Smartphones: " + smartphone);
        }

        Smartphone smartphone4 = new Smartphone("3333", "Pixel");
        // smartphones.equals(smartphone4) = esta verificando pelo serialnumber aonde fizemos o metodo do equals na classe smartphone
        System.out.println(smartphones.contains(smartphone4));

        // Traz o indice do objeto que estou passando como argumento, caso nao exista ele retorna -1
        int indexSmartphone4 = smartphones.indexOf(smartphone4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
