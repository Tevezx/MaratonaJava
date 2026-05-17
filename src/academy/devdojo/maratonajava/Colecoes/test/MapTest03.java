package academy.devdojo.maratonajava.Colecoes.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.Colecoes.dominio.Filme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Carlos");
        Consumidor consumidor2 = new Consumidor("Ana");

        Filme filme = new Filme(2L, "Interestelar", 200.000);
        Filme filme1 = new Filme(1L, "Carros", 100.000);
        Filme filme2 = new Filme(4L, "Como eu era antes de voce", 60.000);
        Filme filme3 = new Filme(3L, "Esposa de Mentirinha", 50.000);

        // Um consumidor pode ter varios filmes comprados
        List<Filme> consumidor1Filmes = List.of(filme, filme1, filme2);
        List<Filme> consumidor2Filmes = List.of(filme2, filme3);
        Map<Consumidor, List<Filme>> consumidorFilmeMap = new HashMap<>();
        consumidorFilmeMap.put(consumidor1, consumidor1Filmes);
        consumidorFilmeMap.put(consumidor2, consumidor2Filmes);

        for(Map.Entry<Consumidor, List<Filme>> consumidorListEntry : consumidorFilmeMap.entrySet()){
            System.out.println(consumidorListEntry.getKey().getNome() + " - " + consumidorListEntry.getValue());
        }

    }
}
