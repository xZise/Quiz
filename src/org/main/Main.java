package org.main;

import org.sqlite.SQLiteConnector;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            SQLiteConnector.getConnectionInstance();
        } catch (SQLException e) {
            System.out.println("Error in database connection. Exiting");
            System.exit(1);
        }
    }
}
