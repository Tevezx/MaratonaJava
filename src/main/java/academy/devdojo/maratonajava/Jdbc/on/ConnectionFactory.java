package academy.devdojo.maratonajava.Jdbc.on;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // conexão com o banco de dados
    // java.sql = connection, Statement, ResultSet, DriverManager
    // Para cada tipo de banco de dados, existe um driver diferente
    public static Connection getConnection() throws SQLException {
        // url padrão
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";

        return DriverManager.getConnection(url, username, password);
    }

    // Utilizando jdbcrowSet -> pode ou nao manter conexao com o banco de dados
    public static JdbcRowSet getJdbcRowSet() throws SQLException {
        // url padrão
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";

        // Setando valores do jdbcrowset
        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(username);
        jdbcRowSet.setPassword(password);

        return jdbcRowSet;
    }

    // Funciona como um disconect
    public static CachedRowSet getCachedRowSet() throws SQLException {
        return RowSetProvider.newFactory().createCachedRowSet();
    }
}
