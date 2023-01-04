package satcovclass;

import java.sql.*;

public class CashBalance {
    private static int amount;

    public CashBalance(Database db, int amount) {
        this.amount = amount;
    }
    
    public static void showAmount(Database db, String username) throws Exception{
        Connection con = db.getConnection();
        String sql = "SELECT username, saldo FROM user WHERE username = '"+username+"'";
        PreparedStatement p = con.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        int jumlah = 0;                
        System.out.println("username \t\t saldo");
        while(rs.next()){
           String usr = rs.getString("username");
           String sdo = rs.getString("saldo");
           jumlah = Integer.parseInt(sdo);
           System.out.println(usr + "\t\t" + sdo); 
        }
        amount = jumlah;    
    }
    
    public static void topUp(Database db,int money, String username) throws Exception{
        showAmount(db, username);
        Connection con = db.getConnection();
        int update = amount + money;
        PreparedStatement st = con.prepareStatement("UPDATE user SET saldo = '"+update+"' WHERE username = '"+username+"';");
        st.executeUpdate();
    }
    
    public static void withdrawal(Database db, int money, String username) throws Exception{
        showAmount(db, username);
        Connection con = db.getConnection();
        int update = amount - money;
        PreparedStatement st = con.prepareStatement("UPDATE user SET saldo = '"+update+"' WHERE username = '"+username+"';");
        st.executeUpdate();
    }
    
    
}
