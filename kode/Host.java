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
//import tampilan.SignIn;

/**
 *
 * @author USER
 */
public class Host implements InterfaceAmbilData {
    public PreparedStatement pstmt = null;
    public ResultSet rs;
    Connection cn = koneksi.Koneksi.Koneksi();
   
    private String id_host, nama, foto, alamat, no_hp, email;
    private float rating;
    private double harga;
    
    public Host(){}
    
    public Host(String id_host, String nama, String foto, String alamat, String no_hp, String email, float rating, double harga) {
        this.id_host = id_host;
        this.nama = nama;
        this.foto = foto;
        this.alamat = alamat;
        this.no_hp = no_hp;
        this.email = email;
        this.harga = harga;
        this.rating = rating;
    }

    public String getId_host() {
        return id_host;
    }

    public String getNama() {
        return nama;
    }

    public String getFoto() {
        return foto;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public String getEmail() {
        return email;
    }

    public float getRating() {
        return rating;
    }

    public double getHarga() {
        return harga;
    }
    
    @Override
    public void ambilData(ArrayList<Host> dtlHst) {
        try {
            String sql = "SELECT h.id_host, u.nama, h.alamat, hh.no_hp, hh.email, hh.foto, hh.harga, sum(rr.rating)/count(rr.id_review_rating) AS rating FROM host h JOIN host_house hh ON h.id_host = hh.id_host JOIN user u ON h.id_user = u.id LEFT JOIN pesanan p ON p.id_host = h.id_host LEFT JOIN review_rating_host rr ON rr.id_pesanan = p.id_pesanan WHERE hh.terima_order = 'Y' GROUP BY h.id_host";
            
            pstmt = cn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                dtlHst.add(new Host(rs.getString("id_host"), rs.getString("nama"), rs.getString("foto"), rs.getString("alamat"), rs.getString("no_hp"), rs.getString("email"), rs.getFloat("rating"), rs.getDouble("harga")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Host.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
