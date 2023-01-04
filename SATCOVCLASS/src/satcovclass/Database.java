package satcovclass;

import java.sql.*;

public class Database {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/tes";
    static final String USER = "root";
    static final String PASS = "";

    Connection conn;

    public Database() throws SQLException, ClassNotFoundException {
        // Always do this at the start of a application
        Class.forName(Database.JDBC_DRIVER);
        this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public Connection getConnection() throws Exception {
        if (this.conn == null) {
            throw new Exception("Database not initialize");
        }
        return this.conn;
    }
}
