package academy.devdojo.maratonajava.Jdbc.on;

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
}
