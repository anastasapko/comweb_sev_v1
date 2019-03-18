package com.web_sev;

import java.sql.*;

public class DBWorker {
    private final String HOST = "jdbc:mysql://localhost:3306/project4";
    private final String USER = "root";
    private final String PASSWORT = "root";

    private Connection connection;

    public DBWorker() {
        try {
            connection = DriverManager.getConnection(HOST, USER, PASSWORT);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() { return this.connection;}


}
