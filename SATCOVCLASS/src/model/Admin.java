package model;

import java.sql.*;

public class Admin extends User {
    
    public Admin(String nama,String username, String password) {
        super(nama,username, password);
    }

    public static void addStockExchange(String kodeSaham, String namaSaham, int harga) throws Exception{
        Connection con = Database.getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO saham (kode_saham, nama_saham, harga_saham) VALUES (?, ?, ?);");
        st.setString(1, kodeSaham);
        st.setString(2, namaSaham);
        st.setInt(3, harga);
        st.executeUpdate();
    }
}
