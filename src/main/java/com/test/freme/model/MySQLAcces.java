package com.test.freme.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class MySQLAcces {
	
	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private String url = "jdbc:mysql://localhost:3308/feedback?useSSL=false&serverTimezone=UTC";
    private String user = "testuser";
    private String password = "RjqpoN5oLmiD7nEJ";

    public void readDataBase() {
        // This will load the MySQL driver, each DB has its own driver
        //com.mysql.jdbc.Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

             // Setup the connection with the DB
           
            connect = DriverManager.getConnection(url, user, password);


        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}