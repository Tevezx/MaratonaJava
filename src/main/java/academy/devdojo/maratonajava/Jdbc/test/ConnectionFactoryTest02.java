package academy.devdojo.maratonajava.Jdbc.test;

import academy.devdojo.maratonajava.Jdbc.dominio.Producer;
import academy.devdojo.maratonajava.Jdbc.repository.ProducerRepositoryRowSet;
import academy.devdojo.maratonajava.Jdbc.service.ProducerServiceRowSet;

import java.util.List;

public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        // Buscando pelo nome do producer pelo jdbc row set
        // List<Producer> producerByName = ProducerServiceRowSet.findByNameJdbcRowSet("Carlos");
        // System.out.println(producerByName);

        // Atualizando registros do producer
        Producer producerUpdated = Producer
                .builder()
                .id(15)
                .name("Teveza")
                .build();
//        ProducerServiceRowSet.updateJdbcRowSet(producerUpdated);
        ProducerRepositoryRowSet.updateCachedRowSet(producerUpdated);
    }
}
