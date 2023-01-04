package satcovclass;

import java.sql.*;

public class Admin extends User {
    private int idAdmin;
    private String namaAdmin;

    public Admin(String username, String password) {
        super(username, password);
        
    }

    public static Admin Login(Database db, String username, String password) throws Exception{
        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM user WHERE (username = ?) AND (password = ?);");
        st.setString(1, username);
        st.setString(2, password);
        
        ResultSet rs = st.executeQuery();
        if (!rs.next()) {
            throw new Exception("User tidak ditemukan");
        }

        System.out.println("Anda masuk sebagai admin.");
        return new Admin(username, password);
    }
    
    public static void addStockExchange(Database db,String kodeSaham, String namaSaham, int harga) throws Exception{
        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO saham (kode_saham, nama_saham, harga_saham, country) VALUES (?, ?, ?, ?);");
        st.setString(1, kodeSaham);
        st.setString(2, namaSaham);
        st.setInt(3, harga);
        st.setString(4, "IDN");
        st.executeUpdate();
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }
    
}
