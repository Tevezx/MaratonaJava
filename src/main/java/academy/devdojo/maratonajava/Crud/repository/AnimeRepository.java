package academy.devdojo.maratonajava.Crud.repository;

import academy.devdojo.maratonajava.Crud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.Crud.domain.Anime;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class AnimeRepository {
    private static PreparedStatement createdPreparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM anime WHERE name_anime LIKE ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        return preparedStatement;
    }

    public static List<Anime> findByName(String name) {
        log.info("Finding anime by name '{}'", name);
        List<Anime> animes = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = createdPreparedStatementFindByName(connection, name);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
                Anime anime = Anime
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name_anime"))
                        .build();
                animes.add(anime);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find by name", e);
        }

        return animes;
    }

    private static PreparedStatement createdPreparedStatementRemove(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE FROM anime WHERE id = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }

    public static void remove(Integer id) {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = createdPreparedStatementRemove(connection, id)) {
            preparedStatement.execute();
            log.info("Deleted anime '{}' in the databases", id);
        } catch (SQLException e) {
            log.error("Error while trying to deleted anime '{}'", id);
        }
    }

    private static PreparedStatement createdPreparedStatementSave(Connection connection, Integer idProducer, String name, Integer episodies) throws SQLException {
        String sql = "INSERT INTO anime (id_producer, name_anime, episodios) VALUES (?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, idProducer);
        preparedStatement.setString(2, name);
        preparedStatement.setInt(3, episodies);
        return preparedStatement;
    }

    public static void save(Integer idProducer, String name, Integer episodies) {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = createdPreparedStatementSave(connection, idProducer, name, episodies)) {
            preparedStatement.execute();
            log.info("Inserted anime '{}'", name);
        } catch (SQLException e) {
            log.error("Error while trying to inserted anime '{}'", name);
        }
    }

    private static PreparedStatement createdPreparementStatementUpdate(Connection connection, Anime anime) throws SQLException {
        String sql = "UPDATE anime SET name_anime = ? WHERE id = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, anime.getName());
        preparedStatement.setInt(2, anime.getId());
        return preparedStatement;
    }

    public static void update(Anime anime){
        try(Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = createdPreparementStatementUpdate(connection, anime)){
            preparedStatement.execute();
            log.info("Updated anime '{}'", anime.getId());
        }catch (SQLException e){
            log.error("Error while trying to updated anime '{}'", anime.getId());
        }
    }
}
