package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.*;

public class ForgotPassword_Form extends javax.swing.JFrame {
    
    User usr;
    public ForgotPassword_Form() {
        initComponents();
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
        loginForm = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        usrLabel = new javax.swing.JLabel();
        usrInput = new javax.swing.JTextField();
        pwdLabel = new javax.swing.JLabel();
        pwdInput = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        usrInput1 = new javax.swing.JTextField();
        usrLabel1 = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(48, 48, 48));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        loginForm.setBackground(new java.awt.Color(64, 64, 64));
        loginForm.setMaximumSize(new java.awt.Dimension(350, 326));
        loginForm.setMinimumSize(new java.awt.Dimension(350, 326));

        loginLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(231, 231, 231));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Forgot Password");

        usrLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usrLabel.setForeground(new java.awt.Color(231, 231, 231));
        usrLabel.setText("New Password");

        pwdLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pwdLabel.setForeground(new java.awt.Color(231, 231, 231));
        pwdLabel.setText("Confirm New Password");

        loginButton.setBackground(new java.awt.Color(242, 123, 53));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(231, 231, 231));
        loginButton.setText("Change");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(64, 64, 64));
        jButton1.setForeground(new java.awt.Color(231, 231, 231));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        usrLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usrLabel1.setForeground(new java.awt.Color(231, 231, 231));
        usrLabel1.setText("Username");

        javax.swing.GroupLayout loginFormLayout = new javax.swing.GroupLayout(loginForm);
        loginForm.setLayout(loginFormLayout);
        loginFormLayout.setHorizontalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormLayout.createSequentialGroup()
                .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginFormLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginFormLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1))
                    .addGroup(loginFormLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usrLabel1)
                            .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usrInput)
                                .addComponent(pwdInput)
                                .addGroup(loginFormLayout.createSequentialGroup()
                                    .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usrLabel)
                                        .addComponent(pwdLabel)
                                        .addComponent(usrInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(3, 3, 3))))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        loginFormLayout.setVerticalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(loginLabel)
                .addGap(18, 18, 18)
                .addComponent(usrLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usrInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usrLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usrInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pwdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        logo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logo1.setForeground(new java.awt.Color(231, 231, 231));
        logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/images/logo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(393, Short.MAX_VALUE)
                .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(496, 496, 496))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(561, 561, 561)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(619, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            new Login_Form().setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        
        if (usrInput1.getText().equals("") || usrInput.getText().equals("") || pwdInput.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Field can't be empty!");
        }
        if (usrInput.getText().equals(pwdInput.getText())) {
            try {
                Connection con = Database.getConnection();
                PreparedStatement st = con.prepareStatement("SELECT * FROM user WHERE username = '"+usrInput1.getText()+"';");
                ResultSet rs = st.executeQuery();
                
                if(rs.next()){
                    //JOptionPane.showMessageDialog(this, "User ditemukan");
                    try {
                        User.ChangePassword(usrInput1.getText(), usrInput.getText());
                        JOptionPane.showMessageDialog(this, "Change Password successful!");
                        try {
                            new Login_Form().setVisible(true);
                            this.setVisible(false);
                        } catch (Exception ex) {
                            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(ForgotPassword_Form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(this, "User tidak ditemukan");
                }
                
                
                /**/
            } catch (SQLException ex) {
                Logger.getLogger(ForgotPassword_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginForm;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel logo1;
    private javax.swing.JTextField pwdInput;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JTextField usrInput;
    private javax.swing.JTextField usrInput1;
    private javax.swing.JLabel usrLabel;
    private javax.swing.JLabel usrLabel1;
    // End of variables declaration//GEN-END:variables
}