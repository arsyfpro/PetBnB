/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

//import java.awt.Image;
//import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
//import javax.swing.filechooser.FileSystemView;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author ASUS
 */
public class HomeHost extends javax.swing.JFrame {
//    private ResultSet rs;
    private String nama_foto = "";
    private String id;
    private File file;
    private int idu;
    /**
     * Creates new form Host
     */
    private ResultSet ambilData(String id) {
        ResultSet prs = null;
        
        Connection cn = koneksi.Koneksi.Koneksi();
        try {
            String sql = "SELECT u.id, u.nama, h.alamat, hh.* FROM user u JOIN host h ON u.id = h.id_user JOIN host_house hh ON h.id_host = hh.id_host WHERE h.id_host='"+id+"'";
            PreparedStatement st = cn.prepareStatement(sql);
            
            prs = st.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(HomeHost.class.getName()).log(Level.SEVERE, null, ex);
        }

        return prs;
    }
    
    public HomeHost() {
        initComponents();
    }
    
    public HomeHost(int idu) {
        initComponents();
        ResultSet rs;
        this.idu = idu;
        
        try {
            Connection cn = koneksi.Koneksi.Koneksi();
            String sql = "SELECT id_host FROM host WHERE id_user="+idu;
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rsCekHost = pst.executeQuery();
            
            if (rsCekHost.next()) {
                id = rsCekHost.getString("id_host");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomeHost.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        rs = ambilData(id);
        
        try {
            if (rs.next()) {
                nama_foto = rs.getString("foto");
                
                if ("Y".equals(rs.getString("terima_order"))){
                    StatusHost.setText("Terima");
                } else {
                    StatusHost.setText("Tidak");
                }
                jLabel1.setText(rs.getString("nama"));
                NamaHost.setText(rs.getString("nama"));
                HPHost.setText(rs.getString("no_hp"));
                EmailHost.setText(rs.getString("email"));
                HargaHost.setText(rs.getString("harga"));
                AlamatHost.setText(rs.getString("alamat"));
                FotoHost.setIcon(new ImageIcon(getClass().getResource("/resource_image/"+nama_foto)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomeHost.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel2 = new javax.swing.JLabel();
        btnReview = new javax.swing.JLabel();
        btnReservasi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        HPHost = new javax.swing.JTextField();
        NamaHost = new javax.swing.JTextField();
        HargaHost = new javax.swing.JTextField();
        EmailHost = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AlamatHost = new javax.swing.JTextArea();
        terimaPesanan = new javax.swing.JComboBox<>();
        FotoHost = new javax.swing.JLabel();
        btnGanti = new javax.swing.JButton();
        StatusHost = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu Host");

        btnReview.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnReview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReview.setText("Review Kamu");
        btnReview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReviewMouseClicked(evt);
            }
        });

        btnReservasi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnReservasi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReservasi.setText("Reservasi Kamu");
        btnReservasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReservasiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReview, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnReservasi, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(199, 199, 199)
                .addComponent(btnReview)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(186, 186, 186)
                    .addComponent(btnReservasi)
                    .addContainerGap(357, Short.MAX_VALUE)))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Detail Penginapan ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Nama Penginapan");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Harga Inap per malam (Rp)");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Nama Penginapan");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("No HP");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setText("Terima Order");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setText("Foto");

        HPHost.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        HPHost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HPHostKeyTyped(evt);
            }
        });

        NamaHost.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        NamaHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaHostActionPerformed(evt);
            }
        });

        HargaHost.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        HargaHost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HargaHostKeyTyped(evt);
            }
        });

        EmailHost.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setText("Alamat");

        AlamatHost.setColumns(20);
        AlamatHost.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        AlamatHost.setRows(5);
        jScrollPane1.setViewportView(AlamatHost);

        terimaPesanan.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        terimaPesanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ya", "Tidak" }));

        btnGanti.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnGanti.setText("Ganti Foto");
        btnGanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGantiActionPerformed(evt);
            }
        });

        StatusHost.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("*status saat ini");

        btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(terimaPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(StatusHost, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(FotoHost, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnGanti))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnSimpan))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NamaHost)
                                            .addComponent(HPHost)
                                            .addComponent(EmailHost)
                                            .addComponent(HargaHost)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(35, 35, 35)))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NamaHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HPHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HargaHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(terimaPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusHost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FotoHost, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGanti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSimpan)
                        .addGap(35, 35, 35))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaHostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaHostActionPerformed

    private void btnGantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGantiActionPerformed
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser();
        j.setAcceptAllFileFilterUsed(false);
        j.setDialogTitle("Pilih Foto Tampilan");
        FileNameExtensionFilter restrict = new FileNameExtensionFilter("Gambar", "jpg", "jpeg");
        j.addChoosableFileFilter(restrict);
        
        int r = j.showOpenDialog(null);
            // if the user selects a file
        if (r == JFileChooser.APPROVE_OPTION) {
            file = new File(j.getSelectedFile().getAbsolutePath());
            nama_foto = j.getSelectedFile().getName();
            JOptionPane.showMessageDialog(null, "Foto berhasil dipilih. Silakan simpan dahulu untuk melihat perubahan");
//          String path = new File(".").getCanonicalPath();
//          FileUtils.copyFileToDirectory(file, new File(path+"/src/resource_image"));
        }
    }//GEN-LAST:event_btnGantiActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String nama = NamaHost.getText();
        String hp = HPHost.getText();
        String email = EmailHost.getText();
        String harga = HargaHost.getText();
        String alamat = AlamatHost.getText();
        String terima = (String) terimaPesanan.getSelectedItem();
        
        if ("Ya".equals(terima)) {
            terima = "Y";
        } else {
            terima = "N";
        }
        
        if (nama.isEmpty() || hp.isEmpty() || email.isEmpty() || harga.isEmpty() || alamat.isEmpty() || nama_foto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!");
        } else {
            try {
                ResultSet rs = ambilData(id);
                
                if (rs.next()) {
                    String idu = rs.getString("id");
                    String sql1 = "UPDATE user SET nama='"+nama+"' WHERE id='"+idu+"'";
                    String sql2 = "UPDATE host SET alamat='"+alamat+"' WHERE id_host='"+id+"'";
                    String sql3 = "UPDATE host_house SET no_hp='"+hp+"',email='"+email+"',foto='"+nama_foto+"',harga='"+harga+"',terima_order='"+terima+"' WHERE id_host='"+id+"'";
                    
                    Connection cn = koneksi.Koneksi.Koneksi();
                    
                    Statement st = cn.createStatement();
                    st.addBatch(sql1);
                    st.addBatch(sql2);
                    st.addBatch(sql3);
                    
                    st.executeBatch();
                    if (!nama_foto.equals(rs.getString("foto"))) {
                        String path = new File(".").getCanonicalPath();
                        FileUtils.copyFileToDirectory(file, new File(path+"/src/resource_image"));
                    }
                    
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
                    new HomeHost(this.idu).setVisible(true);
                    dispose();
                } else {
                    String sql = "INSERT INTO host_house (id_host,no_hp,email,foto,harga,terima_order)"
                            + "VALUES('"+id+"','"+hp+"','"+email+"','"+nama_foto+"','"+harga+"','"+terima+"')";
                    
                    Connection cn = koneksi.Koneksi.Koneksi();
                    Statement st = cn.createStatement();
                    st.execute(sql);
                    
                    String path = new File(".").getCanonicalPath();
                    FileUtils.copyFileToDirectory(file, new File(path+"/src/resource_image"));
                    
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan! Nama Host, dan Alamat Anda masih tetap saat pertama mendaftar");
                    
                    new HomeHost(this.idu).setVisible(true);
                    dispose();
                }
            } catch (SQLException | IOException ex) {
                Logger.getLogger(HomeHost.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void HPHostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HPHostKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_HPHostKeyTyped

    private void HargaHostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HargaHostKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_HargaHostKeyTyped

    private void btnReservasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasiMouseClicked
        // TODO add your handling code here:
        new RiwayatPesananHost(id).setVisible(true);
    }//GEN-LAST:event_btnReservasiMouseClicked

    private void btnReviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReviewMouseClicked
        // TODO add your handling code here:
        new ReviewCust(id).setVisible(true);
    }//GEN-LAST:event_btnReviewMouseClicked

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
            java.util.logging.Logger.getLogger(HomeHost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeHost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeHost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeHost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeHost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AlamatHost;
    private javax.swing.JTextField EmailHost;
    private javax.swing.JLabel FotoHost;
    private javax.swing.JTextField HPHost;
    private javax.swing.JTextField HargaHost;
    private javax.swing.JTextField NamaHost;
    private javax.swing.JLabel StatusHost;
    private javax.swing.JButton btnGanti;
    private javax.swing.JLabel btnReservasi;
    private javax.swing.JLabel btnReview;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> terimaPesanan;
    // End of variables declaration//GEN-END:variables

}
