/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class SignIn extends javax.swing.JFrame {
    public PreparedStatement pstmt = null;
    public ResultSet rs;
    Connection cn = koneksi.Koneksi.Koneksi();

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
    }
    
    private boolean validasi(String un, String pss) {
        try {
            String sql = "SELECT * FROM user WHERE username=? AND password=?";
            
            pstmt = cn.prepareStatement(sql);
            pstmt.setString(1, un);
            pstmt.setString(2, pss);
            
            rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            return false;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        inputPass = new javax.swing.JPasswordField();
        btnSignIn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        toSignUp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel_Minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(995, 575));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(187, 55, 26));
        jPanel1.setMinimumSize(new java.awt.Dimension(995, 575));
        jPanel1.setPreferredSize(new java.awt.Dimension(995, 575));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 248, 217));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 200, 130, 20);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 248, 217));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 260, 120, 32);

        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(inputUsername);
        inputUsername.setBounds(520, 200, 240, 35);

        inputPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPassActionPerformed(evt);
            }
        });
        jPanel1.add(inputPass);
        inputPass.setBounds(520, 260, 240, 35);

        btnSignIn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(225, 112, 26));
        btnSignIn.setText("Sign In");
        btnSignIn.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        btnSignIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn);
        btnSignIn.setBounds(450, 370, 130, 30);

        jLabel3.setForeground(new java.awt.Color(255, 248, 217));
        jLabel3.setText("hasn't had an account?");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(400, 420, 181, 30);

        toSignUp.setForeground(new java.awt.Color(251, 147, 0));
        toSignUp.setText("Sign Up!");
        toSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toSignUpMouseClicked(evt);
            }
        });
        jPanel1.add(toSignUp);
        toSignUp.setBounds(570, 420, 60, 30);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 248, 217));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("WELCOME");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 30, 280, 66);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 248, 217));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Please Insert your Username and Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(270, 100, 460, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 995, 575);

        jPanel2.setBackground(new java.awt.Color(235, 168, 58));
        jPanel2.setPreferredSize(new java.awt.Dimension(360, 40));
        jPanel2.setLayout(null);

        jLabel_Close.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(170, 58, 58));
        jLabel_Close.setText("X");
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Close);
        jLabel_Close.setBounds(950, 10, 51, 40);

        jLabel_Minimize.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel_Minimize.setForeground(new java.awt.Color(170, 58, 58));
        jLabel_Minimize.setText("-");
        jLabel_Minimize.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Minimize);
        jLabel_Minimize.setBounds(920, 0, 30, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1000, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void toSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toSignUpMouseClicked
        // TODO add your handling code here:

        SiSu sisu = new SiSu();
        sisu.setVisible(true);
        dispose();

    }//GEN-LAST:event_toSignUpMouseClicked

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        try {
            String username = inputUsername.getText();
            String pass = new String (inputPass.getPassword());

            if (validasi(username, pass)){
                int idusr = rs.getInt("id");
                int ulevel = rs.getInt("user_level");
                String nama = rs.getString("nama");
                
                switch(ulevel){
                    case 1:
                    HomeUser user = new HomeUser(idusr, nama);
                    user.setVisible(true);
                    dispose();
                    break;
                    case 2:
                    String sql = "SELECT verified FROM host WHERE id_user=?";
                    PreparedStatement pst = cn.prepareStatement(sql);
                    pst.setInt(1, idusr);
                    ResultSet rsht = pst.executeQuery();
                    if (rsht.next()){
                        if ("Y".equals(rsht.getString("verified"))){
                            HomeHost host = new HomeHost(idusr);
                            host.setVisible(true);
                            dispose();
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Akun Anda belum terverifikasi");
                            break;
                        }
                    }
                    case 3:
                    Admin admin = new Admin();
                    admin.setVisible(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Login Gagal!");
            }
        } catch (Exception e){}
    }//GEN-LAST:event_btnSignInActionPerformed

    private void inputPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPassActionPerformed

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameActionPerformed

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked
    this.setState(1);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel toSignUp;
    // End of variables declaration//GEN-END:variables
}
