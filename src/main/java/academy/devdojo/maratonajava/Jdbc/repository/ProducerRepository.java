package academy.devdojo.maratonajava.Jdbc.repository;

import academy.devdojo.maratonajava.Jdbc.dominio.Producer;
import academy.devdojo.maratonajava.Jdbc.on.ConnectionFactory;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// Biblioteca Log4j2 - Sistema de logs
@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO producer (name_producer) VALUES ('%s');".formatted(producer.getName());

        // Inserindo com statement
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            // Tudo aquilo que for alterar o bd será com o executeUpdate
            int rowsAffect = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the databases, rows affected: {}", producer.getName(), rowsAffect);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void remove(Integer id) {
        String sql = "DELETE FROM producer WHERE id = '%d';".formatted(id);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffect = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' in the databases, rows affected: '{}'", id, rowsAffect);
        } catch (SQLException e) {
            log.error("Error while trying to deleted producer '{}'", id);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE producer SET name_producer = '%s' WHERE id = '%d';".formatted(producer.getName(), producer.getId());

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffect = stmt.executeUpdate(sql);
            // Evitar colocar informações em log que identifiquem um usuario (exemplo: nome)
            log.info("Updated producer '{}' in the databases, rows affected: '{}'", producer.getId(), rowsAffect);
        } catch (SQLException e) {
            log.error("Error while trying to updated producer '{}'", producer.getId());
        }
    }

    public static List<Producer> findAll() {
        log.info("Finding all producers");
        String sql = "SELECT id, name_producer FROM producer;";

        List<Producer> producers = new ArrayList<>();

        // Unica diferenca é que eu preciso declarar o resultset com a execucao da query
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // Enquanto ainda tiver proximos dados a ser inserido
            while (rs.next()) {
                // Pegando a coluna 1 e definindo como tipo int
                int id = rs.getInt("id");
                String nameProducer = rs.getString("name_producer");

                Producer producer = Producer
                        .builder()
                        .id(id)
                        .name(nameProducer)
                        .build();

                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers");
        }

        return producers;
    }
}
