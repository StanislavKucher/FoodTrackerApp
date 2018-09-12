package com.foodTrackerApp;

import com.foodTrackerApp.connection.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*Current class is used just for test purposes till the controller and JSP aren't done and will be deleted in the upshot*/
public class Main {
    public static void main(String[] args) {

        ConnectionPool.getInstance().setDataSource(ConnectionPool.init());

        try {
            Connection connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
            }
        } catch (SQLException e) {
        }
    }
}