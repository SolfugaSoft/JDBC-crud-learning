package com.solfugasoft.JDBC_CRUD_APP.repositories;

import com.solfugasoft.JDBC_CRUD_APP.models.User;

import java.util.ArrayList;

public interface UserRepository {

    public ArrayList<User> getAllUser();

    public void getUserById(int id);

    public void getUserAuthorities(int id);

    public void saveUser();

    public void deleteUserId();

    public void updateUserById();


}
