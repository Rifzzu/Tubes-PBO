package model;

import java.sql.*;

public class Investor extends User {
    
    private Portfolio porto;
    
    public Investor(String nama, String username, String password) {
        super(nama, username, password);  
    }
    
    public static Investor Login(String nama,String username, String password) throws Exception{
        Connection con = Database.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM user WHERE (username = ?) AND (password = ?);");
        st.setString(1, username);
        st.setString(2, password);
        
        ResultSet rs = st.executeQuery();
        if (!rs.next()) {
            throw new Exception("User tidak ditemukan");
        }

        System.out.println("Anda masuk sebagai Investor.");
        return new Investor(nama,username, password);
    }
    
    public static void showStock() throws Exception{
        Connection con = Database.getConnection();
                        
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

    public static void showProfile(String username) throws Exception{
        Connection con = Database.getConnection();
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
    
    public static void buyStock(String username,String kodeStock, int lot) throws Exception{
        Connection con = Database.getConnection();
        int hargaSaham = Stock.showStockID(kodeStock);
        int harga = (lot*100) * hargaSaham;
        
        int hargaUpdate = Investor.saldoInvestor(username) - harga;
        if(hargaUpdate > 0){
            PreparedStatement p = con.prepareStatement("SELECT * FROM history WHERE username = '"+username+"' AND kode_saham = '"+kodeStock+"' AND status = 'Buy' AND lot_sell_check > 0");
            ResultSet rs = p.executeQuery();
            if(!rs.next()){
                PreparedStatement p1 = con.prepareStatement("INSERT INTO history (id_transaction, kode_saham, lot, harga,  username, status, lot_sell_check) VALUES (NULL,'"+kodeStock+"', '"+lot+"', '"+harga+"','"+username+"', 'Buy', '"+lot+"')");
                p1.executeUpdate();
            }else{
                PreparedStatement p2 = con.prepareStatement("SELECT * FROM history WHERE username = '"+username+"' AND kode_saham = '"+kodeStock+"' AND status = 'Buy' LIMIT 1");
                ResultSet rs2 = p2.executeQuery();
                if(rs2.next()){
                    PreparedStatement p3 = con.prepareStatement("INSERT INTO history (id_transaction, kode_saham, lot, harga,  username, status, lot_sell_check) VALUES (NULL,'"+kodeStock+"', '"+lot+"', '"+harga+"','"+username+"', 'Buy', NULL)");
                    p3.executeUpdate();
                    int hargaUpd = Investor.hargaHistoryInvestor(username) + harga;
                    PreparedStatement p4 = con.prepareStatement("UPDATE history SET harga ='"+hargaUpd+"' WHERE username = '"+username+"' AND kode_saham = '"+kodeStock+"' AND status = 'Buy' LIMIT 1");
                    p4.executeUpdate();
                    int lotUpd = lot + Investor.lotHistoryInvestor(username);
                    PreparedStatement p5 = con.prepareStatement("UPDATE history SET lot_sell_check ='"+lotUpd+"' WHERE username = '"+username+"' AND kode_saham = '"+kodeStock+"' AND status = 'Buy' AND lot_sell_check AND lot_sell_check != 0 LIMIT 1");
                    p5.executeUpdate();
                }
            }
            PreparedStatement p6 = con.prepareStatement("UPDATE user SET saldo = '"+hargaUpdate+"' WHERE username = '"+username+"'");
            p6.executeUpdate();
        }
    }
    
    public static void sellStock(String username,String kodeStock, int lot) throws Exception{
        Connection con = Database.getConnection();
        PreparedStatement p = con.prepareStatement("SELECT * FROM history WHERE username = '"+username+"' AND kode_saham = '"+kodeStock+"' AND status = 'Buy' AND lot_sell_check > 0 LIMIT 1");
        ResultSet rs = p.executeQuery();
        if(rs.next()){
            int cekLot =  Investor.lotSellCheckHistory(username) - lot;
            System.out.println("ada username "+" ceklot "+cekLot+" lot "+ lot + " investor lotsell "+Investor.lotSellCheckHistory(username));
            if(cekLot == 0){
                int hargaSaham = Stock.showStockID(kodeStock);
                int harga = (lot*100) * hargaSaham;
                int hargaUpdate = Investor.saldoInvestor(username) - harga;
                PreparedStatement p1 = con.prepareStatement("UPDATE user SET saldo = '"+hargaUpdate+"' WHERE username = '"+username+"'");
                p1.executeUpdate();
                PreparedStatement p2 = con.prepareStatement("INSERT INTO history (id_transaction, kode_saham, lot, harga, username, status, lot_sell_check) VALUES (NULL,'"+kodeStock+"', '"+lot+"', '"+harga+"','"+username+"', 'Sell', NULL)");
                p2.executeUpdate();
                PreparedStatement p3 = con.prepareStatement("UPDATE history SET lot_sell_check='"+cekLot+"' WHERE username = '"+username+"' AND kode_saham = '"+kodeStock+"' AND status = 'Buy' LIMIT 1");
                p3.executeUpdate();
                System.out.println("lot habis");
            }else if(cekLot > 0){
                PreparedStatement p4 = con.prepareStatement("UPDATE history SET lot_sell_check ='"+cekLot+"'WHERE kode_saham = '"+kodeStock+"' AND username = '"+username+"' AND status = 'Buy' limit 1");
                p4.executeUpdate();
                PreparedStatement p5 = con.prepareStatement("SELECT * FROM history WHERE username = '"+username+"' AND kode_saham = '"+kodeStock+"' AND status = 'Buy' AND lot_sell_check > 0 LIMIT 1");
                ResultSet rs2 = p5.executeQuery();
                if(rs2.next()){
                    int harga = Investor.hargaHistoryInvestor(username) - (lot * 100) * Stock.showStockID(kodeStock);
                    if(harga < 0){
                        harga = (lot * 100) * Stock.showStockID(kodeStock);
                    }
                    PreparedStatement p6 = con.prepareStatement("UPDATE history SET harga ='"+harga+"' WHERE kode_saham = '"+kodeStock+"' AND username = '"+username+"' AND status = 'Buy' limit 1");
                    p6.executeUpdate();
                }
                int harga = (lot * 100) * Stock.showStockID(kodeStock);
                int hargaUpdate = Investor.saldoInvestor(username) - harga;
                PreparedStatement p7 = con.prepareStatement("UPDATE user SET saldo ='"+hargaUpdate+"' WHERE username = '"+username+"'");
                p7.executeUpdate();
                PreparedStatement p8 = con.prepareStatement("INSERT INTO history (id_transaction, kode_saham, lot, harga,  username, status, lot_sell_check) VALUES (NULL,'"+kodeStock+"', '"+lot+"', '"+harga+"','"+username+"', 'Sell', NULL)");
                p8.executeUpdate();
                System.out.println("lot lebih dari 0");
            }
        } 
    }
    
    public static int saldoInvestor (String username) throws Exception{
        Connection con = Database.getConnection();
        String sql = "SELECT saldo FROM user WHERE username = '"+username+"'";
        PreparedStatement p = con.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        int saldo = 0;
        while(rs.next()){
           saldo = rs.getInt("saldo");
        }
        return saldo;
    }
    
    public static int saldo (String username) throws Exception{
        Connection con = Database.getConnection();
        String sql = "SELECT saldo FROM user WHERE username = '"+username+"'";
        PreparedStatement p = con.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        int saldo = 0;
        while(rs.next()){
           saldo = rs.getInt("saldo");
        }
        return saldo;
    }
    
    public static int hargaHistoryInvestor(String username) throws Exception{
        Connection con = Database.getConnection();
        int hargaHistory=0;
        PreparedStatement phargaHistory = con.prepareStatement("SELECT * FROM `history` WHERE username = '"+username+"'");
        ResultSet rsHistory = phargaHistory.executeQuery();
        while(rsHistory.next()){
            hargaHistory = rsHistory.getInt("harga");
        }
        return hargaHistory;
    }
    
    public static int lotHistoryInvestor(String username) throws Exception{
        Connection con = Database.getConnection();
        int lotHistory=0;
        PreparedStatement phargaHistory = con.prepareStatement("SELECT * FROM `history` WHERE username = '"+username+"'");
        ResultSet rsHistory = phargaHistory.executeQuery();
        while(rsHistory.next()){
            lotHistory = rsHistory.getInt("lot");
        }
        return lotHistory;
    }
    public static int lotSellCheckHistory(String username) throws Exception{
        Connection con = Database.getConnection();
        int lotsell=0;
        PreparedStatement p = con.prepareStatement("SELECT lot_sell_check FROM `history` WHERE username = '"+username+"'");
        ResultSet rs = p.executeQuery();
        while(rs.next()){
            lotsell = rs.getInt("lot_sell_check");
        }
        return lotsell;
    }

    public void CashBalance() {
        System.out.println("Saldo saat ini: ");
    }

    public void showPortofolio() {
        
    }
    
    
    
    
}
