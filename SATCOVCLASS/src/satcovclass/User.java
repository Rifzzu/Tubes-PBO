package satcovclass;

import java.sql.*;

public class User {
    private String username, password;
    private static String role;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public void validate() {
        
    }
    public static void Register(Database db, String namaLengkap ,String username, String password, String email) throws Exception {
        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO user (nama_lengkap, username, password, level, saldo, email) VALUES (?, ?, ?, ?, ?, ?);");
        st.setString(1, namaLengkap);
        st.setString(2, username);
        st.setString(3, password);
        st.setString(4, "investor");
        st.setInt(5, 0);
        st.setString(6, email);
        st.executeUpdate();
    }
    
    public static String getRole(Database db, String username, String password) throws Exception{
        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT LEVEL FROM user WHERE (username = ?) AND (password = ?);");
        st.setString(1, username);
        st.setString(2, password);
        ResultSet rs = st.executeQuery();
        if (!rs.next()) {
            throw new Exception("User tidak ditemukan");
        }
        role = rs.getString("level");
        return role;
    }

    /*public static void Login(Database db, String username, String password) throws Exception{
        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM user WHERE (username = ?) AND (password = ?);");
        st.setString(1, username);
        st.setString(2, password);
        
        ResultSet rs = st.executeQuery();
        if (!rs.next()) {
            throw new Exception("User tidak ditemukan");
        }

        System.out.println("User ditemukan.");
        
    }*/
    
    /*public void ShowRole() {
        if (getRole() == "admin") {
            System.out.println("Admin");
        } else if (getRole() == "investor") {
            System.out.println("Investor");
        }
    }*/
    
    
    
    public void ChangePassword() {
        
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
