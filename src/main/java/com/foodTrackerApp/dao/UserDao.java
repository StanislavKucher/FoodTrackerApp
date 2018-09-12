package com.foodTrackerApp.dao;

import com.foodTrackerApp.enteties.User;

public interface UserDao extends GenericDao <User> {
    User findUserByLogin(String login);
    void deleteUserByLogin (String login);
}
