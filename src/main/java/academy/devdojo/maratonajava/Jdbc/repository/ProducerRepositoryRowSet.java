package academy.devdojo.maratonajava.Jdbc.repository;

import academy.devdojo.maratonajava.Jdbc.dominio.Producer;
import academy.devdojo.maratonajava.Jdbc.listener.CustomRowSetListener;
import academy.devdojo.maratonajava.Jdbc.on.ConnectionFactory;
import lombok.extern.log4j.Log4j2;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepositoryRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
        String sql = "SELECT * FROM producer WHERE name_producer LIKE ?;";
        List<Producer> producers = new ArrayList<>();

        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            // Especificando o que esta acontecendo no codigo
            jrs.addRowSetListener(new CustomRowSetListener());
            // montando o sql
            jrs.setCommand(sql);
            jrs.setString(1, name);
            jrs.execute();

            while (jrs.next()) {
                Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name_producer"))
                        .build();

                producers.add(producer);
            }
        } catch (SQLException e) {
            log.info("Error while trying producer name", e);
        }

        return producers;
    }

    public static void updateJdbcRowSet(Producer producer) {
        String sql = "SELECT * FROM producer WHERE id = ?";

        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            // montando o sql
            // Apenas chamando a classe para ela especificar o que esta acontecendo no codigo
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();
            if (!jrs.next()) return;
            jrs.updateString("name_producer", producer.getName());
            jrs.updateRow();

            log.info("Updated name is producer: {}", producer.getName());
        } catch (SQLException e) {
            log.info("Error while trying updated producer name", e);
        }

    }

    public static void updateCachedRowSet(Producer producer) {
        String sql = "SELECT * FROM producer WHERE id = ?";

        try (CachedRowSet cachedRowSet = ConnectionFactory.getCachedRowSet();
             Connection connection = ConnectionFactory.getConnection()) {
            connection.setAutoCommit(false);
            // montando o sql
            cachedRowSet.setCommand(sql);
            cachedRowSet.setInt(1, producer.getId());
            cachedRowSet.execute(connection);
            if (!cachedRowSet.next()) return;
            cachedRowSet.updateString("name_producer", producer.getName());
            cachedRowSet.updateRow();
            // No cachedRowSet eu preciso aceitar as mudanças feitas
            cachedRowSet.acceptChanges();
            log.info("Updated to cached name is producer: {}", producer.getName());
        } catch (SQLException e) {
            log.info("Error while trying updated producer name", e);
        }

    }
}
