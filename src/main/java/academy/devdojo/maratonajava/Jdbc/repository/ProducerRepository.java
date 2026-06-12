package academy.devdojo.maratonajava.Jdbc.repository;

import academy.devdojo.maratonajava.Jdbc.dominio.Producer;
import academy.devdojo.maratonajava.Jdbc.on.ConnectionFactory;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
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

    // caso um producer da lista nao dê certo, ele nao insere nenhum
    public static void saveTransaction(List<Producer> producers) {
        log.info("Updateding producer");
        // Apenas uma conexao, porem varios insert
        try (Connection conn = ConnectionFactory.getConnection()) {
            // Nao quero que o banco tome conta de salvar os dados
            conn.setAutoCommit(false);
            preparedStatementSaveTransaction(conn, producers);
            conn.setAutoCommit(true);
        } catch (SQLException e) {
            log.info("Error while trying to saved producers {}", producers, e);
        }
    }

    // Criando o update do metodo acima
    private static void preparedStatementSaveTransaction(Connection connection, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO producer (name_producer) VALUES (?);";

        boolean shouldRollBack = false;

        for (Producer p : producers) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                log.info("Saving producer {}", p.getName());
                preparedStatement.setString(1, p.getName());
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                shouldRollBack = true;
            }
        }

        // Faz com que, se caso tenha algum dado incorreto, ele nao insere mais nenhum dos dados anteriores
        if (shouldRollBack) {
            log.info("Transaction is going be roolback");
            connection.rollback();
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
        return findByName(""); // Pois eu retorno todos, na query ficaria %vazio%
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding producer name");
        String sql = "SELECT * FROM producer WHERE name_producer LIKE '%s';".formatted("%" + name + "%");

        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name_producer = rs.getString("name_producer");

                Producer producer = Producer.builder().id(id).name(name_producer).build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find by name", e);
        }

        return producers;
    }

    public static void showProducerMetaData() {
        log.info("Showing producer meta data");
        String sql = "SELECT * FROM producer";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // Pegando os metadados
            ResultSetMetaData metaData = rs.getMetaData();

            // QUantidade de colunas presentes na tabela
            int columnCount = metaData.getColumnCount();
            log.info("Columns count: {}", columnCount);

            for (int i = 1; i <= columnCount; i++) {
                log.info("Table Name {}", metaData.getTableName(i));
                log.info("Column Name {}", metaData.getColumnName(i));
                log.info("Column size {}", metaData.getColumnDisplaySize(i));
                log.info("Column type {}", metaData.getColumnTypeName(i));
            }


        } catch (SQLException e) {
            log.error("Error while trying to show producer metaData", e);
        }

    }

    public static void showDriverMetaData() {
        log.info("Showing driver meta data");

        try (Connection conn = ConnectionFactory.getConnection();) {
            DatabaseMetaData metaData = conn.getMetaData();
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                // Verificando se suporta atualizacoes
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

            // Não atualiza os dados em tempo real, pode rodar de baixo pra cima e de cima pra baixo
            // Como se fosse um cache
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

            // Vê o resultado de uma atualizacao sem precisar fazer uma nova busca
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error while trying to show driver meta data", e);
        }
    }

    // Basicamente, o resultSet atualiza a tabela no banco de dados, pois ele é CONCUR_UPDATABLE
    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM producer ORDER BY name_producer DESC;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            // Indo pra ultima linha
            log.info("Last row: {}", rs.last());
            log.info("Row number: {}", rs.getRow());
            // Retorno qual o ultimo dado encontrado
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name_producer")).build());

            // Indo para a primeira linha
            log.info("First row: {}", rs.first());
            log.info("Row number: {}", rs.getRow());
            // Retorno qual o primeiro dado encontrado
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name_producer")).build());

            // Indo para uma linha em especifico
            log.info("First row: {}", rs.absolute(2));
            log.info("Row number: {}", rs.getRow());
            // Retorno qual o dado encontrado nessa linha
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name_producer")).build());

            // Voltando uma quantidade determinada de linhas
            log.info("First row: {}", rs.relative(-1));
            log.info("Row number: {}", rs.getRow());
            // Retorno qual o dado encontrado
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name_producer")).build());

            // Verificando se estou na ultima linha
            log.info("Is last row? {}", rs.isLast());
            log.info("Row number: {}", rs.getRow());

            // Verificando se estou na primeira linha
            log.info("Is first row? {}", rs.isFirst());
            log.info("Row number: {}", rs.getRow());

            // Indo debaixo pra cima
            System.out.println("-".repeat(10));
            log.info("Last row: {}", rs.last());

            while (rs.previous()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name_producer")).build());
            }
        } catch (SQLException e) {
            log.error("Error while trying to show type scroll working", e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        log.info("Finding producer name and toUpperCase");
        String sql = "SELECT * FROM producer WHERE name_producer LIKE '%s';".formatted("%" + name + "%");

        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name_producer = rs.getString("name_producer");

                // Atualiza o result set, pegando o nome da celula e transformando em toUpperCase
                rs.updateString("name_producer", name_producer.toUpperCase());
                rs.updateRow();

                Producer producer = Producer.builder().id(id).name(name_producer).build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find by name", e);
        }

        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding producer name and insert when not found");
        String sql = "SELECT * FROM producer WHERE name_producer LIKE '%s';".formatted("%" + name + "%");

        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) return producers;

            // Se não tem o nome que estou procurando, insiro um novo
            // Move para a proxima linha
            rs.moveToInsertRow();
            // Acrescenta o name na coluna name_producer
            rs.updateString("name_producer", name);
            // Insere
            rs.insertRow();

            producers.add(getProducer(rs));
        } catch (SQLException e) {
            log.error("Error while trying to find by name and insert when not found", e);
        }

        return producers;
    }

    // Deletando por nome
    public static void findByNameAndDelete(String name) {
        log.info("Finding producer name and deleting");
        String sql = "SELECT * FROM producer WHERE name_producer LIKE '%s';".formatted("%" + name + "%");

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                log.info("Deleting '{}'", rs.getString("name_producer"));
                rs.deleteRow();
            }

        } catch (SQLException e) {
            log.error("Error while trying to find by name and deleting", e);
        }
    }

    public static Producer getProducer(ResultSet rs) throws SQLException {
        return Producer.builder().id(rs.getInt("id")).name(rs.getString("name_producer")).build();
    }

    // PreparedStatment nao permite passar a query
    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding producer name in prepared statement");

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
            log.error("Error while trying to find by name in prepared statement", e);
        }

        return producers;
    }

    // Criando a consulta do metodo acima
    private static PreparedStatement createdPreparedStatementFindByName(Connection connection, String name) throws SQLException {
        // WildCard = ? -> Evita sql injection
        String sql = "SELECT * FROM producer WHERE name_producer LIKE ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%" + name + "% ");
        return preparedStatement;
    }

    public static void updatePreparedStatement(Producer producer) {
        log.info("Updateding producer");
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = updatePreparedStatement(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Updated producer '{}', rows affected: '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.info("Error while trying to update producer {}", producer.getId(), e);
        }
    }

    // Criando o update do metodo acima
    private static PreparedStatement updatePreparedStatement(Connection connection, Producer producer) throws
            SQLException {
        String sql = "UPDATE producer SET name_producer = ? WHERE id = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        preparedStatement.setInt(2, producer.getId());
        return preparedStatement;
    }
}

