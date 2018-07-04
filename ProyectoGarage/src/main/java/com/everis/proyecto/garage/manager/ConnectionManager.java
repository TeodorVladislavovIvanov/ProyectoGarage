package com.everis.proyecto.garage.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.PreDestroy;

public class ConnectionManager {

	private static ConnectionManager connectionManager;

    private Connection connection;

    private ConnectionManager() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercise1", "root", "password");
        } catch (SQLException e) {
            throw new RuntimeException("can´t connect", e);
        }
    }

    public static ConnectionManager getInstance() {
        if (connectionManager == null) {
            connectionManager = new ConnectionManager();
        }
        return connectionManager;
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void close() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            throw new RuntimeException("can´t close", e);
        }
    }
    
}
