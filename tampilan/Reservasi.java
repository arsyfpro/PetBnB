/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.time.Duration;
//import java.time.Instant;
import java.sql.*;
//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Reservasi extends javax.swing.JFrame {
    private double harga;
    private int id_user;
    private String id_host, nama, jenis, jenis_lain, umur, makanan, layanan, vchr, catatan;
    private Date cekin, cekout;
    private double total_final, total;
    /**
     * Creates new form ReservasiPenginapan
     * @param id_host
     * @param n
     * @param h
     * @param id_user
     */
    public Reservasi(String id_host, String n, double h, int id_user) {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(236,219,186));
        
        this.id_user = id_user;
        this.id_host = id_host;
        harga = h;
        
        nHost.setText(n);
        tgglCheckIn.setMinSelectableDate(new Date());
        btnPesan.setVisible(false);
    }

    private Reservasi() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(236,219,186));
        tgglCheckIn.setMinSelectableDate(new Date());
        btnPesan.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nHost = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputJenis = new javax.swing.JTextField();
        inputNama = new javax.swing.JTextField();
        inputMakanan = new javax.swing.JTextField();
        inputUmur = new javax.swing.JTextField();
        pilJenis = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tgglCheckOut = new com.toedter.calendar.JDateChooser();
        tgglCheckIn = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        pilLayanan = new javax.swing.JComboBox<>();
        TotalBiaya = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCekHarga = new javax.swing.JButton();
        btnPesan = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputCatatan = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        inputVoucher = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(995, 575));
        setPreferredSize(new java.awt.Dimension(995, 650));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 82, 75));
        jLabel1.setText("Reservasi Penginapan di");

        nHost.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        nHost.setForeground(new java.awt.Color(236, 82, 75));
        nHost.setText("namaHost");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 82, 75));
        jLabel2.setText("Nama Hewan");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 82, 75));
        jLabel3.setText("Jenis hewan");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 82, 75));
        jLabel4.setText("Makanan Favorit");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 82, 75));
        jLabel5.setText("Umur (tahun)");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 82, 75));
        jLabel6.setText("Tanggal Check-out");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 82, 75));
        jLabel7.setText("Tanggal Check-in");

        inputJenis.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        inputNama.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        inputMakanan.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        inputUmur.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        inputUmur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputUmurKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputUmurKeyTyped(evt);
            }
        });

        pilJenis.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        pilJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kucing", "Anjing", "Hamster", "Landak Mini", "Bunglon", "Ikan", "Ayam", "Pak Tua Jenkins", "Lainnya..." }));
        pilJenis.setPreferredSize(new java.awt.Dimension(96, 42));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(207, 0, 0));
        jLabel8.setText("*isi jika kamu memilih \"lainnya...\"");

        tgglCheckOut.setDateFormatString("dd-MM-yyyy");
        tgglCheckOut.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tgglCheckOut.setPreferredSize(new java.awt.Dimension(96, 42));

        tgglCheckIn.setDateFormatString("dd-MM-yyyy");
        tgglCheckIn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tgglCheckIn.setPreferredSize(new java.awt.Dimension(96, 42));
        tgglCheckIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tgglCheckInPropertyChange(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 82, 75));
        jLabel9.setText("Jenis layanan");

        pilLayanan.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        pilLayanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Premium", "Deluxe", "Pertalite" }));

        TotalBiaya.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TotalBiaya.setText("0");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(52, 79, 161));
        jLabel11.setText("Total");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setText("Rp");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel12.setText(",-");

        btnCekHarga.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        btnCekHarga.setForeground(new java.awt.Color(112, 129, 96));
        btnCekHarga.setText("Cek Harga");
        btnCekHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekHargaActionPerformed(evt);
            }
        });

        btnPesan.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        btnPesan.setForeground(new java.awt.Color(112, 129, 96));
        btnPesan.setText("Pesan");
        btnPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(236, 82, 75));
        jLabel13.setText("Catatan khusus (opsional)");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        inputCatatan.setColumns(20);
        inputCatatan.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        inputCatatan.setRows(5);
        jScrollPane1.setViewportView(inputCatatan);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(236, 82, 75));
        jLabel14.setText("Kode Voucher (jika ada)");

        inputVoucher.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(207, 0, 0));
        jLabel15.setText("*berlaku biaya tambahan per hari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nHost)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pilJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(inputUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputMakanan)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tgglCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tgglCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputVoucher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pilLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TotalBiaya)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel15))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCekHarga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesan)
                        .addGap(205, 205, 205))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nHost))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputJenis)
                        .addComponent(jLabel3)
                        .addComponent(pilJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pilLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tgglCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tgglCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotalBiaya)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(inputVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCekHarga)
                    .addComponent(btnPesan))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void tgglCheckInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tgglCheckInPropertyChange
        // TODO add your handling code here:
        Date date = tgglCheckIn.getDate();
        tgglCheckOut.setMinSelectableDate(date);
    }//GEN-LAST:event_tgglCheckInPropertyChange

    private void btnCekHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekHargaActionPerformed
        // TODO add your handling code here:
        nama = inputNama.getText();
        jenis = (String) pilJenis.getSelectedItem();
        jenis_lain = inputJenis.getText();
        umur = inputUmur.getText();
        makanan = inputMakanan.getText();
        catatan = inputCatatan.getText();
        layanan = (String) pilLayanan.getSelectedItem();
        vchr = inputVoucher.getText();
        cekin = tgglCheckIn.getDate();
        cekout = tgglCheckOut.getDate();
        int hari;
        
        if (nama.isEmpty() || umur.isEmpty() || makanan.isEmpty() || (cekin == null) || (cekout == null)) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!");
        } else {
            if (("Lainnya...".equals(jenis) && jenis_lain.isEmpty()) || (!"Lainnya...".equals(jenis) && !jenis_lain.isEmpty())) {
                JOptionPane.showMessageDialog(null, "Jenis hewan tidak valid!");
            } else {
                float potongan = 0;
                
                if ("Lainnya...".equals(jenis)) {
                    jenis = jenis_lain;
                }
                
                if (!vchr.isEmpty()) {
                    try {
                        ResultSet rs;
                        Connection cn = koneksi.Koneksi.Koneksi();
                        Statement st = cn.createStatement();
                        String sql = "SELECT * FROM voucher WHERE kode = '"+vchr+"'";
                        
                        rs = st.executeQuery(sql);
                        if (rs.next()) {
                            try {
                                ResultSet rs2;
                                Connection cn2 = koneksi.Koneksi.Koneksi();
                                Statement st2 = cn2.createStatement();
                                String sql2 = "SELECT count(id_pesanan) AS j_pakai FROM pesanan WHERE voucher = '"+vchr+"' AND id_user = "+id_user;
                                rs2 = st2.executeQuery(sql2);
                                
                                if (rs2.next()){
                                    if (rs2.getInt("j_pakai") == rs.getInt("pemakaian")) {
                                        JOptionPane.showMessageDialog(null, "Sudah melebihi batas pemakaian!");
                                    } else {
                                        potongan = rs.getFloat("potongan");
                                    }
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Kode voucher tidak valid!");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                int bt = 0;
                long difference = cekout.getTime() - cekin.getTime();
                hari = (int)(difference / 1000 / 60 / 60 / 24);
                
                if (hari == 0)
                    hari = 1;
                
                switch (layanan) {
                    case "Premium":
                        bt = 15000;
                        break;
                    case "Deluxe":
                        bt = 30000;
                        break;
                    case "Pertalite":
                        bt = 40000;
                        break;
                }
                
                if (potongan == 0) {
                    vchr = "N";
                    total = hari * harga + bt * hari;
                    TotalBiaya.setText(String.format("%,.2f", total));
                    btnPesan.setVisible(true);
                    total_final = total;
                } else {
                    total = hari * harga + bt * hari;
                    total_final = total - (total * potongan);
                    TotalBiaya.setText(String.format("%,.2f", total_final));
                    btnPesan.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnCekHargaActionPerformed

    private void inputUmurKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputUmurKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUmurKeyPressed

    private void inputUmurKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputUmurKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_inputUmurKeyTyped

    private void btnPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanActionPerformed
        // TODO add your handling code here:
        if (catatan.isEmpty())
            catatan = "-";
        
        SimpleDateFormat dtDB = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat jmDB = new SimpleDateFormat("HH:mm");
        
        String dtOr = dtDB.format(new Date());
        String jmOr = jmDB.format(new Date());
        
        String waktu = dtOr + " " + jmOr;
        
        String dtIn = dtDB.format(cekin);
        String dtOut = dtDB.format(cekout);
        
        try {
            Statement st;
            Connection cn = koneksi.Koneksi.Koneksi();
            String sql = "INSERT INTO pesanan (id_user,id_host,nama_hewan,jenis,umur,makanan_fav_hewan,catatan,layanan,check_in,check_out,voucher,total,total_bayar,waktu_pesan)"
                    + "VALUES('"+id_user+"','"+id_host+"','"+nama+"','"+jenis+"','"+umur+"','"+makanan+"','"+catatan+"','"+layanan+"','"+dtIn+"','"+dtOut+"','"+vchr+"','"+total+"','"+total_final+"','"+waktu+"')";
            
            st = cn.createStatement();
            st.execute(sql);
            
            SimpleDateFormat dcn = new SimpleDateFormat("dd MMMMM yyyy");
            String date = dcn.format(cekin);
            JOptionPane.showMessageDialog(null, "Reservasi Penginapan Anda berhasil!" + "\nSilakan datang ke alamat Host pada " + date);
            dispose();
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPesanActionPerformed

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
            java.util.logging.Logger.getLogger(Reservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalBiaya;
    private javax.swing.JButton btnCekHarga;
    private javax.swing.JButton btnPesan;
    private javax.swing.JTextArea inputCatatan;
    private javax.swing.JTextField inputJenis;
    private javax.swing.JTextField inputMakanan;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputUmur;
    private javax.swing.JTextField inputVoucher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nHost;
    private javax.swing.JComboBox<String> pilJenis;
    private javax.swing.JComboBox<String> pilLayanan;
    private com.toedter.calendar.JDateChooser tgglCheckIn;
    private com.toedter.calendar.JDateChooser tgglCheckOut;
    // End of variables declaration//GEN-END:variables

}
