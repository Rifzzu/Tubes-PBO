package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.*;

public class SellConfirmation_Investor extends javax.swing.JFrame {
    User usr;
    int harga, lot;
    int jumlah;
    String kodeSaham;

    public SellConfirmation_Investor(User usr, String kodeSaham,int lot,int harga) throws Exception{
        this.usr = usr;
        this.kodeSaham = kodeSaham;
        this.harga = harga;
        this.lot = lot;
        jumlah = lot * harga;
        initComponents();
        totalLot.setText(String.valueOf(lot));
        totalPrice.setText("Rp. "+jumlah);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        confForm = new javax.swing.JPanel();
        confLabel = new javax.swing.JLabel();
        lotLabel = new javax.swing.JLabel();
        totalLot = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        pwdLabel = new javax.swing.JLabel();
        pwdInput = new javax.swing.JTextField();
        sellButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(48, 48, 48));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));

        confForm.setBackground(new java.awt.Color(64, 64, 64));

        confLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        confLabel.setForeground(new java.awt.Color(231, 231, 231));
        confLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confLabel.setText("Confirmation");

        lotLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lotLabel.setForeground(new java.awt.Color(231, 231, 231));
        lotLabel.setText("Total Lot");

        totalLot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalLot.setForeground(new java.awt.Color(231, 231, 231));
        totalLot.setText("xxxxx");

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(231, 231, 231));
        priceLabel.setText("Total Price");

        totalPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalPrice.setForeground(new java.awt.Color(231, 231, 231));
        totalPrice.setText("Rp xxx.xxx.xxx,xx");

        pwdLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pwdLabel.setForeground(new java.awt.Color(231, 231, 231));
        pwdLabel.setText("Password");

        sellButton.setBackground(new java.awt.Color(242, 53, 53));
        sellButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sellButton.setForeground(new java.awt.Color(231, 231, 231));
        sellButton.setText("Sell");
        sellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout confFormLayout = new javax.swing.GroupLayout(confForm);
        confForm.setLayout(confFormLayout);
        confFormLayout.setHorizontalGroup(
            confFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confFormLayout.createSequentialGroup()
                .addGroup(confFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confFormLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(sellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(confFormLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(confFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwdLabel)
                            .addComponent(pwdInput, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(lotLabel)
                            .addComponent(priceLabel)
                            .addComponent(confLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalLot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        confFormLayout.setVerticalGroup(
            confFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confFormLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(confLabel)
                .addGap(27, 27, 27)
                .addComponent(lotLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalLot)
                .addGap(18, 18, 18)
                .addComponent(priceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalPrice)
                .addGap(18, 18, 18)
                .addComponent(pwdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(sellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(confForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(467, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(confForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellButtonActionPerformed
        try {
            Investor.sellStock(usr.getUsername(), kodeSaham, lot);
            new Portfolio_Investor(usr).setVisible(true);
            JOptionPane.showMessageDialog(this, "Proses Berhasil");
        } catch (Exception ex) {
            Logger.getLogger(SellConfirmation_Investor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sellButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SellConfirmation_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellConfirmation_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellConfirmation_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellConfirmation_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        User usr = null;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SellConfirmation_Investor(usr,"",0,0).setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(SellConfirmation_Investor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel confForm;
    private javax.swing.JLabel confLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lotLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField pwdInput;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JButton sellButton;
    private javax.swing.JLabel totalLot;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}
