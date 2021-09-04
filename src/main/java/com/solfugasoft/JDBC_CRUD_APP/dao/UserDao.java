package com.solfugasoft.JDBC_CRUD_APP.dao;

import com.solfugasoft.JDBC_CRUD_APP.models.User;
import com.solfugasoft.JDBC_CRUD_APP.repositories.UserRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static com.solfugasoft.JDBC_CRUD_APP.config.DbConfigurationTest.*;

public class UserDao implements UserRepository {

    private ResultSet resultSet = null;
    private PreparedStatement preparedStatement = null;


    @Override
    public ArrayList<User> getAllUser() {
        User user = null;
        ArrayList<User> users = new ArrayList<>();
        try {
            resultSet = testStatement.executeQuery("select * from USERS");
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt(1));
                user.setFirstName(resultSet.getString(2));
                user.setLastName(resultSet.getString(3));
                user.setPhoneNumber(resultSet.getString(4));
                user.setEmail(resultSet.getString(5));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public void getUserById(int id) {
        User user = null;
        String query = "select  * from USERS where " + id + " ?";
        preparedStatement = testPreparedStatement(query);
        try {
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user.setId(resultSet.getInt(1));
                user.setFirstName(resultSet.getString(2));
                user.setLastName(resultSet.getString(3));
                user.setPhoneNumber(resultSet.getString(4));
                user.setEmail(resultSet.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getUserAuthorities(int id) {
    }

    @Override
    public void saveUser() {

    }

    @Override
    public void deleteUserId() {

    }

    @Override
    public void updateUserById() {

    }
}
