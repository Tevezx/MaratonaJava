package academy.devdojo.maratonajava.Jdbc.test;

import academy.devdojo.maratonajava.Jdbc.dominio.Producer;
import academy.devdojo.maratonajava.Jdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        // Abrindo e fechando a conexao com o banco de dados
        // ConnectionFactory.getConnection().close();

        Producer producer = Producer
                .builder()
                .name("Naruto")
                .build();

        Producer producertoUpdate = Producer
                .builder()
                .id(5)
                .name("NARUTO")
                .build();

//        ProducerService.save(producer);
//        ProducerService.remove(10);
//        ProducerService.update(producertoUpdate);
        List<Producer> producers = ProducerService.findAll();
        System.out.println(producers);

    }
}
