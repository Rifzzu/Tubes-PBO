package model;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stock {
    private String namaSaham, kodeSaham;
    private int id, harga;
    List <Stock> listStock;

    public Stock() {
        this.namaSaham = "";
        this.kodeSaham = "";
        this.harga = 1;
    }
    public Stock(String kodeSaham, String namaSaham, int harga){
        this.namaSaham = kodeSaham;
        this.kodeSaham = namaSaham;
        this.harga = harga;
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
    public static int showHargaStock(String kodeSaham) throws Exception{
        Connection con = Database.getConnection();
                        
        String sql = "SELECT harga_saham FROM saham WHERE kode_saham = '"+kodeSaham+"'";
        PreparedStatement p = con.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        int harga = 0;                
        while(rs.next()){
            harga = rs.getInt("harga_saham");
        }
        return harga;
    }
    public static String showNamaStock(String kodeSaham) throws Exception{
        Connection con = Database.getConnection();
                        
        String sql = "SELECT nama_saham FROM saham WHERE kode_saham = '"+kodeSaham+"'";
        PreparedStatement p = con.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        String nama = "";                
        while(rs.next()){
            nama = rs.getString("nama_saham");
        }
        return nama;
    }

    public int showStockID() throws Exception{
        Connection con = Database.getConnection();              
        PreparedStatement p = con.prepareStatement("SELECT harga_saham FROM `saham` WHERE kode_saham = '"+this.kodeSaham+"'");
        ResultSet rs = p.executeQuery();
                        
        int saham = 0;
        while(rs.next()){
            saham = rs.getInt("harga_saham");
        }
        return saham;
    }
    public static int showStockID(String kodeSaham) throws Exception{
        Connection con = Database.getConnection();              
        PreparedStatement p = con.prepareStatement("SELECT harga_saham FROM `saham` WHERE kode_saham = '"+kodeSaham+"'");
        ResultSet rs = p.executeQuery();
                        
        int saham = 0;
        while(rs.next()){
            saham = rs.getInt("harga_saham");
        }
        return saham;
    }
    public List<Stock> getStock() throws Exception{
        //ArrayList<Stock> stock = new ArrayList<Stock>();
        listStock = new ArrayList<>();
        
        Connection con = Database.getConnection();
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `saham` ORDER BY `saham`.`harga_saham` DESC LIMIT 25;");
            while(rs.next()){
                Stock stock = new Stock();
                stock.setId(rs.getInt(1));
                stock.setKodeSaham(rs.getString("kode_saham"));
                stock.setNamaSaham(rs.getString("nama_saham"));
                stock.setHarga(rs.getInt("harga_saham"));
                listStock.add(stock);
            }
        }catch(SQLException ex){
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listStock;
    }

    public List<Stock> getStockID(String kodeSaham) throws Exception{
        listStock = new ArrayList<>();
        Connection con = Database.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM saham WHERE kode_saham= '"+kodeSaham+"'");
            while(rs.next()){
                Stock stock = new Stock();
                stock.setId(rs.getInt(1));
                stock.setKodeSaham(rs.getString("kode_saham"));
                stock.setNamaSaham(rs.getString("nama_saham"));
                stock.setHarga(rs.getInt("harga_saham"));
                listStock.add(stock);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listStock;
    }
      
    public String getNamaSaham() {return namaSaham;}

    public void setNamaSaham(String namaSaham) {this.namaSaham = namaSaham;}

    public String getKodeSaham() {return kodeSaham;}

    public void setKodeSaham(String kodeSaham) {this.kodeSaham = kodeSaham;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getHarga() {return harga;}

    public void setHarga(int harga) {this.harga = harga;}
    
    
    
    
}
