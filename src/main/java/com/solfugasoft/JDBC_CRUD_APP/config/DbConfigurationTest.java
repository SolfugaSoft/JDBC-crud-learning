package com.solfugasoft.JDBC_CRUD_APP.config;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class DbConfigurationTest {
    static final String DB_URL = "jdbc:h2:mem:testdb";
    static final String USER = "sa";
    static final String PASSWORD = "";
    static final Connection testConnection = testDbConnection();
    public static final Statement testStatement = testDbStatement();


    private static Connection testDbConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    private static Statement testDbStatement() {
        Statement statement = null;
        try {
            statement = testConnection.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    public static PreparedStatement testPreparedStatement(String sqlQuery) {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = testConnection.prepareStatement(sqlQuery);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }


}
