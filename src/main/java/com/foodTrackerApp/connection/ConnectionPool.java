package com.foodTrackerApp.connection;

import com.foodTrackerApp.exceptions.ConnectionException;
import com.foodTrackerApp.exceptions.PropertiesException;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionPool {

    private static final Logger logger = Logger.getLogger(ConnectionPool.class);
    private static final ConnectionPool instance = new ConnectionPool();

    private BasicDataSource dataSource;

    private ConnectionPool() {
    }

    public static ConnectionPool getInstance() {
        return instance;
    }

    public void setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static BasicDataSource init() {
        String propertiesFileName = "dataBase/connection.properties";

        try {
            Properties properties = new Properties();
            InputStream inputStream = ConnectionPool.class.getClassLoader()
                    .getResourceAsStream(propertiesFileName);
            if (inputStream == null) {
                throw new PropertiesException("Can't find properties file!");
            }

            properties.load(inputStream);

            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setDriverClassName(driver);
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            dataSource.setInitialSize(10);

            return dataSource;
        } catch (IOException e) {
            logger.fatal("Can't initialize datasource", e);
            throw new PropertiesException(e, "Can't load properties file for db connection!");
        }
    }

    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            logger.error("Error while getting pooled connection", e);
            throw new ConnectionException("Can't create connection!");
        }
    }

    public void close() throws SQLException {
        dataSource.close();
    }

    public void deregisterDriver() throws SQLException {
        Driver driver = DriverManager.getDriver(dataSource.getUrl());
        DriverManager.deregisterDriver(driver);
    }
}
