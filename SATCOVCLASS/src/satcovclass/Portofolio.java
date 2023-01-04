package satcovclass;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Portofolio {
    private int idPortofolio, lot;
    private double averagePrice;
    
    List<Stock> arrStock;

    public Portofolio(int idPortofolio, int lot, double averagePrice) {
        this.idPortofolio = idPortofolio;
        this.lot = lot;
        this.averagePrice = averagePrice;
    }

    
    public static void showPortofolio(Database db, String username) throws Exception {
        Connection con = db.getConnection();
                        
        String sql = "SELECT * FROM history INNER JOIN saham on (saham.kode_saham = history.kode_saham) WHERE history.username = '"+username+"' AND status = 'Buy' AND lot_sell_check > 0";
        PreparedStatement p = con.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
                        
        System.out.println("kode \t\t lot \t\t harga \t\t status");
        while(rs.next()){
            String kode = rs.getString("kode_saham");
            String lot = rs.getString("lot");
            String harga = rs.getString("harga");
            String status = rs.getString("status");
            System.out.println(kode + "\t\t" + lot + "\t\t" + harga + "\t\t" + status);
        }
    }
    
    public int getIdPortofolio() {
        return idPortofolio;
    }

    public void setIdPortofolio(int idPortofolio) {
        this.idPortofolio = idPortofolio;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    
    
}
