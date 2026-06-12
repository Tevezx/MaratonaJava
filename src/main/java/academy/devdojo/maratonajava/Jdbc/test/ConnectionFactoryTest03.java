package academy.devdojo.maratonajava.Jdbc.test;

import academy.devdojo.maratonajava.Jdbc.dominio.Producer;
import academy.devdojo.maratonajava.Jdbc.repository.ProducerRepository;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer1 = Producer
                .builder()
                .id(1)
                .name("Felipe")
                .build();
        Producer producer2 = Producer
                .builder()
                .id(2)
                .name("Lucas")
                .build();
        Producer producer3 = Producer
                .builder()
                .id(3)
                .name("Andrea")
                .build();
        Producer producer4 = Producer
                .builder()
                .id(4)
                .name("Carlos Roberto")
                .build();

        ProducerRepository.saveTransaction(List.of(producer1, producer2, producer3, producer4));
    }
}
