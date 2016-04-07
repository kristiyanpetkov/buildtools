package com.clouway;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by clouway on 16-4-4.
 */
public class Demo {
    private static final Logger log = Logger.getLogger(Demo.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.info("This is my Persistence Layer Demo class");
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/buildtoolstask", "root", "clouway.com");
            MyPersistenceLayer myPersistenceLayer = new MyPersistenceLayer(connection);
            myPersistenceLayer.register(new Person("9109232202","Kristiyan Petkov",24,"male"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
