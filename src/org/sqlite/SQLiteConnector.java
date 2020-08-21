package org.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnector {

    private Connection connection;

    private static SQLiteConnector instance;

    public void establishConnection() throws SQLException {
        String url = "jdbc:sqlite:quiz.sqlite3";
        try {
            connection = DriverManager.getConnection(url);
            System.out.println("Database connection established");
        } catch (SQLException e) {
            throw new SQLException("Connection to database url \"" + url + "\" failed", e);
        }
    }

    public static Connection getConnectionInstance() throws SQLException {
        if (instance == null) {
            instance = new SQLiteConnector();
        }
        if (instance.connection == null) {
            try {
                instance.establishConnection();
            } catch (SQLException e) {
                throw e;
            }
        }
        return instance.connection;
    }
}
