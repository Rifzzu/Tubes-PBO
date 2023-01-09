package model;

import java.sql.*;

public class Portfolio {
    private int idPortofolio, lot;
    private double averagePrice;
    private Stock[] listofstock;

    public Portfolio(int idPortofolio, int lot, double averagePrice, Stock[] listofstock) {
        this.idPortofolio = idPortofolio;
        this.lot = lot;
        this.averagePrice = averagePrice;
        this.listofstock = listofstock;
    }

    public void showPortofolio(String username) throws Exception {
        Connection con = Database.getConnection();
                        
        String sql = "SELECT kode_saham, lot, harga, status FROM history ORDER BY id_transaction WHERE username=?";
        PreparedStatement p = con.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
                        
        System.out.println("ID \t\t CODE \t\t LOT \t\t\t HARGA \t\t\t STATUS");
        while(rs.next()){
            int id = rs.getInt("id_transaction");
            String code = rs.getString("kode_saham");
            String lot = rs.getString("lot");
            String harga = rs.getString("harga");
            String stat = rs.getString("status");
            System.out.println(id + "\t\t" + code + "\t\t" + lot + "\t\t\t" + harga + "\t\t\t" + stat);
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

    public Stock[] getListofstock() {
        return listofstock;
    }

    public void setListofstock(Stock[] listofstock) {
        this.listofstock = listofstock;
    }
    
    
}
