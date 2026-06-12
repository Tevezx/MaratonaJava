package academy.devdojo.maratonajava.Jdbc.service;

import academy.devdojo.maratonajava.Jdbc.dominio.Producer;
import academy.devdojo.maratonajava.Jdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateJdbcRowSet(Producer producer){
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }

    public static void updateCachedRowSet(Producer producer){
        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }
}
