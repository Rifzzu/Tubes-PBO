package model;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transaction {
    private int idTransaction, kodeSaham, lot, harga;
    private String status, username;
    List<Transaction> listTransaction;

    public Transaction() {
        this.idTransaction = 1;
        this.kodeSaham = 1;
        this.lot = 1;
        this.harga = 1;
        this.status = "";
        this.username = "";
    }

    public Transaction(int idTransaction, int kodeSaham, int lot, int harga, String status, String username) {
        this.idTransaction = idTransaction;
        this.kodeSaham = kodeSaham;
        this.lot = lot;
        this.harga = harga;
        this.status = status;
        this.username = username;
    }

    public void showAllTransaction(String username) throws Exception {
        Connection con = Database.getConnection();
                        
        String sql = "SELECT id_transaction, kode_saham, lot, harga, status FROM history ORDER BY id_transaction WHERE username=?";
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
    
    public List<Transaction> getTransaction() throws Exception{
        listTransaction = new ArrayList<>();
        Connection con = Database.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM history WHERE username = '"+this.username+"'");
            while(rs.next()){
                Transaction transaksi = new Transaction();
                transaksi.setIdTransaction(rs.getInt(0));
                transaksi.setKodeSaham(rs.getInt(1));
                transaksi.setLot(rs.getInt(2));
                transaksi.setHarga(rs.getInt(3));
                transaksi.setUsername(rs.getString(4));
                transaksi.setStatus(rs.getString(5));
                listTransaction.add(transaksi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listTransaction;
    }
    
    public static int lotHistory(String username, String kodeSaham) throws Exception{
        Connection con = Database.getConnection();
        int lotHistory=0;
        PreparedStatement phargaHistory = con.prepareStatement("SELECT * FROM `history` WHERE kode_saham = '"+kodeSaham+"' AND username = '"+username+"'");
        ResultSet rsHistory = phargaHistory.executeQuery();
        while(rsHistory.next()){
            lotHistory = rsHistory.getInt("lot");
        }
        return lotHistory;
    }
    
    public int getIdTransaction() {return idTransaction;}

    public void setIdTransaction(int idTransaction) {this.idTransaction = idTransaction;}

    public int getKodeSaham() {return kodeSaham;}

    public void setKodeSaham(int kodeSaham) {this.kodeSaham = kodeSaham;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}
    
    public int getLot() {return lot;}

    public void setLot(int lot) {this.lot = lot;}

    public int getHarga() {return harga;}

    public void setHarga(int harga) {this.harga = harga;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}
    
    
   
}
