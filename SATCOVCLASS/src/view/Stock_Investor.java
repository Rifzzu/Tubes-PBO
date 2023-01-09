package view;

import controller.Controller;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import model.*;
import view.*;
public class Stock_Investor extends javax.swing.JFrame {
    Controller ck;
    User usr;
    public Stock_Investor(User usr) {
        this.usr = usr;
        initComponents();
        try{
            Timer timer = new Timer(3000, (ActionEvent e) -> {
                try {
                    ck = new Controller(this);
                    ck.isiTable();
                } catch (Exception ex) {}
            });
            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.setInitialDelay(0);
            timer.start();
        }catch(Exception e){}
        
        
    }
    public JTable getTable(){return stockList;}
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
        logoutButton = new javax.swing.JButton();
        sidebarHome = new javax.swing.JButton();
        sidebarStock1 = new javax.swing.JButton();
        sidebarStock2 = new javax.swing.JButton();
        sidebarStock3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        bg.setBackground(new java.awt.Color(48, 48, 48));
        bg.setMaximumSize(new java.awt.Dimension(1280, 720));
        bg.setMinimumSize(new java.awt.Dimension(1280, 720));
        bg.setName(""); // NOI18N
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
        sidebar.setMaximumSize(new java.awt.Dimension(341, 620));
        sidebar.setMinimumSize(new java.awt.Dimension(341, 620));

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

        sidebarStock1.setBackground(new java.awt.Color(64, 64, 64));
        sidebarStock1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sidebarStock1.setForeground(new java.awt.Color(231, 231, 231));
        sidebarStock1.setText("Portfolio");
        sidebarStock1.setHideActionText(true);
        sidebarStock1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sidebarStock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidebarStock1ActionPerformed(evt);
            }
        });

        sidebarStock2.setBackground(new java.awt.Color(64, 64, 64));
        sidebarStock2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sidebarStock2.setForeground(new java.awt.Color(231, 231, 231));
        sidebarStock2.setText("Cash Balance");
        sidebarStock2.setHideActionText(true);
        sidebarStock2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sidebarStock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidebarStock2ActionPerformed(evt);
            }
        });

        sidebarStock3.setBackground(new java.awt.Color(64, 64, 64));
        sidebarStock3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sidebarStock3.setForeground(new java.awt.Color(231, 231, 231));
        sidebarStock3.setText("Transaction");
        sidebarStock3.setHideActionText(true);
        sidebarStock3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sidebarStock3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidebarStock3ActionPerformed(evt);
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
                            .addComponent(sidebarHome, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sidebarStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sidebarStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sidebarStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(sidebarStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(sidebarStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(sidebarStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel1.setBackground(new java.awt.Color(99, 99, 99));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(525, 345));
        jPanel1.setMinimumSize(new java.awt.Dimension(525, 345));

        stockList.setBackground(new java.awt.Color(80, 80, 80));
        stockList.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        stockList.setForeground(new java.awt.Color(231, 231, 231));
        stockList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        stockList.setGridColor(new java.awt.Color(80, 80, 80));
        stockList.setSelectionBackground(new java.awt.Color(231, 231, 231));
        stockList.setSelectionForeground(new java.awt.Color(80, 80, 80));
        stockList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stockList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 231, 231));
        jLabel2.setText("Stock");

        jTextField1.setToolTipText("Search specific stock");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stockListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockListMouseClicked
        try {
            new SpecificStock_Investor(usr, stockList.getValueAt(stockList.getSelectedRow(), 1).toString()).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stockListMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        try {
            new SearchStock_Investor(usr,jTextField1.getText()).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void sidebarHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidebarHomeActionPerformed
        try {
            new Dashboard_Investor(usr).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sidebarHomeActionPerformed

    private void sidebarAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidebarAccountActionPerformed
        try {
            new Profile_Investor(usr).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sidebarAccountActionPerformed

    private void sidebarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidebarStockActionPerformed
        try {
            new Stock_Investor(usr).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sidebarStockActionPerformed

    private void sidebarStock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidebarStock1ActionPerformed
        try {
            new Portfolio_Investor(usr).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sidebarStock1ActionPerformed

    private void sidebarStock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidebarStock2ActionPerformed
        try {
            new CashBalance_Investor(usr).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sidebarStock2ActionPerformed

    private void sidebarStock3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidebarStock3ActionPerformed
        try {
            new Transaction_Investor(usr).setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sidebarStock3ActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        try {
            new Dashboard_Guest().setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Stock_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        User usr = null;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock_Investor(usr).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel sidebar;
    private javax.swing.JButton sidebarAccount;
    private javax.swing.JButton sidebarHome;
    private javax.swing.JButton sidebarStock;
    private javax.swing.JButton sidebarStock1;
    private javax.swing.JButton sidebarStock2;
    private javax.swing.JButton sidebarStock3;
    private javax.swing.JTable stockList;
    // End of variables declaration//GEN-END:variables
}
