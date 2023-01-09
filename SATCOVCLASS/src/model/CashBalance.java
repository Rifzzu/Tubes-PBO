package model;

import java.sql.*;

public class CashBalance {
    private int amount;

    public CashBalance(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public static void topUp(String username, int nominal) throws Exception{
        Connection con = Database.getConnection();
        int saldo = showAmount(username);
        int jumlah = saldo + nominal;
        PreparedStatement st = con.prepareStatement("UPDATE user SET saldo ='"+jumlah+"' WHERE username = '"+username+"'");
        st.executeUpdate();
    }
    
    public static void withdrawal(String username, int nominal) throws Exception {
        Connection con = Database.getConnection();
        int saldo = showAmount(username);
        int jumlah = saldo - nominal;
        if(jumlah > 0){
            PreparedStatement st = con.prepareStatement("UPDATE user SET saldo ='"+jumlah+"' WHERE username = '"+username+"'");
            st.executeUpdate();
        }
    }
    
    public static int showAmount(String username) throws Exception {
        Connection con = Database.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT saldo FROM user WHERE (username = ?);");
        st.setString(1, username);
        
        ResultSet rs = st.executeQuery();
        if (!rs.next()) {
            throw new Exception("User tidak ditemukan");
        }
        int amount = rs.getInt("saldo");
        return amount;
    }
}
