package view;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.*;

public class WithdrawConfirmation_Investor extends javax.swing.JFrame {
    User usr;
    int jumlah, nomor;
    public WithdrawConfirmation_Investor(User usr, int jumlah, int nomor) throws Exception{
        this.usr = usr;
        this.jumlah = jumlah;
        this.nomor = nomor;
        initComponents();
        totalAmountLabel1.setText("Rp. "+this.jumlah);
        accnumberLabel1.setText(String.valueOf(nomor));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        registerForm = new javax.swing.JPanel();
        withdrawLabel = new javax.swing.JLabel();
        totalAmountLabel = new javax.swing.JLabel();
        bankLabel = new javax.swing.JLabel();
        withdrawButton = new javax.swing.JButton();
        accnumberLabel = new javax.swing.JLabel();
        pwdLabel = new javax.swing.JLabel();
        pwdInput1 = new javax.swing.JTextField();
        totalAmountLabel1 = new javax.swing.JLabel();
        bankLabel1 = new javax.swing.JLabel();
        accnumberLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel8.setBackground(new java.awt.Color(48, 48, 48));
        jPanel8.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel8.setMinimumSize(new java.awt.Dimension(1280, 720));

        registerForm.setBackground(new java.awt.Color(64, 64, 64));

        withdrawLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        withdrawLabel.setForeground(new java.awt.Color(231, 231, 231));
        withdrawLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        withdrawLabel.setText("Withdraw");

        totalAmountLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalAmountLabel.setForeground(new java.awt.Color(231, 231, 231));
        totalAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalAmountLabel.setText("Total amount");

        bankLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bankLabel.setForeground(new java.awt.Color(231, 231, 231));
        bankLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bankLabel.setText("Bank");

        withdrawButton.setBackground(new java.awt.Color(59, 150, 42));
        withdrawButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        withdrawButton.setForeground(new java.awt.Color(231, 231, 231));
        withdrawButton.setText("Submit");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        accnumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accnumberLabel.setForeground(new java.awt.Color(231, 231, 231));
        accnumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accnumberLabel.setText("Account Number");

        pwdLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pwdLabel.setForeground(new java.awt.Color(231, 231, 231));
        pwdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pwdLabel.setText("Password");

        totalAmountLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalAmountLabel1.setForeground(new java.awt.Color(231, 231, 231));
        totalAmountLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalAmountLabel1.setText("Rp xxx.xxx.xxx,xx");

        bankLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bankLabel1.setForeground(new java.awt.Color(231, 231, 231));
        bankLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bankLabel1.setText("Bank Central Asia (BCA)");

        accnumberLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        accnumberLabel1.setForeground(new java.awt.Color(231, 231, 231));
        accnumberLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accnumberLabel1.setText("1357924680666");

        javax.swing.GroupLayout registerFormLayout = new javax.swing.GroupLayout(registerForm);
        registerForm.setLayout(registerFormLayout);
        registerFormLayout.setHorizontalGroup(
            registerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerFormLayout.createSequentialGroup()
                .addGroup(registerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerFormLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerFormLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(registerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(withdrawLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(registerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pwdInput1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                .addComponent(totalAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bankLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(accnumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pwdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalAmountLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bankLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(accnumberLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        registerFormLayout.setVerticalGroup(
            registerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerFormLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(withdrawLabel)
                .addGap(27, 27, 27)
                .addComponent(totalAmountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalAmountLabel1)
                .addGap(18, 18, 18)
                .addComponent(bankLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bankLabel1)
                .addGap(18, 18, 18)
                .addComponent(accnumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accnumberLabel1)
                .addGap(18, 18, 18)
                .addComponent(pwdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(registerForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(467, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(registerForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        // TODO add your handling code here:
        if(pwdInput1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Field can't be empty!");
        }else{
            try {
                CashBalance.withdrawal(usr.getUsername(), jumlah);
                new CashBalance_Investor(usr).setVisible(true);
                this.setVisible(false);
            } catch (Exception ex) {
                Logger.getLogger(TopUpConfirmation_Investor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_withdrawButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WithdrawConfirmation_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithdrawConfirmation_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithdrawConfirmation_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithdrawConfirmation_Investor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        User usr = null;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new WithdrawConfirmation_Investor(usr,0, 0).setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(WithdrawConfirmation_Investor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accnumberLabel;
    private javax.swing.JLabel accnumberLabel1;
    private javax.swing.JLabel bankLabel;
    private javax.swing.JLabel bankLabel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField pwdInput1;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JPanel registerForm;
    private javax.swing.JLabel totalAmountLabel;
    private javax.swing.JLabel totalAmountLabel1;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JLabel withdrawLabel;
    // End of variables declaration//GEN-END:variables

}
