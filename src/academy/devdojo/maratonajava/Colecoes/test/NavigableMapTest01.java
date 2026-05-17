package academy.devdojo.maratonajava.Colecoes.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Carlos");
        Consumidor consumidor2 = new Consumidor("Ana");

        NavigableMap<String, String> map = new TreeMap<>();
//        map.put("A", consumidor1);
//        map.put("C", consumidor2);
        map.put("D", "Letra D");
        map.put("B", "Letra B");

        // Ele ordena a lista pela chave
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Retorna todo mundo que esta abaixo da letra C
        System.out.println("-".repeat(10));
        System.out.println(map.headMap("C"));

        // Quem é maior igual a C >=
        System.out.println("-".repeat(10));
        System.out.println(map.ceilingEntry("C"));

        // Quem esta abaixo de C <
        System.out.println("-".repeat(10));
        System.out.println(map.lowerEntry("C"));

        // Quem é maior >
        System.out.println("-".repeat(10));
        System.out.println(map.higherEntry("C"));

        System.out.println("-".repeat(10));
        System.out.println(map.floorEntry("C"));
    }
}
