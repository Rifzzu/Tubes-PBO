
package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.*;

public class Portfolio_Investor extends javax.swing.JFrame {

    User usr;
    public Portfolio_Investor(User usr) {
        this.usr = usr;
        initComponents();
        /*DefaultTableModel tblModel = (DefaultTableModel)cbTable.getModel();
        tblModel.setRowCount(0);
        cbTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        cbTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        cbTable.getColumnModel().getColumn(2).setPreferredWidth(75);
        cbTable.getColumnModel().getColumn(3).setPreferredWidth(125);*/
        try {
            showPortofolio(usr.getUsername());
        } catch (Exception ex) {
            Logger.getLogger(Portfolio_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        sidebarAccount = new javax.swing.JButton();
        sidebarStock = new javax.swing.JButton();
        sidebarPortfolio = new javax.swing.JButton();
        sidebarCashBalance = new javax.swing.JButton();
        Transaction = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        sidebarHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cbTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        bg.setBackground(new java.awt.Color(48, 48, 48));
        bg.setPreferredSize(new java.awt.Dimension(1280, 720));

        header.setBackground(new java.awt.Color(64, 64, 64));

        jLabel1.setBackground(new java.awt.Color(217, 217, 217));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 123, 53));
        jLabel1.setText("SATCOV ONLINE TRADING");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidebar.setBackground(new java.awt.Color(64, 64, 64));

        sidebarAccount.setBackground(new java.awt.Color(64, 64, 64));
        sidebarAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sidebarAccount.setForeground(new java.awt.Color(231, 231, 231));
        sidebarAccount.setText("Account");
        sidebarAccount.setHideActionText(true);
        sidebarAccount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sidebarAccount.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        sidebarAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidebarAccountActionPerformed(evt);
            }
        });

        sidebarStock.setBackground(new java.awt.Color(64, 64, 64));
        sidebarStock.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sidebarStock.setForeground(new java.awt.Color(231, 231, 231));
        sidebarStock.setText("Stock");
        sidebarStock.setHideActionText(true);
        sidebarStock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sidebarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidebarStockActionPerformed(evt);
            }
        });

        sidebarPortfolio.setBackground(new java.awt.Color(64, 64, 64));
        sidebarPortfolio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sidebarPortfolio.setForeground(new java.awt.Color(231, 231, 231));
        sidebarPortfolio.setText("Portfolio");
        sidebarPortfolio.setHideActionText(true);
        sidebarPortfolio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sidebarPortfolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidebarPortfolioActionPerformed(evt);
            }
        });

        sidebarCashBalance.setBackground(new java.awt.Color(64, 64, 64));
        sidebarCashBalance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sidebarCashBalance.setForeground(new java.awt.Color(231, 231, 231));
        sidebarCashBalance.setText("Cash Balance");
        sidebarCashBalance.setHideActionText(true);
        sidebarCashBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sidebarCashBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidebarCashBalanceActionPerformed(evt);
            }
        });

        Transaction.setBackground(new java.awt.Color(64, 64, 64));
        Transaction.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Transaction.setForeground(new java.awt.Color(231, 231, 231));
        Transaction.setText("Transaction");
        Transaction.setHideActionText(true);
        Transaction.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(242, 123, 53));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        sidebarHome.setBackground(new java.awt.Color(64, 64, 64));
        sidebarHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sidebarHome.setForeground(new java.awt.Color(231, 231, 231));
        sidebarHome.setText("Home");
        sidebarHome.setHideActionText(true);
        sidebarHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sidebarHome.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        sidebarHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidebarHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sidebarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sidebarAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sidebarPortfolio, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sidebarCashBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sidebarHome, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(sidebarHome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(sidebarAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(sidebarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(sidebarPortfolio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(sidebarCashBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel1.setBackground(new java.awt.Color(64, 64, 64));
        jPanel1.setMaximumSize(new java.awt.Dimension(444, 345));
        jPanel1.setMinimumSize(new java.awt.Dimension(444, 345));

        cbTable.setBackground(new java.awt.Color(64, 64, 64));
        cbTable.setForeground(new java.awt.Color(231, 231, 231));
        cbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Lot", "Avg. Price", "Value"
            }
        ));
        cbTable.setSelectionBackground(new java.awt.Color(231, 231, 231));
        cbTable.setSelectionForeground(new java.awt.Color(64, 64, 64));
        cbTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cbTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 231, 231));
        jLabel2.setText("Total");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 231, 231));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Rp ...,...,...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(279, 279, 279)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(231, 231, 231));
        jLabel3.setText("Portfolio");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showPortofolio(String username) throws Exception {
        Connection con = Database.getConnection();
                        
        String sql = "SELECT * FROM history INNER JOIN saham on (saham.kode_saham = history.kode_saham) WHERE history.username = '"+username+"' AND status = 'Buy' AND lot_sell_check > 0 AND lot_sell_check IS NOT NULL";
        PreparedStatement p = con.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        DefaultTableModel tblModel = (DefaultTableModel)cbTable.getModel();
        tblModel.setRowCount(0);
        int totalHarga = 0;
        while(rs.next()){
            String kode = rs.getString("kode_saham");
            int lot = rs.getInt("lot_sell_check");
            int harga = rs.getInt("harga");
            String status = rs.getString("status");
            int avrprice = harga / (lot * 100);
            totalHarga += harga;
            String tbData[] = {kode, String.valueOf(lot), String.valueOf(avrprice),String.valueOf(harga)};
            tblModel.addRow(tbData);
        }
        jLabel4.setText("Rp. "+String.valueOf(totalHarga));
        cbTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        cbTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        cbTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        cbTable.getColumnModel().getColumn(3).setPreferredWidth(200);
    }
    private void sidebarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidebarStockActionPerformed
        // TODO add your handling code here:
        new Stock_Investor(usr).setVisible(true);
        dispose();
    }//GEN-LAST:event_sidebarStockActionPerformed

    private void sidebarHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidebarHomeActionPerformed
        // TODO add your handling code here:
        try {
            new Dashboard_Investor(usr).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sidebarHomeActionPerformed

    private void sidebarAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidebarAccountActionPerformed
        // TODO add your handling code here:
        try {
            new Profile_Investor(usr).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sidebarAccountActionPerformed

    private void sidebarPortfolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidebarPortfolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidebarPortfolioActionPerformed

    private void sidebarCashBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidebarCashBalanceActionPerformed
        // TODO add your handling code here:
        try {
            new CashBalance_Investor(usr).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sidebarCashBalanceActionPerformed

    private void TransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactionActionPerformed
        // TODO add your handling code here:
        try {
            new Transaction_Investor(usr).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TransactionActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        try {
            new Dashboard_Guest().setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void cbTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTableMouseClicked
        // TODO add your handling code here:
        try {
            new SpecificStock_Investor(usr, cbTable.getValueAt(cbTable.getSelectedRow(), 0).toString()).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Portfolio_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Portfolio_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Portfolio_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Portfolio_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        User usr = null;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portfolio_Investor(usr).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Transaction;
    private javax.swing.JPanel bg;
    private javax.swing.JTable cbTable;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel sidebar;
    private javax.swing.JButton sidebarAccount;
    private javax.swing.JButton sidebarCashBalance;
    private javax.swing.JButton sidebarHome;
    private javax.swing.JButton sidebarPortfolio;
    private javax.swing.JButton sidebarStock;
    // End of variables declaration//GEN-END:variables
}
