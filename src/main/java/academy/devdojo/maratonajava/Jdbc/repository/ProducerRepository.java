package academy.devdojo.maratonajava.Jdbc.repository;

import academy.devdojo.maratonajava.Jdbc.dominio.Producer;
import academy.devdojo.maratonajava.Jdbc.on.ConnectionFactory;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
            log.info("Rows affected: {}", rowsAffect);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
