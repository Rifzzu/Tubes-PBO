package satcovclass;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stock{
    private String namaSaham, kodeSaham;
    private int id, harga;
    List<Stock> arrStock;
    
    public Stock() {
        this.namaSaham = "";
        this.kodeSaham = "";
        this.harga = 1;
    }
    
    public Stock(String namaSaham, String kodeSaham, int harga) {
        this.namaSaham = namaSaham;
        this.kodeSaham = kodeSaham;
        this.harga = harga;
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
    public static int showStockID(Database db, String kodeSaham) throws Exception{
        Connection con = db.getConnection();
                        
        PreparedStatement p = con.prepareStatement("SELECT harga_saham FROM `saham` WHERE kode_saham = '"+kodeSaham+"'");
        ResultSet rs = p.executeQuery();
                        
        int saham = 0;
        while(rs.next()){
            saham = rs.getInt("harga_saham");
        }
        return saham;
    }
    
    /*public List<Stock> getStock(Database db) throws Exception{
        //ArrayList<Stock> stock = new ArrayList<Stock>();
        arrStock = new ArrayList<>();
        Connection con = db.getConnection();
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM saham");
            while(rs.next()){
                Stock stock = new Stock();
                stock.setId(rs.getInt(1));
                stock.setKodeSaham(rs.getString("kode_saham"));
                stock.setnamaSaham(rs.getString("nama_saham"));
                stock.setHarga(rs.getInt("harga_saham"));
                arrStock.add(stock);
            }
        }catch(SQLException ex){
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrStock;
    }

    public List<Stock> getStockID(Database db,int id) throws Exception{
        arrStock = new ArrayList<>();
        Connection con = db.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM saham WHERE id= '"+id+"'");
            while(rs.next()){
                Stock stock = new Stock();
                stock.setId(rs.getInt(1));
                stock.setKodeSaham(rs.getString("kode_saham"));
                stock.setnamaSaham(rs.getString("nama_saham"));
                stock.setHarga(rs.getInt("harga_saham"));
                arrStock.add(stock);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return arrStock;
    }
    public String getnamaSaham() {
        return namaSaham;
    }*/

    public void setnamaSaham(String namaSaham) {
        this.namaSaham = namaSaham;
    }

    public String getKodeSaham() {
        return kodeSaham;
    }

    public void setKodeSaham(String kodeSaham) {
        this.kodeSaham = kodeSaham;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
}
