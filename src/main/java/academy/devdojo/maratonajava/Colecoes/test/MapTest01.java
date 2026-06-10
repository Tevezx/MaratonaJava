package academy.devdojo.maratonajava.Colecoes.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        // Nao podem ter chaves duplicadas
        // Ordena a lista de acordo com o hash
        // Trabalha com chave, valor
        // Map<String, String> map = new HashMap<>();

        // Mantém a ordem de inserção
        Map<String, String> map = new LinkedHashMap<>();

        // Para a chave "teklado", temos o valor "teclado"
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        // Só adiciona caso a chave "vc" nao exista
        map.putIfAbsent("vc2", "você");

        System.out.println(map);

        // Pegando as chaves do map
        // Consigo pegar a chave e o valor tambem
        for (String chave : map.keySet()) {
            System.out.println(chave + " " + map.get(chave));
        }

        System.out.println("-".repeat(10));

        // Pegando os valores do map
        for (String valor : map.values()) {
            System.out.println(valor);
        }

        System.out.println("-".repeat(10));

        // Acessando a chave e valor
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
