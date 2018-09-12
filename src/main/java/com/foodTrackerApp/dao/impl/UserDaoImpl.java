package com.foodTrackerApp.dao.impl;

import com.foodTrackerApp.connection.ConnectionPool;
import com.foodTrackerApp.dao.UserDao;
import com.foodTrackerApp.enteties.User;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl extends GenericDaoImpl <User> implements UserDao{
    private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

    private static final String SQL_SELECT_BY_LOGIN = "SELECT * FROM public.users where login = ?";

    private static final String SQL_INSERT_NEW_USER_INTO_DB = "INSERT INTO public.users (login, parole, email, first_name, last_name, " +
            "birthday, age, height, weight, sex, lifestyle, lifestyle_numeric, calorie_rate, role_id) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    private static final String SQL_DELETE_USER_BY_LOGIN = "DELETE from public.users WHERE login = ?";

    public void add (User user) {
        try {
            Connection connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_NEW_USER_INTO_DB);
            
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getFirstName());
            preparedStatement.setString(5, user.getLastName());
            preparedStatement.setString(6, user.getBirthday());
            preparedStatement.setInt(7, user.getAge());
            preparedStatement.setInt(8, user.getHeight());
            preparedStatement.setInt(9, user.getWeight());
            preparedStatement.setString(10, user.getSex());
            preparedStatement.setString(11, user.getLifestyle());
            preparedStatement.setBigDecimal(12, user.getLifestyleCoefficient());
            preparedStatement.setInt(13, user.getCalorieRate());
            preparedStatement.setInt(14, user.getRoleId());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            logger.error(String.format("Failed to create a user " + user));
        }
    }
    
    public User findUserByLogin (String login) {
        User user = null;
        try{
            Connection connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BY_LOGIN);
            
            preparedStatement.setString(1, login);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt(1));
                user.setLogin(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                user.setEmail(resultSet.getString(4));
                user.setFirstName(resultSet.getString(5));
                user.setLastName(resultSet.getString(6));
                user.setBirthday(resultSet.getString(7));
                user.setAge(resultSet.getInt(8));
                user.setHeight(resultSet.getInt(9));
                user.setWeight(resultSet.getInt(10));
                user.setSex(resultSet.getString(11));
                user.setLifestyle(resultSet.getString(12));
                user.setLifestyleCoefficient(resultSet.getBigDecimal(13));
                user.setCalorieRate(resultSet.getInt(14));
                user.setRoleId(resultSet.getInt(15));
            }
        } catch (SQLException e){
            logger.error(String.format("Couldn't find a user by his login " + login));
        }
        return user;
    }

    public void deleteUserByLogin(String login)  {
        try{
            Connection connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_USER_BY_LOGIN);

            preparedStatement.setString(1, login);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            logger.error(String.format("Couldn't delete a user by the login ", login));
        }
    }
}
