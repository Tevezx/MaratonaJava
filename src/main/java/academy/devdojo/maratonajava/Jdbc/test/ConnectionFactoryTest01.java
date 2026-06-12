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
                .id(15)
                .name("CARLOS")
                .build();

        Producer producertoUpdate = Producer
                .builder()
                .id(5)
                .name("NARUTO")
                .build();

        // Salva um producer
        // ProducerService.save(producer);

        // Deleta um producer pelo id
        // ProducerService.remove(10);

        // Atualiza um producer criado
        // ProducerService.update(producertoUpdate);

        // Busca todos os dados
        // List<Producer> producers = ProducerService.findAll();
        // System.out.println(producers);

        // Procura pelo nome
        // List<Producer> producers = ProducerService.finByName("Naruto");
        // System.out.println(producers);

        // Verifica as minhas tabelas e informações
        // ProducerService.showProducerMetaData();

        // Verifica o que o banco de dados suporta
        // ProducerService.showDriverMetaData();

        // Pegando os registros da tabela da tabela producer e alterando simultaneamente no banco de dados
        // ProducerService.showTypeScrollWorking();

        // Atualizando o todos os nomes Naruto para upperCase no banco de dados
        // List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Naruto");
        // System.out.println(producers);

        // Se não existir o nome, insiro na tabela
        // List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("Ana");
        // System.out.println(producers);

        // Deletando todos os nomes narutos
        // ProducerService.findByNameAndDelete("Naruto");

        // Evitando sql injection com prepared statement
        // ProducerService.findByNamePreparedStatement("Carlos");

        // Atualizando o nome do Carlos para CARLOS com update statement (?)
        // ProducerService.updatePreparedStatement(producer);


    }
}
