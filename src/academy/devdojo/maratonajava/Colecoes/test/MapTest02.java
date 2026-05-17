package academy.devdojo.maratonajava.Colecoes.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.Colecoes.dominio.Filme;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Carlos");
        Consumidor consumidor2 = new Consumidor("Ana");

        Filme filme = new Filme(2L, "Interestelar", 200.000);
        Filme filme1 = new Filme(1L, "Carros", 100.000);
        Filme filme2 = new Filme(4L, "Como eu era antes de voce", 60.000);
        Filme filme3 = new Filme(3L, "Esposa de Mentirinha", 50.000);

        // Basicamente estamos fazendo uma lista onde associamos um consumidor a um filme
        // consumidor 1 comprou o filme
        Map<Consumidor, Filme> consumidorFilmeMap = new HashMap<>();
        consumidorFilmeMap.put(consumidor1, filme);
        consumidorFilmeMap.put(consumidor2, filme1);

        for(Map.Entry<Consumidor, Filme> consumidorFilmeEntry : consumidorFilmeMap.entrySet()){
            System.out.println(consumidorFilmeEntry.getKey().getNome() + " - " + consumidorFilmeEntry.getValue().getNome());
        }
    }
}
