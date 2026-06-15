package academy.devdojo.maratonajava.crud.repository;

import academy.devdojo.maratonajava.crud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.crud.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    private static PreparedStatement createdPreparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM producer WHERE name_producer LIKE ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%" + name + "%");
        return preparedStatement;
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding producer by name {}", name);

        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createdPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name_producer"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find by name", e);
        }

        return producers;
    }

    private static PreparedStatement createdPrepareStatementRemove(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE FROM producer WHERE id = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }

    public static void remove(Integer id) {
        try (Connection conn = academy.devdojo.maratonajava.Jdbc.on.ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = createdPrepareStatementRemove(conn, id)) {
            preparedStatement.execute();
            log.info("Deleted producer '{}' in the databases", id);
        } catch (SQLException e) {
            log.error("Error while trying to deleted producer '{}'", id);
        }
    }

    private static PreparedStatement createdPreparedStatementSave(Connection connection, String name) throws SQLException {
        String sql = "INSERT INTO producer (name_producer) VALUES (?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        return preparedStatement;
    }

    public static void save(String name) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = createdPreparedStatementSave(conn, name)) {
            preparedStatement.execute();
            log.info("Inserted to producer '{}'", name);
        } catch (SQLException e) {
            log.info("Error while trying to inserted producer '{}'", name);
        }
    }

    private static PreparedStatement createdPreparedStatementUpdate(Connection connection, Producer producer) throws SQLException {
        String sql = "UPDATE producer SET name_producer = ? WHERE id = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        preparedStatement.setInt(2, producer.getId());
        return preparedStatement;
    }

    public static void update(Producer producer) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = createdPreparedStatementUpdate(conn, producer)) {
            preparedStatement.execute();
            log.info("Updated to producer '{}'", producer.getId());
        } catch (SQLException e) {
            log.info("Error while trying to updated producer '{}'", producer.getId());
        }
    }
}
