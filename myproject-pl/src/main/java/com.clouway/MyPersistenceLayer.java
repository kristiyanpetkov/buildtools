package com.clouway;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by clouway on 16-4-4.
 */
public class MyPersistenceLayer {
    private Connection connection;

    public MyPersistenceLayer(Connection connection) {
        this.connection = connection;
    }

    public void register(Person person) {

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("INSERT INTO people (egn,name,age,gender) values (?,?,?,?)");
            stmt.setString(1, person.egn);
            stmt.setString(2, person.name);
            stmt.setInt(3, person.age);
            stmt.setString(4, person.gender);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
