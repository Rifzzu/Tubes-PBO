package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    private String username, password, nama, email;
    private static String role;

    public User(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public static User Login(String nama, String username, String password) throws Exception{
        Connection con = Database.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM user WHERE (username = ?) AND (password = ?);");
        st.setString(1, username);
        st.setString(2, password);
        
        ResultSet rs = st.executeQuery();
        if (!rs.next()) {
            throw new Exception("User tidak ditemukan");
        }

        System.out.println("Anda masuk sebagai Investor.");
        return new Investor(nama, username, password);
    }
    
    public static String showRole(String username) throws Exception{
        Connection con = Database.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT LEVEL FROM user WHERE (username = ?);");
        st.setString(1, username);
        
        ResultSet rs = st.executeQuery();
        if (!rs.next()) {
            throw new Exception("User tidak ditemukan");
        }
        role = rs.getString("level");
        return role;
    }

    public static String ShowUsername(String username) throws Exception{
        Connection con = Database.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT username FROM user WHERE (username = ?);");
        st.setString(1, username);
        
        ResultSet rs = st.executeQuery();
        if (!rs.next()) {
            throw new Exception("User tidak ditemukan");
        }
        username = rs.getString("username");
        return username;
    }
    
    public static String ShowName(String username) throws Exception{
        Connection con = Database.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT nama_lengkap FROM user WHERE (username = ?);");
        st.setString(1, username);
        
        ResultSet rs = st.executeQuery();
        if (!rs.next()) {
            throw new Exception("User tidak ditemukan");
        }
        username = rs.getString("nama_lengkap");
        return username;
    }
    
    public static String ShowPass(String username) throws Exception{
        Connection con = Database.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT password FROM user WHERE (username = ?);");
        st.setString(1, username);
        ResultSet rs = st.executeQuery();
        String pass = "";
        if (!rs.next()) {
            throw new Exception("User tidak ditemukan");
        }
        pass = rs.getString("password");
        return pass;
    }
    
    public static void ChangePassword(String username, String password) throws Exception{
        Connection con = Database.getConnection();
        PreparedStatement st = con.prepareStatement("UPDATE user set password = '"+password+"' WHERE username = '"+username+"';");
        st.executeUpdate();
    }
    
    public static void deleteAccount(String username, String password)throws Exception{
        Connection con = Database.getConnection();
        PreparedStatement st = con.prepareStatement("DELETE FROM history where username = '"+username+"'");
        st.executeUpdate();
        PreparedStatement st2 = con.prepareStatement("DELETE FROM user where username = '"+username+"'");
        st2.executeUpdate();
    }
    
    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getNama() {return nama;}

    public void setNama(String nama) {this.nama = nama;}

    public static String getRole() {return role;}

    public static void setRole(String role) {User.role = role;}
    
}
