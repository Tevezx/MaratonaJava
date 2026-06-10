package academy.devdojo.maratonajava.Jdbc.test;

import academy.devdojo.maratonajava.Jdbc.dominio.Producer;
import academy.devdojo.maratonajava.Jdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        // Abrindo e fechando a conexao com o banco de dados
        // ConnectionFactory.getConnection().close();

        Producer producer = Producer
                .builder()
                .name("Naruto")
                .build();
        ProducerRepository.save(producer);
    }
}
