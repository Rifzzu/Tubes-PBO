package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/tes";
    static final String USER = "root";
    static final String PASS = "";

    private static Connection connection;
    public static Connection getConnection() throws SQLException{
        if (connection == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
               connection = DriverManager.getConnection(DB_URL,USER,PASS);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        return connection;
    }
}
