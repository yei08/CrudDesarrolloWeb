/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infrastructure.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JEIFER ALCALA
 */
public class ConnectionDbMySql {
 
    private static final String DB_URL = "jdbc:mysql://localhost:3306/events_web";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new SQLException("Driver not found: " + DRIVER);
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new SQLException("Connection error: " + ex.getMessage());
        }

        return conn;
    }

    
}
