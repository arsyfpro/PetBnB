/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kode;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tampilan.SignIn;

/**
 *
 * @author USER
 */
public class Host {
    public PreparedStatement pstmt = null;
    public ResultSet rs;
    Connection cn = koneksi.Koneksi.Koneksi();
   
    public String id_host, nama, gambar, alamat;
    
    public Host(){}
    
    public Host(String id_host, String nama, String gambar, String alamat) {
        this.id_host = id_host;
        this.nama = nama;
        this.gambar = gambar;
        this.alamat = alamat;
    }

    public String getId_host() {
        return id_host;
    }

    public String getNama() {
        return nama;
    }

    public String getGambar() {
        return gambar;
    }

    public String getAlamat() {
        return alamat;
    }

    public void ambilData(ArrayList<Host> dtlHst) {
        try {
            String sql = "SELECT * FROM host";
            
            pstmt = cn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                dtlHst.add(new Host(rs.getString("id_host"), rs.getString("nama_host"), rs.getString("gambar"), rs.getString("alamat")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
