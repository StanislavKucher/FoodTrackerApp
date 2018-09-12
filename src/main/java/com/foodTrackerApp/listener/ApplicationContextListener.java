package com.foodTrackerApp.listener;

import com.foodTrackerApp.connection.ConnectionPool;
import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.SQLException;

@WebListener
public class ApplicationContextListener implements ServletContextListener{
    private static final Logger logger = Logger.getLogger(ApplicationContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ConnectionPool.getInstance().setDataSource(ConnectionPool.init());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        try {
            ConnectionPool.getInstance().close();
            ConnectionPool.getInstance().deregisterDriver();
        } catch (SQLException e) {
            logger.error("Error while closing the connection pool/deregistering the driver", e);
        }
    }
}
