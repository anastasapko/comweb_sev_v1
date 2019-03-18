package com.web_sev;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class Main {

    public static void main(String[] agrs) {
        DBWorker worker = new DBWorker();
        String q = "SELECT * FROM test;";
        Request request = new Request(1, q);


        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(request.getText());
            //System.out.println(ResultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        

    }
}