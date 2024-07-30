package application.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    // Database connection URL
    private static final String URL = "jdbc:mysql://localhost:3306/library_db";
    // Database
    private static final String USER = "root";
    // Database password
    private static final String PASSWORD = "password";

    // Static block to ensure the MySQL JDBC driver is loaded
    static {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load MySQL JDBC driver.");
        }
    }

    // Method to get a connection to the database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
