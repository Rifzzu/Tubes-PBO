package model;

import java.sql.*;

public class Guest{
    public void register(String nama, String username, String password, String email) throws Exception{
        Connection con = Database.getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO user (nama_lengkap, username, password, level, saldo, email) VALUES (?, ?, ?, ?, ?, ?);");
        st.setString(1, nama);
        st.setString(2, username);
        st.setString(3, password);
        st.setString(4, "investor");
        st.setInt(5, 0);
        st.setString(6, email);
        st.executeUpdate();
    }
}


