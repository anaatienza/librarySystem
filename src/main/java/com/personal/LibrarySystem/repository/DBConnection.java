package com.personal.LibrarySystem.repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/library_system";
    private static final String USER = "root";
    private static final String PASSWORD = "4688";

    private static DBConnection instance;
    private Connection connection;


    // Constructor privado para evitar la creación externa de instancias
    private DBConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conexión a la base de datos establecida.");
        } catch (SQLException e) {
            System.err.println("❌ Error al conectar a la base de datos.");
            e.printStackTrace();
        }
    }

    // Método para obtener la instancia del Singleton
    public static synchronized DBConnection getInstancia() {
        if (instance == null || instance.connection == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    // Método para obtener la conexión activa
    public Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Método para cerrar la conexión manualmente
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("✅ Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("❌ Error al cerrar la conexión.");
            e.printStackTrace();
        }
    }

}
