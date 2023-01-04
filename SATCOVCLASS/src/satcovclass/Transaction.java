package satcovclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Transaction {
    private int idTransaction, idSaham, lot, harga;
    private String status;

    public Transaction(int idTransaction, int idSaham, int lot, int harga, String status) {
        this.idTransaction = idTransaction;
        this.idSaham = idSaham;
        this.lot = lot;
        this.harga = harga;
        this.status = status;
    }
    
    public static void showAllTransaction(Database db, String username) throws Exception {
        Connection con = db.getConnection();
                        
        String sql = "SELECT * FROM history INNER JOIN saham on (saham.kode_saham = history.kode_saham) WHERE history.username = '"+username+"'";
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
    
    public void updateAmount() {
        
    }
}
