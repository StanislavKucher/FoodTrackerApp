package com.foodTrackerApp.connection;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConnectionPoolTest {

    private Properties properties;


    @Test
    public void setUp() throws IOException {
        properties = new Properties();
        InputStream input = ConnectionPoolTest.class.getClassLoader()
                .getResourceAsStream("dataBase/connection.properties");
        properties.load(input);
    }

//    if path to the properties is wrong - NPE
    @Test(expected = NullPointerException.class)
    public void propertiesFileNotFound() throws IOException {
        properties = new Properties();
        InputStream input = ConnectionPoolTest.class.getClassLoader()
                .getResourceAsStream("wrong.properties");
        properties.load(input);
    }

}