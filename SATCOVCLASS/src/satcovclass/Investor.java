package satcovclass;

import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Investor extends User {
    private int idUser;
    private String namaUser;
    List<Stock> arrStock;
    public Investor(String username, String password) {
        super(username, password);
        
    }
    
    public static Investor Login(Database db, String nama, String username, String password) throws Exception{
        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM user WHERE (username = ?) AND (password = ?);");
        st.setString(1, username);
        st.setString(2, password);
        
        ResultSet rs = st.executeQuery();
        if (!rs.next()) {
            throw new Exception("User tidak ditemukan");
        }
        System.out.println("Anda masuk sebagai Investor.");
        return new Investor(username, password);
    }
    
    public static void showStock(Database db) throws Exception{
        Connection con = db.getConnection();
                        
        String sql = "SELECT * FROM saham ORDER BY saham . harga_saham DESC LIMIT 5";
        PreparedStatement p = con.prepareStatement(sql);
        ResultSet rs = p.executeQuery();                 
        System.out.println("id \t\t kode_saham \t\t nama_saham \t\t harga_saham");
        while(rs.next()){
            int id = rs.getInt("id");
            String kode = rs.getString("kode_saham");
            String nama = rs.getString("nama_saham");
            String harga = rs.getString("harga_saham");
            System.out.println(id + "\t\t" + kode + "\t\t" + nama + "\t\t" + harga);
        }
    }

    public static void showProfile(Database db, String username) throws Exception{
        Connection con = db.getConnection();
        //String sql = "SELECT * FROM user WHERE (username = ?)` ";
        
        
        PreparedStatement p = con.prepareStatement("SELECT * FROM user WHERE (username = ?); ");
        p.setString(1, username);
        ResultSet rs = p.executeQuery();
        
        System.out.println("id \t\t username \t\t password \t\t level \t\t saldo");
        while(rs.next()){
            int id = rs.getInt("id");
            String usr = rs.getString("username");
            String psd = rs.getString("password");
            String lvl = rs.getString("level");
            String sldo = rs.getString("saldo");
            
            System.out.println(id + "\t\t" + usr + "\t\t" + psd + "\t\t" + lvl + "\t\t" + sldo);
        }
    }
    
    public static void showPortofolio(Database db,String username) {
        try {
            Portofolio.showPortofolio(db, username);
        } catch (Exception ex) {
            Logger.getLogger(Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showAmount(Database db,String username) {
        try {
            CashBalance.showAmount(db, username);
        } catch (Exception ex) {
            Logger.getLogger(Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createPortofolio() {
        
    }

    public static void buyStock(Database db,String username,String kodeStock, int lot) throws Exception{
        int hargaSaham = Stock.showStockID(db, kodeStock);
        Connection con = db.getConnection();

        int harga = (lot*100) * hargaSaham;
        //HARGA HISTORY
        int hargaHistory=0, lotSell=0;
        PreparedStatement phargaHistory = con.prepareStatement("SELECT * FROM `history` WHERE username = '"+username+"'");
        ResultSet rsHistory = phargaHistory.executeQuery();
        while(rsHistory.next()){
            hargaHistory = rsHistory.getInt("harga");
            lotSell = rsHistory.getInt("lot_sell_check");
        }
        //SALDO USER
        int saldo=0;
        PreparedStatement pSaldo = con.prepareStatement("SELECT * FROM `user` WHERE username = '"+username+"'");
        ResultSet rsSaldo = pSaldo.executeQuery();
        while(rsSaldo.next()){
            saldo = rsSaldo.getInt("saldo");
        }
        
        PreparedStatement p = con.prepareStatement("SELECT * FROM history WHERE username = '"+username+"' AND kode_saham = '"+kodeStock+"' AND status = 'Buy' AND lot_sell_check > 0");
        ResultSet rs = p.executeQuery();
        int hargaUpdate = saldo - harga;
        if(hargaUpdate > 0){
            if(!rs.next()){
                PreparedStatement p1 = con.prepareStatement("INSERT INTO history (id_transaction, kode_saham, lot, harga,  username, status, lot_sell_check) VALUES (NULL,'"+kodeStock+"', '"+lot+"', '"+harga+"','"+username+"', 'Buy', '"+lot+"')");
                p1.executeUpdate();
            }else{
                PreparedStatement p2 = con.prepareStatement("SELECT * FROM history WHERE username = '"+username+"' AND kode_saham = '"+kodeStock+"' AND status = 'Buy' LIMIT 1");
                ResultSet rs2 = p2.executeQuery();
                if(rs2.next()){
                    PreparedStatement p3 = con.prepareStatement("INSERT INTO history (id_transaction, kode_saham, lot, harga,  username, status, lot_sell_check) VALUES (NULL,'"+kodeStock+"', '"+lot+"', '"+harga+"','"+username+"', 'Buy', NULL)");
                    p3.executeUpdate();
                    int hargaUpd= hargaHistory + harga;
                    PreparedStatement p4 = con.prepareStatement("UPDATE history SET harga ='"+hargaUpd+"' WHERE username = '"+username+"' AND kode_saham = '"+kodeStock+"' AND status = 'Buy' LIMIT 1");
                    p4.executeUpdate();
                    int lotUpd = lot + lotSell;
                    PreparedStatement p5 = con.prepareStatement("UPDATE history SET lot_sell_check ='"+lotUpd+"' WHERE username = '"+username+"' AND kode_saham = '"+kodeStock+"' AND status = 'Buy' AND lot_sell_check != 0 LIMIT 1");
                    p5.executeUpdate();
                }
            }
        }
        PreparedStatement p6 = con.prepareStatement("UPDATE user SET saldo = '"+hargaUpdate+"' WHERE username = '"+username+"'");
        p6.executeUpdate();
        
    }
    
    public void sellStock(Database db, String kodeStock, int lot) throws Exception{
        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("");
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }
    
}
